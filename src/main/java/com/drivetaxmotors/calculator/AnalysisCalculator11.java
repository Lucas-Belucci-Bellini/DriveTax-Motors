package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator11 extends AbstractAnalysisCalculator {
    public AnalysisCalculator11() {
        super("analysiscalculator11", "Analysis Metric 11", BigDecimal.valueOf(2.55), true);
    }
}
