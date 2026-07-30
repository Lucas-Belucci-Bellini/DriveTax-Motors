package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 288. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator288 extends AbstractBaseCalculator {
    public BaseCalculator288() {
        super("base-fee-288", "Base Fee 288", BigDecimal.valueOf(3.9600), false);
    }
}
