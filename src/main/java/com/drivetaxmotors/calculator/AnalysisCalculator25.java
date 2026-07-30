package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator25 extends AbstractAnalysisCalculator {
    public AnalysisCalculator25() {
        super("analysiscalculator25", "Analysis Metric 25", BigDecimal.valueOf(3.25), true);
    }
}
