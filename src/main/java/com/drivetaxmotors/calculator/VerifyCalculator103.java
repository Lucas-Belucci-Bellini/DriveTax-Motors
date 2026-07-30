package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 103. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator103 extends AbstractVerifyCalculator {
    public VerifyCalculator103() {
        super("verify-check-103", "Verify Check 103", BigDecimal.valueOf(3.8300), true);
    }
}
