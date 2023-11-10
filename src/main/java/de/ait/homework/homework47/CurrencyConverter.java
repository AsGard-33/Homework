package de.ait.homework.homework47;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static de.ait.homework.homework43.BankAccount.logger;


public class CurrencyConverter {

    private static final Map<String, Double> exchangeRates;

    static {
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD_EUR", 0.85);
        exchangeRates.put("EUR_USD", 1.2);

        exchangeRates.put("EUR_RUB",98.40);
        exchangeRates.put("RUB_EUR",0.001);

        exchangeRates.put("UAH_EUR",0.026);
        exchangeRates.put("EUR_UAH",38.55);


        exchangeRates.put("USD_UAH",36.10);
        exchangeRates.put("UAH_USD",0.028);

        exchangeRates.put("USD_RUB",92.18);
        exchangeRates.put("RUB_USD",0.11);

        exchangeRates.put("EUR_CNY",7.78);
        exchangeRates.put("CNY_EUR",0.13);
    }

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        String key = fromCurrency + "_" + toCurrency;
        if (!exchangeRates.containsKey(key)) {
            throw new IllegalArgumentException("Non-existent currency code " + key);
        }
        return amount * exchangeRates.get(key);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                logger.info("Enter the amount to convert: ");
                double amount = Double.parseDouble(scanner.nextLine());

                logger.info("Enter your original currency(USD, EUR,UAH,RUB,CNY): ");
                String fromCurrency = scanner.nextLine().toUpperCase();

                logger.info("Enter target currency (USD, EUR,UAH,RUB,CNY): ");
                String toCurrency = scanner.nextLine().toUpperCase();

                double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);
                logger.info("Conversion result: {} {}", String.format("%.2f", convertedAmount), toCurrency);

                break;
            } catch (NumberFormatException numberFormatException) {
                logger.error("Error: The entered value is not a numeric value.",numberFormatException);
            } catch (IllegalArgumentException illegalArgumentException) {
                logger.error("Error: Invalid argument", illegalArgumentException);
            } finally {
                logger.info("Search operation completed.");
            }
        }
        scanner.close();
    }
}
