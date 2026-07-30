package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 140. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator140 extends AbstractBaseCalculator {
    public BaseCalculator140() {
        super("base-fee-140", "Base Fee 140", BigDecimal.valueOf(1.0000), false);
    }
}
