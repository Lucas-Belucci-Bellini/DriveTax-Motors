package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 164. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator164 extends AbstractBaseCalculator {
    public BaseCalculator164() {
        super("base-fee-164", "Base Fee 164", BigDecimal.valueOf(1.4800), false);
    }
}
