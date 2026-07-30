package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 255. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator255 extends AbstractBaseCalculator {
    public BaseCalculator255() {
        super("base-fee-255", "Base Fee 255", BigDecimal.valueOf(3.3000), false);
    }
}
