package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 225. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator225 extends AbstractBaseCalculator {
    public BaseCalculator225() {
        super("base-fee-225", "Base Fee 225", BigDecimal.valueOf(2.7000), false);
    }
}
