package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator40 extends AbstractVerifyCalculator {
    public VerifyCalculator40() {
        super("verifycalculator40", "Verify Check 40", BigDecimal.valueOf(4.0), true);
    }
}
