package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 303. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator303 extends AbstractBaseCalculator {
    public BaseCalculator303() {
        super("base-fee-303", "Base Fee 303", BigDecimal.valueOf(4.2600), false);
    }
}
