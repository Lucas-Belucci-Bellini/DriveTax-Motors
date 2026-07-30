package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator23 extends AbstractVerifyCalculator {
    public VerifyCalculator23() {
        super("verifycalculator23", "Verify Check 23", BigDecimal.valueOf(3.15), true);
    }
}
