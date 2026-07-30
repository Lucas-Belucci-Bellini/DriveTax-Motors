package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 130. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator130 extends AbstractVerifyCalculator {
    public VerifyCalculator130() {
        super("verify-check-130", "Verify Check 130", BigDecimal.valueOf(4.1000), true);
    }
}
