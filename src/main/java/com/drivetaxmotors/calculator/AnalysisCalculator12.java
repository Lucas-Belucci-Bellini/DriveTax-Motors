package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator12 extends AbstractAnalysisCalculator {
    public AnalysisCalculator12() {
        super("analysiscalculator12", "Analysis Metric 12", BigDecimal.valueOf(2.6), true);
    }
}
