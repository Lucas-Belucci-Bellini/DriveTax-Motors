package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 129. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator129 extends AbstractVerifyCalculator {
    public VerifyCalculator129() {
        super("verify-check-129", "Verify Check 129", BigDecimal.valueOf(4.0900), true);
    }
}
