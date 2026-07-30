package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 317. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator317 extends AbstractBaseCalculator {
    public BaseCalculator317() {
        super("base-fee-317", "Base Fee 317", BigDecimal.valueOf(4.5400), false);
    }
}
