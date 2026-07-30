package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 247. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator247 extends AbstractBaseCalculator {
    public BaseCalculator247() {
        super("base-fee-247", "Base Fee 247", BigDecimal.valueOf(3.1400), false);
    }
}
