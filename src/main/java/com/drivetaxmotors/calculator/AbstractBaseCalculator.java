package com.drivetaxmotors.calculator;

import com.drivetaxmotors.model.CalculationResult;
import com.drivetaxmotors.model.CalculatorStage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public abstract class AbstractBaseCalculator implements CalculatorStrategy {
    private final String id;
    private final String label;
    private final BigDecimal rate;
    private final boolean advanced;

    protected AbstractBaseCalculator(String id, String label, BigDecimal rate, boolean advanced) {
        this.id = id;
        this.label = label;
        this.rate = rate;
        this.advanced = advanced;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public CalculatorStage getStage() {
        return CalculatorStage.BASE;
    }

    public boolean isAdvanced() {
        return advanced;
    }

    public BigDecimal getRate() {
        return rate;
    }

    @Override
    public CalculationResult calculate(BigDecimal baseValue, Map<String, CalculationResult> baseResults, Map<String, CalculationResult> analysisResults) {
        BigDecimal taxValue = baseValue.multiply(rate).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
        return new CalculationResult(label, getStage(), baseValue, rate, taxValue, baseValue.add(taxValue));
    }
}
