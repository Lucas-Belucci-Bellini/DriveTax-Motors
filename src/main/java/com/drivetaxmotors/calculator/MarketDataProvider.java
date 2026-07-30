package com.drivetaxmotors.calculator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Provides exchange rate and market price data for calculators.
 *
 * Calculators can use this class to fetch live currency rates from a
 * public API and to compute comparison factors used in advanced
 * import/price analysis.
 */
public class MarketDataProvider {
    private static final HttpClient CLIENT = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(5))
            .build();
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final Map<String, BigDecimal> CACHE = new ConcurrentHashMap<>();

    private MarketDataProvider() {
        // Utility class, no instances.
    }

    /**
     * Returns the latest exchange rate from one currency to another.
     * Uses exchangerate.host as a free public data source.
     */
    public static BigDecimal getExchangeRate(String fromCurrency, String toCurrency) {
        String cacheKey = fromCurrency + "_" + toCurrency;
        return CACHE.computeIfAbsent(cacheKey, key -> fetchRateFromApi(fromCurrency, toCurrency));
    }

    private static BigDecimal fetchRateFromApi(String fromCurrency, String toCurrency) {
        String apiUrl = String.format("https://api.exchangerate.host/latest?base=%s&symbols=%s", fromCurrency, toCurrency);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .timeout(Duration.ofSeconds(5))
                .GET()
                .build();

        try {
            HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
            JsonNode root = OBJECT_MAPPER.readTree(response.body());
            JsonNode rateNode = root.path("rates").path(toCurrency);
            if (rateNode.isNumber()) {
                return rateNode.decimalValue().setScale(6, RoundingMode.HALF_UP);
            }
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return BigDecimal.ONE;
    }

    /**
     * Returns a best-guess international car price factor for a country.
     * This factor is based on live FX data and a lightweight market adjustment.
     */
    public static BigDecimal getInternationalCarPriceFactor(String countryCode) {
        String currency = switch (countryCode.toUpperCase()) {
            case "USA" -> "USD";
            case "EUR" -> "EUR";
            case "GBP" -> "GBP";
            case "CAD" -> "CAD";
            case "JPY" -> "JPY";
            default -> "USD";
        };
        BigDecimal exchangeRate = getExchangeRate("BRL", currency);
        BigDecimal adjustment = switch (countryCode.toUpperCase()) {
            case "USA" -> BigDecimal.valueOf(1.10);
            case "EUR" -> BigDecimal.valueOf(1.08);
            case "GBP" -> BigDecimal.valueOf(1.12);
            case "CAD" -> BigDecimal.valueOf(1.05);
            case "JPY" -> BigDecimal.valueOf(1.15);
            default -> BigDecimal.ONE;
        };
        return exchangeRate.multiply(adjustment).setScale(4, RoundingMode.HALF_UP);
    }
}
