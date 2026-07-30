package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 325. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator325 extends AbstractBaseCalculator {
    public BaseCalculator325() {
        super("base-fee-325", "Base Fee 325", BigDecimal.valueOf(4.7000), false);
    }
}
