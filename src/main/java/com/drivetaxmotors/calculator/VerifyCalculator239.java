package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 239. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator239 extends AbstractVerifyCalculator {
    public VerifyCalculator239() {
        super("verify-check-239", "Verify Check 239", BigDecimal.valueOf(5.1900), true);
    }
}
