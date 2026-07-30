package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator32 extends AbstractAnalysisCalculator {
    public AnalysisCalculator32() {
        super("analysiscalculator32", "Analysis Metric 32", BigDecimal.valueOf(3.6), true);
    }
}
