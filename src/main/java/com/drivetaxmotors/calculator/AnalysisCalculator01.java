package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

public class AnalysisCalculator01 extends AbstractAnalysisCalculator {
    public AnalysisCalculator01() {
        super("analysis-total-summary", "Analysis: Total Tax Summary", BigDecimal.valueOf(4.2), true);
    }
}
