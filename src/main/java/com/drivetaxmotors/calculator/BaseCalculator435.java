package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 435. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator435 extends AbstractBaseCalculator {
    public BaseCalculator435() {
        super("base-fee-435", "Base Fee 435", BigDecimal.valueOf(6.9000), false);
    }
}
