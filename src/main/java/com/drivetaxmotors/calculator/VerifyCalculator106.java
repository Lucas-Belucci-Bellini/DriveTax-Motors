package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 106. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator106 extends AbstractVerifyCalculator {
    public VerifyCalculator106() {
        super("verify-check-106", "Verify Check 106", BigDecimal.valueOf(3.8600), true);
    }
}
