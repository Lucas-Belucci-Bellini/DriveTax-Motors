package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 162. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator162 extends AbstractBaseCalculator {
    public BaseCalculator162() {
        super("base-fee-162", "Base Fee 162", BigDecimal.valueOf(1.4400), false);
    }
}
