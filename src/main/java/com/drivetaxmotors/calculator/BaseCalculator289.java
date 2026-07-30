package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 289. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator289 extends AbstractBaseCalculator {
    public BaseCalculator289() {
        super("base-fee-289", "Base Fee 289", BigDecimal.valueOf(3.9800), false);
    }
}
