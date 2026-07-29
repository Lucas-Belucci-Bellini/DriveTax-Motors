package com.drivetaxmotors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Controller
public class VendaCarroController {
    private static final BigDecimal TAX_RATE = BigDecimal.valueOf(25);

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calcular")
    public String calcular(@RequestParam(name = "valorBase", required = false, defaultValue = "0") String valorBaseParam,
                          Model model) {
        BigDecimal valorBase = parseDecimal(valorBaseParam);
        BigDecimal imposto = valorBase.multiply(TAX_RATE).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
        BigDecimal total = valorBase.add(imposto);

        model.addAttribute("valorBase", format(valorBase));
        model.addAttribute("imposto", format(imposto));
        model.addAttribute("total", format(total));
        model.addAttribute("taxRate", TAX_RATE.toPlainString());
        return "resultado";
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
