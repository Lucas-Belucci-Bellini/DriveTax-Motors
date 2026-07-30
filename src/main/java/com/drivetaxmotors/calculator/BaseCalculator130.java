package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 130. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator130 extends AbstractBaseCalculator {
    public BaseCalculator130() {
        super("base-fee-130", "Base Fee 130", BigDecimal.valueOf(0.8000), false);
    }
}
