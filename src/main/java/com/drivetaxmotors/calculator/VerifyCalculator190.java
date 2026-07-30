package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 190. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator190 extends AbstractVerifyCalculator {
    public VerifyCalculator190() {
        super("verify-check-190", "Verify Check 190", BigDecimal.valueOf(4.7000), true);
    }
}
