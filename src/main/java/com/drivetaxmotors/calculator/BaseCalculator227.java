package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 227. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator227 extends AbstractBaseCalculator {
    public BaseCalculator227() {
        super("base-fee-227", "Base Fee 227", BigDecimal.valueOf(2.7400), false);
    }
}
