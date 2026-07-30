package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 174. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator174 extends AbstractVerifyCalculator {
    public VerifyCalculator174() {
        super("verify-check-174", "Verify Check 174", BigDecimal.valueOf(4.5400), true);
    }
}
