package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 278. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator278 extends AbstractBaseCalculator {
    public BaseCalculator278() {
        super("base-fee-278", "Base Fee 278", BigDecimal.valueOf(3.7600), false);
    }
}
