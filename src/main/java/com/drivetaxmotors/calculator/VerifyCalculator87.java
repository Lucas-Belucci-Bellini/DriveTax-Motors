package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 87. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator87 extends AbstractVerifyCalculator {
    public VerifyCalculator87() {
        super("verify-check-87", "Verify Check 87", BigDecimal.valueOf(3.6700), true);
    }
}
