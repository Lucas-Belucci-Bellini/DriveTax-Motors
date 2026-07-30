package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 454. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator454 extends AbstractBaseCalculator {
    public BaseCalculator454() {
        super("base-fee-454", "Base Fee 454", BigDecimal.valueOf(7.2800), false);
    }
}
