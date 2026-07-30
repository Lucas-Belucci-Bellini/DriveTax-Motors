package com.drivetaxmotors.calculator;

import com.drivetaxmotors.model.CalculationResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

/**
 * Advanced market-aware USD analysis
 * This analysis calculator uses live exchange data to estimate the impact of
 * currency fluctuation on the full tax and import cost mix.
 */
public class AnalysisCalculator41 extends AbstractAnalysisCalculator {
    public AnalysisCalculator41() {
        super("analysis-usd-rate-impact", "Analysis: USD Rate Impact", BigDecimal.valueOf(5.5), true);
    }

    @Override
    public CalculationResult calculate(BigDecimal baseValue, Map<String, CalculationResult> baseResults, Map<String, CalculationResult> analysisResults) {
        BigDecimal fxRate = MarketDataProvider.getExchangeRate("BRL", "USD");
        BigDecimal totalBase = baseResults.values().stream()
                .map(CalculationResult::getBaseValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal impact = totalBase.multiply(fxRate).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
        BigDecimal totalValue = totalBase.add(impact);
        return new CalculationResult(getLabel(), getStage(), totalBase, fxRate, impact, totalValue);
    }
}
