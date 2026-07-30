package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 241. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator241 extends AbstractBaseCalculator {
    public BaseCalculator241() {
        super("base-fee-241", "Base Fee 241", BigDecimal.valueOf(3.0200), false);
    }
}
