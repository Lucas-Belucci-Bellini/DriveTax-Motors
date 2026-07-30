package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 170. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator170 extends AbstractBaseCalculator {
    public BaseCalculator170() {
        super("base-fee-170", "Base Fee 170", BigDecimal.valueOf(1.6000), false);
    }
}
