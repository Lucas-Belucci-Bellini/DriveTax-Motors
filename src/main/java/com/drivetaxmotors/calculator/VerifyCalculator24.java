package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator24 extends AbstractVerifyCalculator {
    public VerifyCalculator24() {
        super("verifycalculator24", "Verify Check 24", BigDecimal.valueOf(3.2), true);
    }
}
