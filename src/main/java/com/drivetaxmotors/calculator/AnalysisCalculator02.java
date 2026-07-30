package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

public class AnalysisCalculator02 extends AbstractAnalysisCalculator {
    public AnalysisCalculator02() {
        super("analysis-average-rate", "Analysis: Average Tax Rate", BigDecimal.valueOf(1.8), true);
    }
}
