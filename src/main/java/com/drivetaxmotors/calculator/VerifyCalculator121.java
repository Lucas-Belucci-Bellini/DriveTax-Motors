package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 121. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator121 extends AbstractVerifyCalculator {
    public VerifyCalculator121() {
        super("verify-check-121", "Verify Check 121", BigDecimal.valueOf(4.0100), true);
    }
}
