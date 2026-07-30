package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 471. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator471 extends AbstractBaseCalculator {
    public BaseCalculator471() {
        super("base-fee-471", "Base Fee 471", BigDecimal.valueOf(7.6200), false);
    }
}
