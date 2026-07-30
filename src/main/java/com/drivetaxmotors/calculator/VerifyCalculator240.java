package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 240. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator240 extends AbstractVerifyCalculator {
    public VerifyCalculator240() {
        super("verify-check-240", "Verify Check 240", BigDecimal.valueOf(5.2000), true);
    }
}
