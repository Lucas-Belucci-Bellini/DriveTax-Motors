package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 480. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator480 extends AbstractBaseCalculator {
    public BaseCalculator480() {
        super("base-fee-480", "Base Fee 480", BigDecimal.valueOf(7.8000), false);
    }
}
