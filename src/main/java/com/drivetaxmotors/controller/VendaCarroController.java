package com.drivetaxmotors.controller;

import com.drivetaxmotors.model.CalculationResult;
import com.drivetaxmotors.service.CarCalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Controller
public class VendaCarroController {
    private final CarCalculatorService calculatorService;

    public VendaCarroController(CarCalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/")
    public String index(@RequestParam(value = "showAdvanced", required = false, defaultValue = "false") boolean showAdvanced,
                        Model model) {
        model.addAttribute("calculators", calculatorService.getCalculatorDefinitions(showAdvanced));
        model.addAttribute("showAdvanced", showAdvanced);
        return "index";
    }

    @PostMapping("/calcular")
    public String calcular(@RequestParam("calculatorId") String calculatorId,
                          @RequestParam(name = "valorBase", required = false, defaultValue = "0") String valorBaseParam,
                          Model model) {
        BigDecimal valorBase = parseDecimal(valorBaseParam);
        CalculationResult result = calculatorService.calculate(calculatorId, valorBase);

        model.addAttribute("result", result);
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
}
