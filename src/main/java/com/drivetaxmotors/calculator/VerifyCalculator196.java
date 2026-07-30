package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 196. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator196 extends AbstractVerifyCalculator {
    public VerifyCalculator196() {
        super("verify-check-196", "Verify Check 196", BigDecimal.valueOf(4.7600), true);
    }
}
