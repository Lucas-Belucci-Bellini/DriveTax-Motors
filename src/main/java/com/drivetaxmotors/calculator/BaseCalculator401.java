package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 401. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator401 extends AbstractBaseCalculator {
    public BaseCalculator401() {
        super("base-fee-401", "Base Fee 401", BigDecimal.valueOf(6.2200), false);
    }
}
