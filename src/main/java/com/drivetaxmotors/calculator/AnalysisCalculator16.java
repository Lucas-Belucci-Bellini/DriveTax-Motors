package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator16 extends AbstractAnalysisCalculator {
    public AnalysisCalculator16() {
        super("analysiscalculator16", "Analysis Metric 16", BigDecimal.valueOf(2.8), true);
    }
}
