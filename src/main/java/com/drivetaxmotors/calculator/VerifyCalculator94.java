package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 94. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator94 extends AbstractVerifyCalculator {
    public VerifyCalculator94() {
        super("verify-check-94", "Verify Check 94", BigDecimal.valueOf(3.7400), true);
    }
}
