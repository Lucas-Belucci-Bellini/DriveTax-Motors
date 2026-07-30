package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator28 extends AbstractVerifyCalculator {
    public VerifyCalculator28() {
        super("verifycalculator28", "Verify Check 28", BigDecimal.valueOf(3.4), true);
    }
}
