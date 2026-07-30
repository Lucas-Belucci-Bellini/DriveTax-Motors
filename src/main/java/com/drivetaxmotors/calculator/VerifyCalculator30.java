package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator30 extends AbstractVerifyCalculator {
    public VerifyCalculator30() {
        super("verifycalculator30", "Verify Check 30", BigDecimal.valueOf(3.5), true);
    }
}
