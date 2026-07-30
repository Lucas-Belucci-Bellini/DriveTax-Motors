package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 158. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator158 extends AbstractBaseCalculator {
    public BaseCalculator158() {
        super("base-fee-158", "Base Fee 158", BigDecimal.valueOf(1.3600), false);
    }
}
