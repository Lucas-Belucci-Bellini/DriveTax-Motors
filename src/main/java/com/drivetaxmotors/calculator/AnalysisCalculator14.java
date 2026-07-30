package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator14 extends AbstractAnalysisCalculator {
    public AnalysisCalculator14() {
        super("analysiscalculator14", "Analysis Metric 14", BigDecimal.valueOf(2.7), true);
    }
}
