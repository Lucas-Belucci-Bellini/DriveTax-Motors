package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 349. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator349 extends AbstractBaseCalculator {
    public BaseCalculator349() {
        super("base-fee-349", "Base Fee 349", BigDecimal.valueOf(5.1800), false);
    }
}
