package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 97. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator97 extends AbstractVerifyCalculator {
    public VerifyCalculator97() {
        super("verify-check-97", "Verify Check 97", BigDecimal.valueOf(3.7700), true);
    }
}
