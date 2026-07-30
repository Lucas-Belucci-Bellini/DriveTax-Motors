package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 329. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator329 extends AbstractBaseCalculator {
    public BaseCalculator329() {
        super("base-fee-329", "Base Fee 329", BigDecimal.valueOf(4.7800), false);
    }
}
