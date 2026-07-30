package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 128. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator128 extends AbstractVerifyCalculator {
    public VerifyCalculator128() {
        super("verify-check-128", "Verify Check 128", BigDecimal.valueOf(4.0800), true);
    }
}
