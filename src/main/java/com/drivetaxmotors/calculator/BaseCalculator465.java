package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 465. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator465 extends AbstractBaseCalculator {
    public BaseCalculator465() {
        super("base-fee-465", "Base Fee 465", BigDecimal.valueOf(7.5000), false);
    }
}
