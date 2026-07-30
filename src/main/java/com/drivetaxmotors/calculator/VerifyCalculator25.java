package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator25 extends AbstractVerifyCalculator {
    public VerifyCalculator25() {
        super("verifycalculator25", "Verify Check 25", BigDecimal.valueOf(3.25), true);
    }
}
