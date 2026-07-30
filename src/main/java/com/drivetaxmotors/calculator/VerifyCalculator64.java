package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator64 extends AbstractVerifyCalculator {
    public VerifyCalculator64() {
        super("verifycalculator64", "Verify Check 64", BigDecimal.valueOf(5.2), true);
    }
}
