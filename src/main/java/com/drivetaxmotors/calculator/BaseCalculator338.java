package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 338. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator338 extends AbstractBaseCalculator {
    public BaseCalculator338() {
        super("base-fee-338", "Base Fee 338", BigDecimal.valueOf(4.9600), false);
    }
}
