package com.drivetaxmotors.calculator;

import com.drivetaxmotors.model.CalculationResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

/**
 * Advanced currency comparison using GBP rate
 * This calculator fetches the live exchange rate from BRL to GBP and uses
 * it to compare the base vehicle price with the selected foreign currency.
 */
public class BaseCalculator113 extends AbstractBaseCalculator {
    public BaseCalculator113() {
        super("base-gbp-conversion", "Base Comparison GBP", BigDecimal.ZERO, true);
    }

    @Override
    public CalculationResult calculate(BigDecimal baseValue, Map<String, CalculationResult> baseResults, Map<String, CalculationResult> analysisResults) {
        BigDecimal currentRate = MarketDataProvider.getExchangeRate("BRL", "GBP");
        BigDecimal foreignValue = baseValue.divide(currentRate, 2, RoundingMode.HALF_UP);
        BigDecimal taxValue = foreignValue;
        BigDecimal totalValue = baseValue.add(foreignValue);
        return new CalculationResult(getLabel(), getStage(), baseValue, currentRate, taxValue, totalValue);
    }
}
