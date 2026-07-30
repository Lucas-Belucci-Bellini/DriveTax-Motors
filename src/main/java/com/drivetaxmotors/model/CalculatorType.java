package com.drivetaxmotors.model;

public enum CalculatorType {
    CAR_SALE("car-sale", "Car Sale Tax", 25, false),
    LUXURY_VAT("luxury-vat", "Luxury Car VAT", 18, true),
    FREIGHT_FEE("freight-fee", "Freight Fee Rate", 8, true),
    INSURANCE_TAX("insurance-tax", "Insurance Tax", 12, true),
    REGISTRATION_RATE("registration-rate", "Registration Rate", 2, true);

    private final String id;
    private final String label;
    private final double rate;
    private final boolean advanced;

    CalculatorType(String id, String label, double rate, boolean advanced) {
        this.id = id;
        this.label = label;
        this.rate = rate;
        this.advanced = advanced;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public double getRate() {
        return rate;
    }

    public boolean isAdvanced() {
        return advanced;
    }
}
