package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 204. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator204 extends AbstractBaseCalculator {
    public BaseCalculator204() {
        super("base-fee-204", "Base Fee 204", BigDecimal.valueOf(2.2800), false);
    }
}
