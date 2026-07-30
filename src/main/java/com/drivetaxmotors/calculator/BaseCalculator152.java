package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 152. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator152 extends AbstractBaseCalculator {
    public BaseCalculator152() {
        super("base-fee-152", "Base Fee 152", BigDecimal.valueOf(1.2400), false);
    }
}
