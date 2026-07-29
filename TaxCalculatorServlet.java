package com.drivetaxmotors.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

@WebServlet(name = "TaxCalculatorServlet", urlPatterns = {"/calculate"})
public class TaxCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect(req.getContextPath() + "/car-calculator.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        BigDecimal price = parseDecimal(req.getParameter("price"));
        BigDecimal taxRate = parseDecimal(req.getParameter("taxRate"));
        BigDecimal insurance = parseDecimal(req.getParameter("insurance"));
        BigDecimal supplierFee = parseDecimal(req.getParameter("supplierFee"));

        BigDecimal baseTotal = price.add(insurance).add(supplierFee);
        BigDecimal taxAmount = baseTotal.multiply(taxRate).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
        BigDecimal totalWithTax = baseTotal.add(taxAmount);

        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">\n<head>\n<meta charset=\"UTF-8\">\n<title>DriveTax Motors - Results</title>\n<link rel=\"stylesheet\" href=\"css/styles.css\">\n</head>\n<body>\n<header>\n<h1>DriveTax Motors</h1>\n<nav>\n<a href=\"index.html\">Home</a> | <a href=\"car-calculator.html\">Calculator</a> | <a href=\"about.html\">About</a>\n</nav>\n</header>");
            out.println("<main>\n<section class=\"result-card\">\n<h2>Calculation Results</h2>\n<p><strong>Car base price:</strong> $" + format(price) + "</p>\n<p><strong>Insurance and fees:</strong> $" + format(insurance.add(supplierFee)) + "</p>\n<p><strong>Tax rate:</strong> " + format(taxRate) + "%</p>\n<p><strong>Tax amount:</strong> $" + format(taxAmount) + "</p>\n<p class=\"total-line\"><strong>Total with tax:</strong> $" + format(totalWithTax) + "</p>\n<a class=\"button\" href=\"car-calculator.html\">Run another calculation</a>\n</section>\n</main>");
            out.println("<footer>\n<p>&copy; 2026 DriveTax Motors</p>\n</footer>\n</body>\n</html>");
        }
    }

    private BigDecimal parseDecimal(String value) {
        if (value == null || value.isBlank()) {
            return BigDecimal.ZERO;
        }
        try {
            return new BigDecimal(value.trim()).setScale(2, RoundingMode.HALF_UP);
        } catch (NumberFormatException e) {
            return BigDecimal.ZERO;
        }
    }

    private String format(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_UP).toPlainString();
    }
}
