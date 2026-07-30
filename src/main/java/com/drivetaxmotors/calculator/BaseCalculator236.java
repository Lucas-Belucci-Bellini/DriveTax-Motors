package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 236. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator236 extends AbstractBaseCalculator {
    public BaseCalculator236() {
        super("base-fee-236", "Base Fee 236", BigDecimal.valueOf(2.9200), false);
    }
}
