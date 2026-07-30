package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 179. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator179 extends AbstractBaseCalculator {
    public BaseCalculator179() {
        super("base-fee-179", "Base Fee 179", BigDecimal.valueOf(1.7800), false);
    }
}
