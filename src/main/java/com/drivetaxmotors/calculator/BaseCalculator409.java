package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 409. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator409 extends AbstractBaseCalculator {
    public BaseCalculator409() {
        super("base-fee-409", "Base Fee 409", BigDecimal.valueOf(6.3800), false);
    }
}
