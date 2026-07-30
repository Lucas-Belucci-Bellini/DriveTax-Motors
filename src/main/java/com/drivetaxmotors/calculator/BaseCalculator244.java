package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 244. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator244 extends AbstractBaseCalculator {
    public BaseCalculator244() {
        super("base-fee-244", "Base Fee 244", BigDecimal.valueOf(3.0800), false);
    }
}
