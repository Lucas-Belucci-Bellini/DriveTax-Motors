package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 209. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator209 extends AbstractBaseCalculator {
    public BaseCalculator209() {
        super("base-fee-209", "Base Fee 209", BigDecimal.valueOf(2.3800), false);
    }
}
