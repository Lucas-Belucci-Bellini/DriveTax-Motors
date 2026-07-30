package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 264. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator264 extends AbstractBaseCalculator {
    public BaseCalculator264() {
        super("base-fee-264", "Base Fee 264", BigDecimal.valueOf(3.4800), false);
    }
}
