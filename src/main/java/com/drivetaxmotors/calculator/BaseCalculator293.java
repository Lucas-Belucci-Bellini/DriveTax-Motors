package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 293. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator293 extends AbstractBaseCalculator {
    public BaseCalculator293() {
        super("base-fee-293", "Base Fee 293", BigDecimal.valueOf(4.0600), false);
    }
}
