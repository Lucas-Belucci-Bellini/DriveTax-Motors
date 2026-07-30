package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 102. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator102 extends AbstractVerifyCalculator {
    public VerifyCalculator102() {
        super("verify-check-102", "Verify Check 102", BigDecimal.valueOf(3.8200), true);
    }
}
