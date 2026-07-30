package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 358. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator358 extends AbstractBaseCalculator {
    public BaseCalculator358() {
        super("base-fee-358", "Base Fee 358", BigDecimal.valueOf(5.3600), false);
    }
}
