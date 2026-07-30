package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 265. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator265 extends AbstractBaseCalculator {
    public BaseCalculator265() {
        super("base-fee-265", "Base Fee 265", BigDecimal.valueOf(3.5000), false);
    }
}
