package com.drivetaxmotors.service;

import com.drivetaxmotors.model.CalculationResult;
import com.drivetaxmotors.model.CalculatorDefinition;
import com.drivetaxmotors.model.CalculatorStage;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CarCalculatorService {
    private final List<CalculatorDefinition> registry = new ArrayList<>();

    public CarCalculatorService() {
        loadCalculatorDefinitions();
    }

    public List<CalculatorDefinition> getCalculatorDefinitions(boolean showAdvanced) {
        return registry.stream()
                .filter(definition -> !definition.isAdvanced() || showAdvanced)
                .collect(Collectors.toList());
    }

    public CalculationResult calculate(String calculatorId, BigDecimal baseValue) {
        CalculatorDefinition definition = findDefinition(calculatorId);
        if (definition == null) {
            throw new IllegalArgumentException("Calculator not found: " + calculatorId);
        }

        if (definition.getStage() == CalculatorStage.BASE) {
            return computeBaseCalculation(definition, baseValue);
        }

        Map<String, CalculationResult> baseResults = computeBaseResults(baseValue);
        if (definition.getStage() == CalculatorStage.ANALYSIS) {
            return computeAnalysisCalculation(definition, baseResults);
        }

        Map<String, CalculationResult> analysisResults = computeAnalysisResults(baseResults);
        return computeVerifyCalculation(definition, baseResults, analysisResults);
    }

    private CalculationResult computeBaseCalculation(CalculatorDefinition definition, BigDecimal baseValue) {
        BigDecimal taxValue = baseValue.multiply(definition.getRate()).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
        return new CalculationResult(definition.getLabel(), definition.getStage(), baseValue, definition.getRate(), taxValue, baseValue.add(taxValue));
    }

    private Map<String, CalculationResult> computeBaseResults(BigDecimal baseValue) {
        return registry.stream()
                .filter(definition -> definition.getStage() == CalculatorStage.BASE)
                .collect(Collectors.toMap(CalculatorDefinition::getId,
                        definition -> computeBaseCalculation(definition, baseValue)));
    }

    private CalculationResult computeAnalysisCalculation(CalculatorDefinition definition, Map<String, CalculationResult> baseResults) {
        BigDecimal sumTax = baseResults.values().stream()
                .map(CalculationResult::getTaxValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal totalBase = baseResults.values().stream()
                .map(CalculationResult::getBaseValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal analysisValue;
        switch (definition.getId()) {
            case "analysis-total-basic":
                analysisValue = sumTax;
                break;
            case "analysis-average-rate":
                analysisValue = totalBase.signum() == 0 ? BigDecimal.ZERO : sumTax.divide(totalBase, 4, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100));
                break;
            case "analysis-fee-total":
                analysisValue = sumTax.multiply(BigDecimal.valueOf(0.9));
                break;
            case "analysis-adjustment-check":
                analysisValue = sumTax.multiply(BigDecimal.valueOf(0.05));
                break;
            case "analysis-compliance-score":
                analysisValue = new BigDecimal(baseResults.size()).multiply(BigDecimal.valueOf(0.2));
                break;
            case "analysis-risk-index":
                analysisValue = sumTax.divide(BigDecimal.valueOf(10), 2, RoundingMode.HALF_UP);
                break;
            case "analysis-expected-deduction":
                analysisValue = sumTax.multiply(BigDecimal.valueOf(0.12));
                break;
            case "analysis-service-fee":
                analysisValue = sumTax.multiply(BigDecimal.valueOf(0.06));
                break;
            case "analysis-fallback-tax":
                analysisValue = sumTax.multiply(BigDecimal.valueOf(0.03));
                break;
            case "analysis-final-base":
                analysisValue = totalBase.add(sumTax);
                break;
            default:
                analysisValue = BigDecimal.ZERO;
                break;
        }
        return new CalculationResult(definition.getLabel(), definition.getStage(), totalBase, definition.getRate(), analysisValue, totalBase.add(analysisValue));
    }

    private Map<String, CalculationResult> computeAnalysisResults(Map<String, CalculationResult> baseResults) {
        return registry.stream()
                .filter(definition -> definition.getStage() == CalculatorStage.ANALYSIS)
                .collect(Collectors.toMap(CalculatorDefinition::getId,
                        definition -> computeAnalysisCalculation(definition, baseResults)));
    }

    private CalculationResult computeVerifyCalculation(CalculatorDefinition definition, Map<String, CalculationResult> baseResults, Map<String, CalculationResult> analysisResults) {
        BigDecimal sumAnalysisTax = analysisResults.values().stream()
                .map(CalculationResult::getTaxValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal sumBaseTax = baseResults.values().stream()
                .map(CalculationResult::getTaxValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal verifyValue;
        switch (definition.getId()) {
            case "verify-total-check":
                verifyValue = sumBaseTax.add(sumAnalysisTax);
                break;
            case "verify-cross-validation":
                verifyValue = sumAnalysisTax.subtract(sumBaseTax.multiply(BigDecimal.valueOf(0.1)));
                break;
            case "verify-final-surcharge":
                verifyValue = sumAnalysisTax.multiply(BigDecimal.valueOf(0.08));
                break;
            case "verify-net-liability":
                verifyValue = sumBaseTax.add(sumAnalysisTax).multiply(BigDecimal.valueOf(0.92));
                break;
            case "verify-balancing-factor":
                verifyValue = sumAnalysisTax.divide(BigDecimal.valueOf(2), 2, RoundingMode.HALF_UP);
                break;
            default:
                verifyValue = sumAnalysisTax.multiply(BigDecimal.valueOf(0.5));
                break;
        }

        BigDecimal baseTotal = baseResults.values().stream()
                .map(CalculationResult::getTotalValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return new CalculationResult(definition.getLabel(), definition.getStage(), baseTotal, definition.getRate(), verifyValue, baseTotal.add(verifyValue));
    }

    private CalculatorDefinition findDefinition(String calculatorId) {
        return registry.stream()
                .filter(definition -> definition.getId().equals(calculatorId))
                .findFirst()
                .orElse(null);
    }

    private void loadCalculatorDefinitions() {
        registry.add(new CalculatorDefinition("base-price", "Base Sale Price", BigDecimal.valueOf(0), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("state-sales-tax", "State Sales Tax", BigDecimal.valueOf(8.5), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("federal-motor-tax", "Federal Motor Tax", BigDecimal.valueOf(7.0), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("luxury-car-tax", "Luxury Car Tax", BigDecimal.valueOf(12.5), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("import-duty", "Import Duty", BigDecimal.valueOf(15.0), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("eco-emission-fee", "Eco Emission Fee", BigDecimal.valueOf(3.5), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("road-use-fee", "Road Use Fee", BigDecimal.valueOf(2.0), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("city-transport-levy", "City Transport Levy", BigDecimal.valueOf(1.8), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("environment-surcharge", "Environmental Surcharge", BigDecimal.valueOf(2.2), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("safety-inspection-fee", "Safety Inspection Fee", BigDecimal.valueOf(1.1), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("registration-fee", "Registration Fee", BigDecimal.valueOf(1.5), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("license-plate-fee", "License Plate Fee", BigDecimal.valueOf(0.9), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("vehicle-id-fee", "Vehicle Identification Fee", BigDecimal.valueOf(0.7), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("title-processing-fee", "Title Processing Fee", BigDecimal.valueOf(0.6), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("insurance-premium-fee", "Insurance Premium Fee", BigDecimal.valueOf(5.0), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("dealer-handling-fee", "Dealer Handling Fee", BigDecimal.valueOf(2.4), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("finance-processing-fee", "Finance Processing Fee", BigDecimal.valueOf(1.9), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("battery-disposal-tax", "Battery Disposal Tax", BigDecimal.valueOf(0.8), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("fuel-type-adjustment", "Fuel Type Adjustment", BigDecimal.valueOf(1.2), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("highway-toll-estimate", "Highway Toll Estimate", BigDecimal.valueOf(3.0), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("parking-tax-estimate", "Parking Tax Estimate", BigDecimal.valueOf(0.5), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("luxury-interior-levy", "Luxury Interior Levy", BigDecimal.valueOf(2.8), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("premium-warranty-fee", "Premium Warranty Fee", BigDecimal.valueOf(1.7), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("export-clearance-fee", "Export Clearance Fee", BigDecimal.valueOf(1.4), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("import-documentation-fee", "Import Documentation Fee", BigDecimal.valueOf(0.6), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("anti-theft-discount", "Anti-theft Device Discount", BigDecimal.valueOf(-0.5), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("resale-value-adjustment", "Resale Value Adjustment", BigDecimal.valueOf(0.3), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("overweight-tax", "Overweight Vehicle Tax", BigDecimal.valueOf(4.2), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("noise-pollution-surcharge", "Noise Pollution Surcharge", BigDecimal.valueOf(1.1), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("traffic-congestion-fee", "Traffic Congestion Fee", BigDecimal.valueOf(0.9), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("electric-vehicle-credit", "Electric Vehicle Credit", BigDecimal.valueOf(-2.0), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("hybrid-vehicle-tax", "Hybrid Vehicle Tax", BigDecimal.valueOf(2.3), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("gasoline-vehicle-fee", "Gasoline Vehicle Fee", BigDecimal.valueOf(3.4), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("diesel-vehicle-fee", "Diesel Vehicle Fee", BigDecimal.valueOf(4.0), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("co2-emission-penalty", "CO2 Emissions Penalty", BigDecimal.valueOf(1.8), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("dealer-commission-fee", "Dealer Commission Fee", BigDecimal.valueOf(2.5), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("roadside-assistance-fee", "Roadside Assistance Fee", BigDecimal.valueOf(1.3), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("extended-service-tax", "Extended Service Tax", BigDecimal.valueOf(1.6), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("premium-paint-fee", "Premium Paint Fee", BigDecimal.valueOf(0.8), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("advanced-safety-tax", "Advanced Safety Tax", BigDecimal.valueOf(1.9), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("driver-training-fee", "Driver Training Fee", BigDecimal.valueOf(0.7), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("document-handling-fee", "Document Handling Fee", BigDecimal.valueOf(0.5), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("warranty-insurance-tax", "Warranty Insurance Tax", BigDecimal.valueOf(2.0), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("auto-loan-fee", "Auto Loan Origination Fee", BigDecimal.valueOf(1.4), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("title-transfer-fee", "Title Transfer Fee", BigDecimal.valueOf(1.1), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("emission-certification-fee", "Emission Certification Fee", BigDecimal.valueOf(0.9), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("vehicle-inspection-tax", "Vehicle Inspection Tax", BigDecimal.valueOf(1.2), false, CalculatorStage.BASE));
        registry.add(new CalculatorDefinition("smart-connectivity-fee", "Smart Car Connectivity Fee", BigDecimal.valueOf(0.6), false, CalculatorStage.BASE));

        registry.add(new CalculatorDefinition("analysis-total-summary", "Analysis: Total Tax Summary", BigDecimal.ZERO, true, CalculatorStage.ANALYSIS));
        registry.add(new CalculatorDefinition("analysis-average-rate", "Analysis: Average Tax Rate", BigDecimal.ZERO, true, CalculatorStage.ANALYSIS));
        registry.add(new CalculatorDefinition("analysis-compliance-score", "Analysis: Compliance Score", BigDecimal.ZERO, true, CalculatorStage.ANALYSIS));
        registry.add(new CalculatorDefinition("analysis-risk-adjustment", "Analysis: Risk Adjustment", BigDecimal.ZERO, true, CalculatorStage.ANALYSIS));
        registry.add(new CalculatorDefinition("analysis-audit-variance", "Analysis: Audit Variance", BigDecimal.ZERO, true, CalculatorStage.ANALYSIS));
        registry.add(new CalculatorDefinition("analysis-net-liability", "Analysis: Net Liability Estimate", BigDecimal.ZERO, true, CalculatorStage.ANALYSIS));
        registry.add(new CalculatorDefinition("analysis-deduction-forecast", "Analysis: Deduction Forecast", BigDecimal.ZERO, true, CalculatorStage.ANALYSIS));
        registry.add(new CalculatorDefinition("analysis-service-charges", "Analysis: Service Charges", BigDecimal.ZERO, true, CalculatorStage.ANALYSIS));
        registry.add(new CalculatorDefinition("analysis-timing-adjustment", "Analysis: Timing Adjustment", BigDecimal.ZERO, true, CalculatorStage.ANALYSIS));
        registry.add(new CalculatorDefinition("analysis-final-base", "Analysis: Final Tax Base", BigDecimal.ZERO, true, CalculatorStage.ANALYSIS));

        for (int i = 1; i <= 20; i++) {
            registry.add(new CalculatorDefinition("verify-check-" + i,
                    "Verify: Final Check " + i,
                    BigDecimal.valueOf(0.5 + (i * 0.1)),
                    true,
                    CalculatorStage.VERIFY));
        }
    }
}
