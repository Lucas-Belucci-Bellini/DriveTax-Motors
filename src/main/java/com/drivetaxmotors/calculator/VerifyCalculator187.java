package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 187. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator187 extends AbstractVerifyCalculator {
    public VerifyCalculator187() {
        super("verify-check-187", "Verify Check 187", BigDecimal.valueOf(4.6700), true);
    }
}
