package com.drivetaxmotors.model;

import java.math.BigDecimal;

public class CalculatorDefinition {
    private final String id;
    private final String label;
    private final BigDecimal rate;
    private final boolean advanced;
    private final CalculatorStage stage;

    public CalculatorDefinition(String id, String label, BigDecimal rate, boolean advanced, CalculatorStage stage) {
        this.id = id;
        this.label = label;
        this.rate = rate;
        this.advanced = advanced;
        this.stage = stage;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public boolean isAdvanced() {
        return advanced;
    }

    public CalculatorStage getStage() {
        return stage;
    }
}
