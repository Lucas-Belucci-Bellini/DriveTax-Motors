package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 201. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator201 extends AbstractBaseCalculator {
    public BaseCalculator201() {
        super("base-fee-201", "Base Fee 201", BigDecimal.valueOf(2.2200), false);
    }
}
