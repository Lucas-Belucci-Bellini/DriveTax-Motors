package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 250. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator250 extends AbstractBaseCalculator {
    public BaseCalculator250() {
        super("base-fee-250", "Base Fee 250", BigDecimal.valueOf(3.2000), false);
    }
}
