package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 182. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator182 extends AbstractBaseCalculator {
    public BaseCalculator182() {
        super("base-fee-182", "Base Fee 182", BigDecimal.valueOf(1.8400), false);
    }
}
