package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 96. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator96 extends AbstractVerifyCalculator {
    public VerifyCalculator96() {
        super("verify-check-96", "Verify Check 96", BigDecimal.valueOf(3.7600), true);
    }
}
