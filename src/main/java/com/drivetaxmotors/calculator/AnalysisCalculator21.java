package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator21 extends AbstractAnalysisCalculator {
    public AnalysisCalculator21() {
        super("analysiscalculator21", "Analysis Metric 21", BigDecimal.valueOf(3.05), true);
    }
}
