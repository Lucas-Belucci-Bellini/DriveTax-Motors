package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator75 extends AbstractBaseCalculator {
    public BaseCalculator75() {
        super("basecalculator75", "Base Fee 75", BigDecimal.valueOf(3.0), false);
    }
}
