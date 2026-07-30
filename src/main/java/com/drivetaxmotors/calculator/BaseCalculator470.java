package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 470. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator470 extends AbstractBaseCalculator {
    public BaseCalculator470() {
        super("base-fee-470", "Base Fee 470", BigDecimal.valueOf(7.6000), false);
    }
}
