package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator60 extends AbstractVerifyCalculator {
    public VerifyCalculator60() {
        super("verifycalculator60", "Verify Check 60", BigDecimal.valueOf(5.0), true);
    }
}
