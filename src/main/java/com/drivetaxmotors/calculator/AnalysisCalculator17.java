package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator17 extends AbstractAnalysisCalculator {
    public AnalysisCalculator17() {
        super("analysiscalculator17", "Analysis Metric 17", BigDecimal.valueOf(2.85), true);
    }
}
