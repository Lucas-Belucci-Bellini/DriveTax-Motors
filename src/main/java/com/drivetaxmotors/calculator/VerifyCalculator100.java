package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 100. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator100 extends AbstractVerifyCalculator {
    public VerifyCalculator100() {
        super("verify-check-100", "Verify Check 100", BigDecimal.valueOf(3.8000), true);
    }
}
