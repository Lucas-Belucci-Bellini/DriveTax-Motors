package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 168. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator168 extends AbstractBaseCalculator {
    public BaseCalculator168() {
        super("base-fee-168", "Base Fee 168", BigDecimal.valueOf(1.5600), false);
    }
}
