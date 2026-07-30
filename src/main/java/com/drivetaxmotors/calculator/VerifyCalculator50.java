package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator50 extends AbstractVerifyCalculator {
    public VerifyCalculator50() {
        super("verifycalculator50", "Verify Check 50", BigDecimal.valueOf(4.5), true);
    }
}
