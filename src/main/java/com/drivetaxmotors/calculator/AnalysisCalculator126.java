package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage ANALYSIS calculator number 126. This calculator computes a unique analysis metric.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class AnalysisCalculator126 extends AbstractAnalysisCalculator {
    public AnalysisCalculator126() {
        super("analysis-metric-126", "Analysis Metric 126", BigDecimal.valueOf(4.1400), true);
    }
}
