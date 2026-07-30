package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 254. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator254 extends AbstractBaseCalculator {
    public BaseCalculator254() {
        super("base-fee-254", "Base Fee 254", BigDecimal.valueOf(3.2800), false);
    }
}
