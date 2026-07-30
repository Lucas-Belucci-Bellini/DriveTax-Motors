package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator31 extends AbstractAnalysisCalculator {
    public AnalysisCalculator31() {
        super("analysiscalculator31", "Analysis Metric 31", BigDecimal.valueOf(3.55), true);
    }
}
