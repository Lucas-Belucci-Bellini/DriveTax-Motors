package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 298. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator298 extends AbstractBaseCalculator {
    public BaseCalculator298() {
        super("base-fee-298", "Base Fee 298", BigDecimal.valueOf(4.1600), false);
    }
}
