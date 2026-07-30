package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 464. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator464 extends AbstractBaseCalculator {
    public BaseCalculator464() {
        super("base-fee-464", "Base Fee 464", BigDecimal.valueOf(7.4800), false);
    }
}
