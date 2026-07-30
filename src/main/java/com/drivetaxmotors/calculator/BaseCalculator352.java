package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 352. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator352 extends AbstractBaseCalculator {
    public BaseCalculator352() {
        super("base-fee-352", "Base Fee 352", BigDecimal.valueOf(5.2400), false);
    }
}
