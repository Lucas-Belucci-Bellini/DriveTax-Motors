package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 460. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator460 extends AbstractBaseCalculator {
    public BaseCalculator460() {
        super("base-fee-460", "Base Fee 460", BigDecimal.valueOf(7.4000), false);
    }
}
