package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 393. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator393 extends AbstractBaseCalculator {
    public BaseCalculator393() {
        super("base-fee-393", "Base Fee 393", BigDecimal.valueOf(6.0600), false);
    }
}
