package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage ANALYSIS calculator number 125. This calculator computes a unique analysis metric.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class AnalysisCalculator125 extends AbstractAnalysisCalculator {
    public AnalysisCalculator125() {
        super("analysis-metric-125", "Analysis Metric 125", BigDecimal.valueOf(4.1250), true);
    }
}
