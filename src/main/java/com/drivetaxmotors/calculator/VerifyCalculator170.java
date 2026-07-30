package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 170. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator170 extends AbstractVerifyCalculator {
    public VerifyCalculator170() {
        super("verify-check-170", "Verify Check 170", BigDecimal.valueOf(4.5000), true);
    }
}
