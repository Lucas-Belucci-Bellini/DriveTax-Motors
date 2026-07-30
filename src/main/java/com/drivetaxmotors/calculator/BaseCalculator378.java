package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 378. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator378 extends AbstractBaseCalculator {
    public BaseCalculator378() {
        super("base-fee-378", "Base Fee 378", BigDecimal.valueOf(5.7600), false);
    }
}
