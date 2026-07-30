package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 90. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator90 extends AbstractVerifyCalculator {
    public VerifyCalculator90() {
        super("verify-check-90", "Verify Check 90", BigDecimal.valueOf(3.7000), true);
    }
}
