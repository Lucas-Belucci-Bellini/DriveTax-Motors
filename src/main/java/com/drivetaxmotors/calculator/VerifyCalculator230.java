package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 230. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator230 extends AbstractVerifyCalculator {
    public VerifyCalculator230() {
        super("verify-check-230", "Verify Check 230", BigDecimal.valueOf(5.1000), true);
    }
}
