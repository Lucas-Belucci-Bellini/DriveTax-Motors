package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 260. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator260 extends AbstractBaseCalculator {
    public BaseCalculator260() {
        super("base-fee-260", "Base Fee 260", BigDecimal.valueOf(3.4000), false);
    }
}
