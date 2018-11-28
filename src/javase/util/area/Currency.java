package javase.util.area;

import java.io.Serializable;
import java.util.Locale;
import java.util.Set;

/**
 * Represents a currency. Currencies are identified by their ISO 4217 currency codes.
 *
 * @see java.util.Currency
 * @see java.math.BigDecimal
 */
public final class Currency implements Serializable {
    java.util.Currency $this;

    private Currency(){}

    public static java.util.Currency getInstance(String currencyCode) { return java.util.Currency.getInstance(currencyCode); }
    public static java.util.Currency getInstance(Locale locale) { return java.util.Currency.getInstance(locale); }
    public static Set<java.util.Currency> getAvailableCurrencies() { return java.util.Currency.getAvailableCurrencies(); }

    public String getCurrencyCode() { return $this.getCurrencyCode(); }
    public String getSymbol() { return $this.getSymbol(); }
    public String getSymbol(Locale locale) { return $this.getSymbol(locale); }
    public int getDefaultFractionDigits(){ return $this.getDefaultFractionDigits(); }
    public int getNumericCode(){ return $this.getNumericCode(); }
    public String getNumericCodeAsString() { return $this.getNumericCodeAsString(); }
    public String getDisplayName(){ return $this.getDisplayName(); }
    public String getDisplayName(Locale locale){ return $this.getDisplayName(locale); }

    public String toString(){ return $this.toString(); }
}
