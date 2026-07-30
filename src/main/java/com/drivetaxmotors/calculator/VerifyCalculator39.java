package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator39 extends AbstractVerifyCalculator {
    public VerifyCalculator39() {
        super("verifycalculator39", "Verify Check 39", BigDecimal.valueOf(3.95), true);
    }
}
