package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 380. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator380 extends AbstractBaseCalculator {
    public BaseCalculator380() {
        super("base-fee-380", "Base Fee 380", BigDecimal.valueOf(5.8000), false);
    }
}
