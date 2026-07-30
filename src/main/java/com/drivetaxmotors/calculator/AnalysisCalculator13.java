package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator13 extends AbstractAnalysisCalculator {
    public AnalysisCalculator13() {
        super("analysiscalculator13", "Analysis Metric 13", BigDecimal.valueOf(2.65), true);
    }
}
