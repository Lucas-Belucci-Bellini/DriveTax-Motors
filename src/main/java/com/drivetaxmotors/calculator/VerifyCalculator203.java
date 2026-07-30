package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 203. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator203 extends AbstractVerifyCalculator {
    public VerifyCalculator203() {
        super("verify-check-203", "Verify Check 203", BigDecimal.valueOf(4.8300), true);
    }
}
