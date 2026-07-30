package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 323. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator323 extends AbstractBaseCalculator {
    public BaseCalculator323() {
        super("base-fee-323", "Base Fee 323", BigDecimal.valueOf(4.6600), false);
    }
}
