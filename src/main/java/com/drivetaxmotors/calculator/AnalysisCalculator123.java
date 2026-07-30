package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage ANALYSIS calculator number 123. This calculator computes a unique analysis metric.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class AnalysisCalculator123 extends AbstractAnalysisCalculator {
    public AnalysisCalculator123() {
        super("analysis-metric-123", "Analysis Metric 123", BigDecimal.valueOf(4.0950), true);
    }
}
