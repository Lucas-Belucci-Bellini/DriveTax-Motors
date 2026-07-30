package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator45 extends AbstractAnalysisCalculator {
    public AnalysisCalculator45() {
        super("analysiscalculator45", "Analysis Metric 45", BigDecimal.valueOf(4.25), true);
    }
}
