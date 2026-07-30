package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 266. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator266 extends AbstractBaseCalculator {
    public BaseCalculator266() {
        super("base-fee-266", "Base Fee 266", BigDecimal.valueOf(3.5200), false);
    }
}
