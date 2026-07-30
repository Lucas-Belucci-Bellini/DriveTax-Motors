package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 214. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator214 extends AbstractVerifyCalculator {
    public VerifyCalculator214() {
        super("verify-check-214", "Verify Check 214", BigDecimal.valueOf(4.9400), true);
    }
}
