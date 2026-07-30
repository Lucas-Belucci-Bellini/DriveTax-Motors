package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 344. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator344 extends AbstractBaseCalculator {
    public BaseCalculator344() {
        super("base-fee-344", "Base Fee 344", BigDecimal.valueOf(5.0800), false);
    }
}
