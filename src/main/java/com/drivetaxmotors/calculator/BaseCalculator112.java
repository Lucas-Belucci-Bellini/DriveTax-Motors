package com.drivetaxmotors.calculator;

import com.drivetaxmotors.model.CalculationResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

/**
 * Advanced currency comparison using EUR rate
 * This calculator fetches the live exchange rate from BRL to EUR and uses
 * it to compare the base vehicle price with the selected foreign currency.
 */
public class BaseCalculator112 extends AbstractBaseCalculator {
    public BaseCalculator112() {
        super("base-eur-conversion", "Base Comparison EUR", BigDecimal.ZERO, true);
    }

    @Override
    public CalculationResult calculate(BigDecimal baseValue, Map<String, CalculationResult> baseResults, Map<String, CalculationResult> analysisResults) {
        BigDecimal currentRate = MarketDataProvider.getExchangeRate("BRL", "EUR");
        BigDecimal foreignValue = baseValue.divide(currentRate, 2, RoundingMode.HALF_UP);
        BigDecimal taxValue = foreignValue;
        BigDecimal totalValue = baseValue.add(foreignValue);
        return new CalculationResult(getLabel(), getStage(), baseValue, currentRate, taxValue, totalValue);
    }
}
