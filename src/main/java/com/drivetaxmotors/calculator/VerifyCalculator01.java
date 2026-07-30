package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

public class VerifyCalculator01 extends AbstractVerifyCalculator {
    public VerifyCalculator01() {
        super("verify-total-check", "Verify: Total Reconciliation", BigDecimal.valueOf(2.5), true);
    }
}
