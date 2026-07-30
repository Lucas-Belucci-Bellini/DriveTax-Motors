package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 345. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator345 extends AbstractBaseCalculator {
    public BaseCalculator345() {
        super("base-fee-345", "Base Fee 345", BigDecimal.valueOf(5.1000), false);
    }
}
