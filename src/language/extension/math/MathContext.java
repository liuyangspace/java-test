package language.extension.math;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Immutable objects which encapsulate the context settings which
 * describe certain rules for numerical operators, such as those
 * implemented by the {@link BigDecimal} class.
 *
 * @see java.math.MathContext
 */
public class MathContext implements Serializable
{
    // defaults for constructors
    private static final int DEFAULT_DIGITS = 9;
    private static final java.math.RoundingMode DEFAULT_ROUNDINGMODE = RoundingMode.HALF_UP;
    // Smallest values for digits (Maximum is Integer.MAX_VALUE)
    private static final int MIN_DIGITS = 0;
    // Serialization version
    private static final long serialVersionUID = 5579720004786848255L;

    // A {@code MathContext} object whose settings have the values required for unlimited precision arithmetic.
    public static final java.math.MathContext UNLIMITED = new java.math.MathContext(0, RoundingMode.HALF_UP);
    // A {@code MathContext} object with a precision setting matching the IEEE 754R Decimal32 format, 7 digits, and a rounding mode of {@link RoundingMode#HALF_EVEN HALF_EVEN}, the IEEE 754R default.
    public static final java.math.MathContext DECIMAL32 = new java.math.MathContext(7, RoundingMode.HALF_EVEN);
    public static final java.math.MathContext DECIMAL64 = new java.math.MathContext(16, RoundingMode.HALF_EVEN);
    public static final java.math.MathContext DECIMAL128 = new java.math.MathContext(34, RoundingMode.HALF_EVEN);

    // final int precision;
    // final RoundingMode roundingMode;
    public java.math.MathContext $this;

    public MathContext(int setPrecision) { this(setPrecision, DEFAULT_ROUNDINGMODE); }
    public MathContext(int setPrecision, RoundingMode setRoundingMode) {$this = new java.math.MathContext(setPrecision,setRoundingMode);}
    public MathContext(String val) {$this = new java.math.MathContext(val);}

    public int getPrecision() {
        return $this.getPrecision();
    }
    public RoundingMode getRoundingMode() {
        return $this.getRoundingMode();
    }
    public boolean equals(Object x){return $this.equals(x);}

    public int hashCode() {
        return this.hashCode();
    }
    public java.lang.String toString() {return this.toString();}

}
