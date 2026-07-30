package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 95. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator95 extends AbstractVerifyCalculator {
    public VerifyCalculator95() {
        super("verify-check-95", "Verify Check 95", BigDecimal.valueOf(3.7500), true);
    }
}
