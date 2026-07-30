package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 321. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator321 extends AbstractBaseCalculator {
    public BaseCalculator321() {
        super("base-fee-321", "Base Fee 321", BigDecimal.valueOf(4.6200), false);
    }
}
