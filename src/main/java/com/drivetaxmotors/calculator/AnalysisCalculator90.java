package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage ANALYSIS calculator number 90. This calculator computes a unique analysis metric.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class AnalysisCalculator90 extends AbstractAnalysisCalculator {
    public AnalysisCalculator90() {
        super("analysis-metric-90", "Analysis Metric 90", BigDecimal.valueOf(3.6000), true);
    }
}
