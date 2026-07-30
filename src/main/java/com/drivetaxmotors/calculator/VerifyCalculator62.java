package com.drivetaxmotors.calculator;

import com.drivetaxmotors.model.CalculationResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

/**
 * Advanced import benefit verification
 * This verification calculator checks whether an overseas order is advantageous
 * using the current exchange rate.
 */
public class VerifyCalculator62 extends AbstractVerifyCalculator {
    public VerifyCalculator62() {
        super("verify-eur-order-benefit", "Verify: EUR Order Benefit", BigDecimal.valueOf(3.5), true);
    }

    @Override
    public CalculationResult calculate(BigDecimal baseValue, Map<String, CalculationResult> baseResults, Map<String, CalculationResult> analysisResults) {
        BigDecimal fxRate = MarketDataProvider.getExchangeRate("BRL", "EUR");
        BigDecimal totalBase = baseResults.values().stream()
                .map(CalculationResult::getTotalValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal foreignEquivalent = totalBase.divide(fxRate, 2, RoundingMode.HALF_UP);
        BigDecimal verifyTax = foreignEquivalent.multiply(BigDecimal.valueOf(0.05)).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalValue = totalBase.add(verifyTax);
        return new CalculationResult(getLabel(), getStage(), totalBase, fxRate, verifyTax, totalValue);
    }
}
