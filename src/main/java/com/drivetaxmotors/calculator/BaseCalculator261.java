package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 261. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator261 extends AbstractBaseCalculator {
    public BaseCalculator261() {
        super("base-fee-261", "Base Fee 261", BigDecimal.valueOf(3.4200), false);
    }
}
