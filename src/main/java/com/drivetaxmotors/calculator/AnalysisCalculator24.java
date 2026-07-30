package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator24 extends AbstractAnalysisCalculator {
    public AnalysisCalculator24() {
        super("analysiscalculator24", "Analysis Metric 24", BigDecimal.valueOf(3.2), true);
    }
}
