package javaee.jdbc.data;

import java.time.Instant;
import java.time.LocalDateTime;

/**
 * A thin wrapper around {@code java.util.Date} that allows
 * the JDBC API to identify this as an SQL {@code TIMESTAMP} value.
 *
 * @see java.sql.Timestamp
 */
public class Timestamp extends java.sql.Timestamp{

    public Timestamp(int year, int month, int date, int hour, int minute, int second, int nano) { super(year, month, date, hour, minute, second, nano); }
    public Timestamp(long time) { super(time); }

    public void setTime(long time){ super.setTime(time); }
    public long getTime(){return super.getTime();}
    public int getNanos(){return super.getNanos();}
    public void setNanos(int n) {super.setNanos(n);}

    public boolean equals(java.sql.Timestamp ts) {return super.equals(ts);}
    public boolean equals(java.lang.Object ts){return super.equals(ts);}
    public boolean before(java.sql.Timestamp ts){return super.before(ts);}
    public boolean after(java.sql.Timestamp ts){return super.after(ts);}
    public int compareTo(java.sql.Timestamp ts) {return super.compareTo(ts);}
    public int compareTo(java.util.Date o) {return super.compareTo(o);}
    public int hashCode(){return super.hashCode();}

    public static java.sql.Timestamp valueOf(String s) {return java.sql.Timestamp.valueOf(s);}
    public static java.sql.Timestamp valueOf(LocalDateTime dateTime) {return java.sql.Timestamp.valueOf(dateTime);}
    public static java.sql.Timestamp from(Instant instant) {return java.sql.Timestamp.from(instant);}

    public Instant toInstant(){return super.toInstant();}

    public LocalDateTime toLocalDateTime() {return super.toLocalDateTime();}
    public String toString() {return super.toString();}

}
