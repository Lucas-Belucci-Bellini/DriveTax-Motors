package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 453. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator453 extends AbstractBaseCalculator {
    public BaseCalculator453() {
        super("base-fee-453", "Base Fee 453", BigDecimal.valueOf(7.2600), false);
    }
}
