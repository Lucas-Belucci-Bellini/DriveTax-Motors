package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator15 extends AbstractAnalysisCalculator {
    public AnalysisCalculator15() {
        super("analysiscalculator15", "Analysis Metric 15", BigDecimal.valueOf(2.75), true);
    }
}
