package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage ANALYSIS calculator number 105. This calculator computes a unique analysis metric.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class AnalysisCalculator105 extends AbstractAnalysisCalculator {
    public AnalysisCalculator105() {
        super("analysis-metric-105", "Analysis Metric 105", BigDecimal.valueOf(3.8250), true);
    }
}
