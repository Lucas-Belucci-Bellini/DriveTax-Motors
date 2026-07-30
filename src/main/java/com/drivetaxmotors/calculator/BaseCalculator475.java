package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 475. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator475 extends AbstractBaseCalculator {
    public BaseCalculator475() {
        super("base-fee-475", "Base Fee 475", BigDecimal.valueOf(7.7000), false);
    }
}
