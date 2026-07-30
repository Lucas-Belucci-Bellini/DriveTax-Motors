package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator43 extends AbstractVerifyCalculator {
    public VerifyCalculator43() {
        super("verifycalculator43", "Verify Check 43", BigDecimal.valueOf(4.15), true);
    }
}
