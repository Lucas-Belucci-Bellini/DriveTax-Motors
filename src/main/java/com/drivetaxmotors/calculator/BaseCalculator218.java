package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 218. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator218 extends AbstractBaseCalculator {
    public BaseCalculator218() {
        super("base-fee-218", "Base Fee 218", BigDecimal.valueOf(2.5600), false);
    }
}
