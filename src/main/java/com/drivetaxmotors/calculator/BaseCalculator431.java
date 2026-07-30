package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 431. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator431 extends AbstractBaseCalculator {
    public BaseCalculator431() {
        super("base-fee-431", "Base Fee 431", BigDecimal.valueOf(6.8200), false);
    }
}
