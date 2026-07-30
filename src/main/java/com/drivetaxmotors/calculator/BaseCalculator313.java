package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 313. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator313 extends AbstractBaseCalculator {
    public BaseCalculator313() {
        super("base-fee-313", "Base Fee 313", BigDecimal.valueOf(4.4600), false);
    }
}
