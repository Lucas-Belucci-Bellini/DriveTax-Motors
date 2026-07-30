package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 98. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator98 extends AbstractVerifyCalculator {
    public VerifyCalculator98() {
        super("verify-check-98", "Verify Check 98", BigDecimal.valueOf(3.7800), true);
    }
}
