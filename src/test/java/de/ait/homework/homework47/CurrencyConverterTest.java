package de.ait.homework.homework47;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {

    @Test
    void testConvertCurrencyValidConversion() {
        assertEquals(85, CurrencyConverter.convertCurrency(100, "USD", "EUR"));
        assertEquals(120, CurrencyConverter.convertCurrency(100, "EUR", "USD"));

    }

    @Test
    void testConvertCurrencyInvalidCurrencyCode() {
        assertThrows(IllegalArgumentException.class, () -> {
            CurrencyConverter.convertCurrency(100, "XXX", "EUR");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            CurrencyConverter.convertCurrency(100, "USD", "YYY");
        });
    }

    @Test
    void testConvertCurrencyWithZeroAmount() {
        assertEquals(0, CurrencyConverter.convertCurrency(0, "USD", "EUR"));
    }
}