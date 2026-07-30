package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage ANALYSIS calculator number 130. This calculator computes a unique analysis metric.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class AnalysisCalculator130 extends AbstractAnalysisCalculator {
    public AnalysisCalculator130() {
        super("analysis-metric-130", "Analysis Metric 130", BigDecimal.valueOf(4.2000), true);
    }
}
