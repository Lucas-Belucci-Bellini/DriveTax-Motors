package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 436. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator436 extends AbstractBaseCalculator {
    public BaseCalculator436() {
        super("base-fee-436", "Base Fee 436", BigDecimal.valueOf(6.9200), false);
    }
}
