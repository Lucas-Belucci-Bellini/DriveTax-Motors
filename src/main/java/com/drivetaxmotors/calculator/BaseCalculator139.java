package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 139. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator139 extends AbstractBaseCalculator {
    public BaseCalculator139() {
        super("base-fee-139", "Base Fee 139", BigDecimal.valueOf(0.9800), false);
    }
}
