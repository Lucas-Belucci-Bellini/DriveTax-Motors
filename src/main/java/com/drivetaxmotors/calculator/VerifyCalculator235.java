package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 235. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator235 extends AbstractVerifyCalculator {
    public VerifyCalculator235() {
        super("verify-check-235", "Verify Check 235", BigDecimal.valueOf(5.1500), true);
    }
}
