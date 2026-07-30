package com.drivetaxmotors.calculator;

import com.drivetaxmotors.model.CalculationResult;
import com.drivetaxmotors.model.CalculatorStage;

import java.math.BigDecimal;
import java.util.Map;

public interface CalculatorStrategy {
    String getId();
    String getLabel();
    CalculatorStage getStage();
    boolean isAdvanced();
    CalculationResult calculate(BigDecimal baseValue, Map<String, CalculationResult> baseResults, Map<String, CalculationResult> analysisResults);
}
