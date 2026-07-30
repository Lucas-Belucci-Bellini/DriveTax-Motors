package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 145. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator145 extends AbstractBaseCalculator {
    public BaseCalculator145() {
        super("base-fee-145", "Base Fee 145", BigDecimal.valueOf(1.1000), false);
    }
}
