package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 80. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator80 extends AbstractVerifyCalculator {
    public VerifyCalculator80() {
        super("verify-check-80", "Verify Check 80", BigDecimal.valueOf(3.6000), true);
    }
}
