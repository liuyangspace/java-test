package language.extension.time.calendar;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * The <code>Calendar</code> class is an abstract class that provides methods
 * for converting between a specific instant in time and a set of {@link
 * #fields calendar fields} such as <code>YEAR</code>, <code>MONTH</code>,
 * <code>DAY_OF_MONTH</code>, <code>HOUR</code>, and so on, and for
 * manipulating the calendar fields, such as getting the date of the next
 * week. An instant in time can be represented by a millisecond value that is
 * an offset from the <a id="Epoch"><em>Epoch</em></a>, January 1, 1970
 * 00:00:00.000 GMT (Gregorian).
 *
 * <pre>
 *     Calendar rightNow = Calendar.getInstance();
 * </pre>
 *
 * @see          java.lang.System#currentTimeMillis()
 * @see          Date
 * @see          GregorianCalendar
 * @see          TimeZone
 * @see          java.text.DateFormat
 */
public abstract class Calendar extends java.util.Calendar implements Serializable, Cloneable, Comparable<java.util.Calendar> {
    public static class Builder {
        java.util.Calendar.Builder $this;
        public Builder() { $this = new java.util.Calendar.Builder(); }
        public java.util.Calendar.Builder setInstant(long instant) { return $this.setInstant(instant); }

    }
}
