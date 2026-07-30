package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 172. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator172 extends AbstractVerifyCalculator {
    public VerifyCalculator172() {
        super("verify-check-172", "Verify Check 172", BigDecimal.valueOf(4.5200), true);
    }
}
