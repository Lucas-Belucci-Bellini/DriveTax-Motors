package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator65 extends AbstractVerifyCalculator {
    public VerifyCalculator65() {
        super("verifycalculator65", "Verify Check 65", BigDecimal.valueOf(5.25), true);
    }
}
