package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 136. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator136 extends AbstractBaseCalculator {
    public BaseCalculator136() {
        super("base-fee-136", "Base Fee 136", BigDecimal.valueOf(0.9200), false);
    }
}
