package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator22 extends AbstractVerifyCalculator {
    public VerifyCalculator22() {
        super("verifycalculator22", "Verify Check 22", BigDecimal.valueOf(3.1), true);
    }
}
