package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 151. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator151 extends AbstractBaseCalculator {
    public BaseCalculator151() {
        super("base-fee-151", "Base Fee 151", BigDecimal.valueOf(1.2200), false);
    }
}
