package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 331. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator331 extends AbstractBaseCalculator {
    public BaseCalculator331() {
        super("base-fee-331", "Base Fee 331", BigDecimal.valueOf(4.8200), false);
    }
}
