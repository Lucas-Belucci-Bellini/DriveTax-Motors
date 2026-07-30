package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 445. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator445 extends AbstractBaseCalculator {
    public BaseCalculator445() {
        super("base-fee-445", "Base Fee 445", BigDecimal.valueOf(7.1000), false);
    }
}
