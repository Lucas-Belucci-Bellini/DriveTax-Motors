package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 340. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator340 extends AbstractBaseCalculator {
    public BaseCalculator340() {
        super("base-fee-340", "Base Fee 340", BigDecimal.valueOf(5.0000), false);
    }
}
