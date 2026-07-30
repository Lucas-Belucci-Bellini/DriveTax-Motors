package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 286. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator286 extends AbstractBaseCalculator {
    public BaseCalculator286() {
        super("base-fee-286", "Base Fee 286", BigDecimal.valueOf(3.9200), false);
    }
}
