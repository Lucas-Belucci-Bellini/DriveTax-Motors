package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator22 extends AbstractAnalysisCalculator {
    public AnalysisCalculator22() {
        super("analysiscalculator22", "Analysis Metric 22", BigDecimal.valueOf(3.1), true);
    }
}
