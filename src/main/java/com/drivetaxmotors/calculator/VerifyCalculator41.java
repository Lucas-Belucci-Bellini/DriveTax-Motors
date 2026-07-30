package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator41 extends AbstractVerifyCalculator {
    public VerifyCalculator41() {
        super("verifycalculator41", "Verify Check 41", BigDecimal.valueOf(4.05), true);
    }
}
