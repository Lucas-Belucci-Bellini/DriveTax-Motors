package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator43 extends AbstractAnalysisCalculator {
    public AnalysisCalculator43() {
        super("analysiscalculator43", "Analysis Metric 43", BigDecimal.valueOf(4.15), true);
    }
}
