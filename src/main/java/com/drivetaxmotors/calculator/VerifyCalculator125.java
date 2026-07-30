package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 125. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator125 extends AbstractVerifyCalculator {
    public VerifyCalculator125() {
        super("verify-check-125", "Verify Check 125", BigDecimal.valueOf(4.0500), true);
    }
}
