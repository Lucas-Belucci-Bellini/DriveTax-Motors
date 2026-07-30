package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 155. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator155 extends AbstractBaseCalculator {
    public BaseCalculator155() {
        super("base-fee-155", "Base Fee 155", BigDecimal.valueOf(1.3000), false);
    }
}
