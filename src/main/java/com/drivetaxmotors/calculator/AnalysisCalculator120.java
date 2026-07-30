package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage ANALYSIS calculator number 120. This calculator computes a unique analysis metric.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class AnalysisCalculator120 extends AbstractAnalysisCalculator {
    public AnalysisCalculator120() {
        super("analysis-metric-120", "Analysis Metric 120", BigDecimal.valueOf(4.0500), true);
    }
}
