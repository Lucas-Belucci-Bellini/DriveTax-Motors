package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator18 extends AbstractAnalysisCalculator {
    public AnalysisCalculator18() {
        super("analysiscalculator18", "Analysis Metric 18", BigDecimal.valueOf(2.9), true);
    }
}
