package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 138. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator138 extends AbstractBaseCalculator {
    public BaseCalculator138() {
        super("base-fee-138", "Base Fee 138", BigDecimal.valueOf(0.9600), false);
    }
}
