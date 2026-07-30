package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator51 extends AbstractVerifyCalculator {
    public VerifyCalculator51() {
        super("verifycalculator51", "Verify Check 51", BigDecimal.valueOf(4.55), true);
    }
}
