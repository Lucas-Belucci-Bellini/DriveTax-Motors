package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator32 extends AbstractVerifyCalculator {
    public VerifyCalculator32() {
        super("verifycalculator32", "Verify Check 32", BigDecimal.valueOf(3.6), true);
    }
}
