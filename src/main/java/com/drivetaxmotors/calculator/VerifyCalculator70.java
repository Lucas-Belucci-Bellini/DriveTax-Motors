package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator70 extends AbstractVerifyCalculator {
    public VerifyCalculator70() {
        super("verifycalculator70", "Verify Check 70", BigDecimal.valueOf(5.5), true);
    }
}
