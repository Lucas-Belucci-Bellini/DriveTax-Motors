package com.drivetaxmotors.model;

import java.math.BigDecimal;

public class CalculationResult {
    private final String calculatorName;
    private final BigDecimal baseValue;
    private final BigDecimal rate;
    private final BigDecimal taxValue;
    private final BigDecimal totalValue;

    public CalculationResult(String calculatorName, BigDecimal baseValue, BigDecimal rate, BigDecimal taxValue, BigDecimal totalValue) {
        this.calculatorName = calculatorName;
        this.baseValue = baseValue;
        this.rate = rate;
        this.taxValue = taxValue;
        this.totalValue = totalValue;
    }

    public String getCalculatorName() {
        return calculatorName;
    }

    public BigDecimal getBaseValue() {
        return baseValue;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public BigDecimal getTaxValue() {
        return taxValue;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }
}
