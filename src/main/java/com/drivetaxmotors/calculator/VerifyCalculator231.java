package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 231. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator231 extends AbstractVerifyCalculator {
    public VerifyCalculator231() {
        super("verify-check-231", "Verify Check 231", BigDecimal.valueOf(5.1100), true);
    }
}
