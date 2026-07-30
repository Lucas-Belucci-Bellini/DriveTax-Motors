package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator23 extends AbstractAnalysisCalculator {
    public AnalysisCalculator23() {
        super("analysiscalculator23", "Analysis Metric 23", BigDecimal.valueOf(3.15), true);
    }
}
