package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 337. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator337 extends AbstractBaseCalculator {
    public BaseCalculator337() {
        super("base-fee-337", "Base Fee 337", BigDecimal.valueOf(4.9400), false);
    }
}
