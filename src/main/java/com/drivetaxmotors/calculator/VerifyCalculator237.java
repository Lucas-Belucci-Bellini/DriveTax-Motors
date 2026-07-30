package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 237. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator237 extends AbstractVerifyCalculator {
    public VerifyCalculator237() {
        super("verify-check-237", "Verify Check 237", BigDecimal.valueOf(5.1700), true);
    }
}
