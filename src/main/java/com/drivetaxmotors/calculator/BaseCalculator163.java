package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 163. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator163 extends AbstractBaseCalculator {
    public BaseCalculator163() {
        super("base-fee-163", "Base Fee 163", BigDecimal.valueOf(1.4600), false);
    }
}
