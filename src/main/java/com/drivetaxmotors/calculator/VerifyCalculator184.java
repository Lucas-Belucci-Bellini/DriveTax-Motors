package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 184. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator184 extends AbstractVerifyCalculator {
    public VerifyCalculator184() {
        super("verify-check-184", "Verify Check 184", BigDecimal.valueOf(4.6400), true);
    }
}
