package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator48 extends AbstractVerifyCalculator {
    public VerifyCalculator48() {
        super("verifycalculator48", "Verify Check 48", BigDecimal.valueOf(4.4), true);
    }
}
