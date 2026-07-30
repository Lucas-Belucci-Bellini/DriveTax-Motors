package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 424. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator424 extends AbstractBaseCalculator {
    public BaseCalculator424() {
        super("base-fee-424", "Base Fee 424", BigDecimal.valueOf(6.6800), false);
    }
}
