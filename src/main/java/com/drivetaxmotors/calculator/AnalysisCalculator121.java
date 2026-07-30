package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage ANALYSIS calculator number 121. This calculator computes a unique analysis metric.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class AnalysisCalculator121 extends AbstractAnalysisCalculator {
    public AnalysisCalculator121() {
        super("analysis-metric-121", "Analysis Metric 121", BigDecimal.valueOf(4.0650), true);
    }
}
