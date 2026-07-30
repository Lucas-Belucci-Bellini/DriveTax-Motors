package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 376. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator376 extends AbstractBaseCalculator {
    public BaseCalculator376() {
        super("base-fee-376", "Base Fee 376", BigDecimal.valueOf(5.7200), false);
    }
}
