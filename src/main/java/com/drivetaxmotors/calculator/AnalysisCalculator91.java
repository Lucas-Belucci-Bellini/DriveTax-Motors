package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage ANALYSIS calculator number 91. This calculator computes a unique analysis metric.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class AnalysisCalculator91 extends AbstractAnalysisCalculator {
    public AnalysisCalculator91() {
        super("analysis-metric-91", "Analysis Metric 91", BigDecimal.valueOf(3.6150), true);
    }
}
