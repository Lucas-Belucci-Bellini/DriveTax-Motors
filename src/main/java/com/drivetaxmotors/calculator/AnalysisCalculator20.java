package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator20 extends AbstractAnalysisCalculator {
    public AnalysisCalculator20() {
        super("analysiscalculator20", "Analysis Metric 20", BigDecimal.valueOf(3.0), true);
    }
}
