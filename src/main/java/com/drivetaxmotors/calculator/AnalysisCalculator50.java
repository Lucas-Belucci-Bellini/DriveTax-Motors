package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator50 extends AbstractAnalysisCalculator {
    public AnalysisCalculator50() {
        super("analysiscalculator50", "Analysis Metric 50", BigDecimal.valueOf(4.5), true);
    }
}
