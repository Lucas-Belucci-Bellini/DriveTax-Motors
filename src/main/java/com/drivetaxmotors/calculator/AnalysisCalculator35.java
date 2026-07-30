package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractAnalysisCalculator implementation and a configured rate.
 */
public class AnalysisCalculator35 extends AbstractAnalysisCalculator {
    public AnalysisCalculator35() {
        super("analysiscalculator35", "Analysis Metric 35", BigDecimal.valueOf(3.75), true);
    }
}
