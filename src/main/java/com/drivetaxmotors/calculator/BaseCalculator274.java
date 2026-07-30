package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 274. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator274 extends AbstractBaseCalculator {
    public BaseCalculator274() {
        super("base-fee-274", "Base Fee 274", BigDecimal.valueOf(3.6800), false);
    }
}
