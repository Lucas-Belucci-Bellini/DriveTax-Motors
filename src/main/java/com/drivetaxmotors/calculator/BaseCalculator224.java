package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 224. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator224 extends AbstractBaseCalculator {
    public BaseCalculator224() {
        super("base-fee-224", "Base Fee 224", BigDecimal.valueOf(2.6800), false);
    }
}
