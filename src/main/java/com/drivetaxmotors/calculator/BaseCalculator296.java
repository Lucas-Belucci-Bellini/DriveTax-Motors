package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 296. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator296 extends AbstractBaseCalculator {
    public BaseCalculator296() {
        super("base-fee-296", "Base Fee 296", BigDecimal.valueOf(4.1200), false);
    }
}
