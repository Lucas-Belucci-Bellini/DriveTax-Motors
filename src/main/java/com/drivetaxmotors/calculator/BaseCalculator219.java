package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 219. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator219 extends AbstractBaseCalculator {
    public BaseCalculator219() {
        super("base-fee-219", "Base Fee 219", BigDecimal.valueOf(2.5800), false);
    }
}
