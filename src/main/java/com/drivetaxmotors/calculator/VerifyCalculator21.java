package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator21 extends AbstractVerifyCalculator {
    public VerifyCalculator21() {
        super("verifycalculator21", "Verify Check 21", BigDecimal.valueOf(3.05), true);
    }
}
