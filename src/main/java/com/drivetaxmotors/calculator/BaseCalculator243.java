package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 243. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator243 extends AbstractBaseCalculator {
    public BaseCalculator243() {
        super("base-fee-243", "Base Fee 243", BigDecimal.valueOf(3.0600), false);
    }
}
