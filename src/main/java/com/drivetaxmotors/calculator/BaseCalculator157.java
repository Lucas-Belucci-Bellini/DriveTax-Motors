package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 157. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator157 extends AbstractBaseCalculator {
    public BaseCalculator157() {
        super("base-fee-157", "Base Fee 157", BigDecimal.valueOf(1.3400), false);
    }
}
