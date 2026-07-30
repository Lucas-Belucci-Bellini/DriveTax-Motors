package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 419. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator419 extends AbstractBaseCalculator {
    public BaseCalculator419() {
        super("base-fee-419", "Base Fee 419", BigDecimal.valueOf(6.5800), false);
    }
}
