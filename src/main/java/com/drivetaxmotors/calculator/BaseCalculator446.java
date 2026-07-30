package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 446. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator446 extends AbstractBaseCalculator {
    public BaseCalculator446() {
        super("base-fee-446", "Base Fee 446", BigDecimal.valueOf(7.1200), false);
    }
}
