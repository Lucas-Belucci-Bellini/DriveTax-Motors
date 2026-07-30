package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 148. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator148 extends AbstractBaseCalculator {
    public BaseCalculator148() {
        super("base-fee-148", "Base Fee 148", BigDecimal.valueOf(1.1600), false);
    }
}
