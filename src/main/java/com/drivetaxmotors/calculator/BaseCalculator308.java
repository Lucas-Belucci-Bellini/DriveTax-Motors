package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 308. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator308 extends AbstractBaseCalculator {
    public BaseCalculator308() {
        super("base-fee-308", "Base Fee 308", BigDecimal.valueOf(4.3600), false);
    }
}
