package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator30 extends AbstractAnalysisCalculator {
    public AnalysisCalculator30() {
        super("analysiscalculator30", "Analysis Metric 30", BigDecimal.valueOf(3.5), true);
    }
}
