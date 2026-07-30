package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 234. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator234 extends AbstractBaseCalculator {
    public BaseCalculator234() {
        super("base-fee-234", "Base Fee 234", BigDecimal.valueOf(2.8800), false);
    }
}
