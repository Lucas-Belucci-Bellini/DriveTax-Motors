package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator63 extends AbstractVerifyCalculator {
    public VerifyCalculator63() {
        super("verifycalculator63", "Verify Check 63", BigDecimal.valueOf(5.15), true);
    }
}
