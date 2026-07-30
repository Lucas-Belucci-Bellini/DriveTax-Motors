package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

public class BaseCalculator30 extends AbstractBaseCalculator {
    public BaseCalculator30() {
        super("traffic-congestion-fee", "Traffic Congestion Fee", BigDecimal.valueOf(0.9), false);
    }
}
