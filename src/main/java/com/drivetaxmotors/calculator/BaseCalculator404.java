package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 404. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator404 extends AbstractBaseCalculator {
    public BaseCalculator404() {
        super("base-fee-404", "Base Fee 404", BigDecimal.valueOf(6.2800), false);
    }
}
