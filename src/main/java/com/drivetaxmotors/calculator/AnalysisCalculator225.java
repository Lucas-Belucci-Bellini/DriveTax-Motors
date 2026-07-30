package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage ANALYSIS calculator number 225. This calculator computes a unique analysis metric.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class AnalysisCalculator225 extends AbstractAnalysisCalculator {
    public AnalysisCalculator225() {
        super("analysis-metric-225", "Analysis Metric 225", BigDecimal.valueOf(5.6250), true);
    }
}
