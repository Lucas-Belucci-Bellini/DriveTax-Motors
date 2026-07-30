package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 195. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator195 extends AbstractVerifyCalculator {
    public VerifyCalculator195() {
        super("verify-check-195", "Verify Check 195", BigDecimal.valueOf(4.7500), true);
    }
}
