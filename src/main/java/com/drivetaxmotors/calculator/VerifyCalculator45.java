package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator45 extends AbstractVerifyCalculator {
    public VerifyCalculator45() {
        super("verifycalculator45", "Verify Check 45", BigDecimal.valueOf(4.25), true);
    }
}
