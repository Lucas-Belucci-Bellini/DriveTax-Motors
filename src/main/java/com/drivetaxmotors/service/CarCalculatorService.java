package com.drivetaxmotors.service;

import com.drivetaxmotors.calculator.CalculatorRegistry;
import com.drivetaxmotors.calculator.CalculatorStrategy;
import com.drivetaxmotors.model.CalculationResult;
import com.drivetaxmotors.model.CalculatorDefinition;
import com.drivetaxmotors.model.CalculatorStage;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CarCalculatorService {
    private final List<CalculatorStrategy> registry;

    public CarCalculatorService() {
        this.registry = CalculatorRegistry.getAll();
    }

    public List<CalculatorDefinition> getCalculatorDefinitions(boolean showAdvanced) {
        return registry.stream()
                .filter(strategy -> !strategy.isAdvanced() || showAdvanced)
                .map(this::toDefinition)
                .collect(Collectors.toList());
    }

    public CalculationResult calculate(String calculatorId, BigDecimal baseValue) {
        CalculatorStrategy strategy = findStrategy(calculatorId);
        if (strategy == null) {
            throw new IllegalArgumentException("Calculator not found: " + calculatorId);
        }

        if (strategy.getStage() == CalculatorStage.BASE) {
            return strategy.calculate(baseValue, Collections.emptyMap(), Collections.emptyMap());
        }

        Map<String, CalculationResult> baseResults = computeBaseResults(baseValue);
        if (strategy.getStage() == CalculatorStage.ANALYSIS) {
            return strategy.calculate(baseValue, baseResults, Collections.emptyMap());
        }

        Map<String, CalculationResult> analysisResults = computeAnalysisResults(baseResults);
        return strategy.calculate(baseValue, baseResults, analysisResults);
    }

    private Map<String, CalculationResult> computeBaseResults(BigDecimal baseValue) {
        return registry.stream()
                .filter(strategy -> strategy.getStage() == CalculatorStage.BASE)
                .collect(Collectors.toMap(CalculatorStrategy::getId,
                        strategy -> strategy.calculate(baseValue, Collections.emptyMap(), Collections.emptyMap())));
    }

    private Map<String, CalculationResult> computeAnalysisResults(Map<String, CalculationResult> baseResults) {
        return registry.stream()
                .filter(strategy -> strategy.getStage() == CalculatorStage.ANALYSIS)
                .collect(Collectors.toMap(CalculatorStrategy::getId,
                        strategy -> strategy.calculate(BigDecimal.ZERO, baseResults, Collections.emptyMap())));
    }

    private CalculatorStrategy findStrategy(String calculatorId) {
        return registry.stream()
                .filter(strategy -> strategy.getId().equals(calculatorId))
                .findFirst()
                .orElse(null);
    }

    private CalculatorDefinition toDefinition(CalculatorStrategy strategy) {
        return new CalculatorDefinition(strategy.getId(), strategy.getLabel(), BigDecimal.ZERO, strategy.isAdvanced(), strategy.getStage());
    }
}
