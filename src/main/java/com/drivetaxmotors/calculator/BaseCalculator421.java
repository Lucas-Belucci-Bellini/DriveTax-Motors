package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 421. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator421 extends AbstractBaseCalculator {
    public BaseCalculator421() {
        super("base-fee-421", "Base Fee 421", BigDecimal.valueOf(6.6200), false);
    }
}
