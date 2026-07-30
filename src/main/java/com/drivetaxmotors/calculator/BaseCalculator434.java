package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 434. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator434 extends AbstractBaseCalculator {
    public BaseCalculator434() {
        super("base-fee-434", "Base Fee 434", BigDecimal.valueOf(6.8800), false);
    }
}
