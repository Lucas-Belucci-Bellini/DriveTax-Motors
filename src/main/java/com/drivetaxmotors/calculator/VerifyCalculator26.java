package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator26 extends AbstractVerifyCalculator {
    public VerifyCalculator26() {
        super("verifycalculator26", "Verify Check 26", BigDecimal.valueOf(3.3), true);
    }
}
