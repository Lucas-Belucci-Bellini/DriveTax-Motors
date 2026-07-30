package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 138. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator138 extends AbstractVerifyCalculator {
    public VerifyCalculator138() {
        super("verify-check-138", "Verify Check 138", BigDecimal.valueOf(4.1800), true);
    }
}
