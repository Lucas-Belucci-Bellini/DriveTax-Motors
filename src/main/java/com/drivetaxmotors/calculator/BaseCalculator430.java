package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 430. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator430 extends AbstractBaseCalculator {
    public BaseCalculator430() {
        super("base-fee-430", "Base Fee 430", BigDecimal.valueOf(6.8000), false);
    }
}
