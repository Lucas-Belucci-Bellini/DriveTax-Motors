package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 177. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator177 extends AbstractBaseCalculator {
    public BaseCalculator177() {
        super("base-fee-177", "Base Fee 177", BigDecimal.valueOf(1.7400), false);
    }
}
