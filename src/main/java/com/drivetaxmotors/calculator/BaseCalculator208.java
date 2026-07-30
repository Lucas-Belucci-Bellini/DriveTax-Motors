package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 208. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator208 extends AbstractBaseCalculator {
    public BaseCalculator208() {
        super("base-fee-208", "Base Fee 208", BigDecimal.valueOf(2.3600), false);
    }
}
