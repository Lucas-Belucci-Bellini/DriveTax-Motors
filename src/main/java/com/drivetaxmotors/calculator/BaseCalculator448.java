package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 448. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator448 extends AbstractBaseCalculator {
    public BaseCalculator448() {
        super("base-fee-448", "Base Fee 448", BigDecimal.valueOf(7.1600), false);
    }
}
