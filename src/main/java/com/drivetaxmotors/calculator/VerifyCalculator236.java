package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 236. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator236 extends AbstractVerifyCalculator {
    public VerifyCalculator236() {
        super("verify-check-236", "Verify Check 236", BigDecimal.valueOf(5.1600), true);
    }
}
