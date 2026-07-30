package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 165. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator165 extends AbstractBaseCalculator {
    public BaseCalculator165() {
        super("base-fee-165", "Base Fee 165", BigDecimal.valueOf(1.5000), false);
    }
}
