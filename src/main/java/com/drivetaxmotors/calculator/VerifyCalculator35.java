package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractVerifyCalculator implementation and a configured rate.
 */
public class VerifyCalculator35 extends AbstractVerifyCalculator {
    public VerifyCalculator35() {
        super("verifycalculator35", "Verify Check 35", BigDecimal.valueOf(3.75), true);
    }
}
