package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 353. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator353 extends AbstractBaseCalculator {
    public BaseCalculator353() {
        super("base-fee-353", "Base Fee 353", BigDecimal.valueOf(5.2600), false);
    }
}
