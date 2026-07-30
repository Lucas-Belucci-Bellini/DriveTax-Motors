package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 473. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator473 extends AbstractBaseCalculator {
    public BaseCalculator473() {
        super("base-fee-473", "Base Fee 473", BigDecimal.valueOf(7.6600), false);
    }
}
