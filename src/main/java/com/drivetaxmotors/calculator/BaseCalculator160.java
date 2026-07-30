package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 160. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator160 extends AbstractBaseCalculator {
    public BaseCalculator160() {
        super("base-fee-160", "Base Fee 160", BigDecimal.valueOf(1.4000), false);
    }
}
