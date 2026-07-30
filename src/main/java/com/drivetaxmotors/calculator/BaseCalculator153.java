package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 153. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator153 extends AbstractBaseCalculator {
    public BaseCalculator153() {
        super("base-fee-153", "Base Fee 153", BigDecimal.valueOf(1.2600), false);
    }
}
