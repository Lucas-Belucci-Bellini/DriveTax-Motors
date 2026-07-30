package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 304. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator304 extends AbstractBaseCalculator {
    public BaseCalculator304() {
        super("base-fee-304", "Base Fee 304", BigDecimal.valueOf(4.2800), false);
    }
}
