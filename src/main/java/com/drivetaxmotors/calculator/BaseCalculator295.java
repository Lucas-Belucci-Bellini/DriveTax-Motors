package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 295. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator295 extends AbstractBaseCalculator {
    public BaseCalculator295() {
        super("base-fee-295", "Base Fee 295", BigDecimal.valueOf(4.1000), false);
    }
}
