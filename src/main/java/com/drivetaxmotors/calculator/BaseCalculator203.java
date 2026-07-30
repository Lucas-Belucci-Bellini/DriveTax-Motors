package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 203. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator203 extends AbstractBaseCalculator {
    public BaseCalculator203() {
        super("base-fee-203", "Base Fee 203", BigDecimal.valueOf(2.2600), false);
    }
}
