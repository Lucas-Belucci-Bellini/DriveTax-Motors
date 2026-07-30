package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 105. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator105 extends AbstractVerifyCalculator {
    public VerifyCalculator105() {
        super("verify-check-105", "Verify Check 105", BigDecimal.valueOf(3.8500), true);
    }
}
