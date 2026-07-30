package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 146. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator146 extends AbstractBaseCalculator {
    public BaseCalculator146() {
        super("base-fee-146", "Base Fee 146", BigDecimal.valueOf(1.1200), false);
    }
}
