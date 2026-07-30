package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 386. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator386 extends AbstractBaseCalculator {
    public BaseCalculator386() {
        super("base-fee-386", "Base Fee 386", BigDecimal.valueOf(5.9200), false);
    }
}
