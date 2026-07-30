package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator42 extends AbstractVerifyCalculator {
    public VerifyCalculator42() {
        super("verifycalculator42", "Verify Check 42", BigDecimal.valueOf(4.1), true);
    }
}
