package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator40 extends AbstractAnalysisCalculator {
    public AnalysisCalculator40() {
        super("analysiscalculator40", "Analysis Metric 40", BigDecimal.valueOf(4.0), true);
    }
}
