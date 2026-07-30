package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator27 extends AbstractVerifyCalculator {
    public VerifyCalculator27() {
        super("verifycalculator27", "Verify Check 27", BigDecimal.valueOf(3.35), true);
    }
}
