package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 339. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator339 extends AbstractBaseCalculator {
    public BaseCalculator339() {
        super("base-fee-339", "Base Fee 339", BigDecimal.valueOf(4.9800), false);
    }
}
