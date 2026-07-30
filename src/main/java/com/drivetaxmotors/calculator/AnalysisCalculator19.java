package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator19 extends AbstractAnalysisCalculator {
    public AnalysisCalculator19() {
        super("analysiscalculator19", "Analysis Metric 19", BigDecimal.valueOf(2.95), true);
    }
}
