package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator31 extends AbstractVerifyCalculator {
    public VerifyCalculator31() {
        super("verifycalculator31", "Verify Check 31", BigDecimal.valueOf(3.55), true);
    }
}
