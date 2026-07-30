package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

public class BaseCalculator42 extends AbstractBaseCalculator {
    public BaseCalculator42() {
        super("document-handling-fee", "Document Handling Fee", BigDecimal.valueOf(0.5), false);
    }
}
