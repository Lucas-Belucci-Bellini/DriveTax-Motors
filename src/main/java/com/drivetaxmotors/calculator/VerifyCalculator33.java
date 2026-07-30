package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator33 extends AbstractVerifyCalculator {
    public VerifyCalculator33() {
        super("verifycalculator33", "Verify Check 33", BigDecimal.valueOf(3.65), true);
    }
}
