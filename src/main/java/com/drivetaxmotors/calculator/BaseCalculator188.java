package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 188. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator188 extends AbstractBaseCalculator {
    public BaseCalculator188() {
        super("base-fee-188", "Base Fee 188", BigDecimal.valueOf(1.9600), false);
    }
}
