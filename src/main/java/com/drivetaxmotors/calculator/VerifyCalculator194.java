package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 194. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator194 extends AbstractVerifyCalculator {
    public VerifyCalculator194() {
        super("verify-check-194", "Verify Check 194", BigDecimal.valueOf(4.7400), true);
    }
}
