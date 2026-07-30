package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 387. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator387 extends AbstractBaseCalculator {
    public BaseCalculator387() {
        super("base-fee-387", "Base Fee 387", BigDecimal.valueOf(5.9400), false);
    }
}
