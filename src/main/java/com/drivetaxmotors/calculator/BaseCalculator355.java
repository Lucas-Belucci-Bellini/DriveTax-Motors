package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 355. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator355 extends AbstractBaseCalculator {
    public BaseCalculator355() {
        super("base-fee-355", "Base Fee 355", BigDecimal.valueOf(5.3000), false);
    }
}
