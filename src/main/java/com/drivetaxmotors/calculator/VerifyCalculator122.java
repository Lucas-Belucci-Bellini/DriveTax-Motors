package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 122. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator122 extends AbstractVerifyCalculator {
    public VerifyCalculator122() {
        super("verify-check-122", "Verify Check 122", BigDecimal.valueOf(4.0200), true);
    }
}
