package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 388. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator388 extends AbstractBaseCalculator {
    public BaseCalculator388() {
        super("base-fee-388", "Base Fee 388", BigDecimal.valueOf(5.9600), false);
    }
}
