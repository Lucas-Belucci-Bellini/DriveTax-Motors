package com.drivetaxmotors.service;

import com.drivetaxmotors.model.CalculationResult;
import com.drivetaxmotors.model.CalculatorDefinition;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarCalculatorService {
    private final List<CalculatorDefinition> registry = new ArrayList<>();

    public CarCalculatorService() {
        loadCalculatorDefinitions();
    }

    public List<CalculatorDefinition> getCalculatorDefinitions() {
        return registry;
    }

    public CalculationResult calculate(String calculatorId, BigDecimal baseValue) {
        CalculatorDefinition definition = findDefinition(calculatorId);
        if (definition == null) {
            throw new IllegalArgumentException("Calculator not found: " + calculatorId);
        }

        BigDecimal taxValue = baseValue.multiply(definition.getRate()).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
        BigDecimal totalValue = baseValue.add(taxValue);

        return new CalculationResult(definition.getLabel(), baseValue, definition.getRate(), taxValue, totalValue);
    }

    private CalculatorDefinition findDefinition(String calculatorId) {
        return registry.stream()
                .filter(definition -> definition.getId().equals(calculatorId))
                .findFirst()
                .orElse(null);
    }

    private void loadCalculatorDefinitions() {
        registry.add(new CalculatorDefinition("car-sale", "Car Sale Tax", BigDecimal.valueOf(25), false));
        registry.add(new CalculatorDefinition("luxury-vat", "Luxury Car VAT", BigDecimal.valueOf(18), true));
        registry.add(new CalculatorDefinition("freight-fee", "Freight Fee Rate", BigDecimal.valueOf(8), true));
        registry.add(new CalculatorDefinition("insurance-tax", "Insurance Tax", BigDecimal.valueOf(12), true));
        registry.add(new CalculatorDefinition("registration-rate", "Registration Rate", BigDecimal.valueOf(2), true));

        for (int i = 1; i <= 75; i++) {
            registry.add(new CalculatorDefinition("internal-tax-" + i,
                    "Internal calculator " + i,
                    BigDecimal.valueOf(1 + (i % 10)),
                    true));
        }
    }
}
