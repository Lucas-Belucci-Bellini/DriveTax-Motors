package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 405. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator405 extends AbstractBaseCalculator {
    public BaseCalculator405() {
        super("base-fee-405", "Base Fee 405", BigDecimal.valueOf(6.3000), false);
    }
}
