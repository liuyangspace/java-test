package javaee.jdbc.data;

import java.time.Instant;
import java.time.LocalTime;

/**
 * A thin wrapper around the <code>java.util.Date</code> class that allows the JDBC
 * API to identify this as an SQL <code>TIME</code> value.
 *
 * @see java.sql.Time
 */
public class Time extends java.sql.Time{

    public Time(int hour, int minute, int second) { super(hour, minute, second); }
    public Time(long time) { super(time); }

    public void setTime(long time){ super.setTime(time); }

    public static java.sql.Time valueOf(String s) { return java.sql.Time.valueOf(s); }
    public static java.sql.Time valueOf(LocalTime time) { return java.sql.Time.valueOf(time); }

    public int getYear(){return super.getYear();}
    public int getMonth(){return super.getMonth();}
    public int getDay(){return super.getDay();}
    public int getDate(){return super.getDate();}
    public void setYear(int i){super.setYear(i);}
    public void setMonth(int i){super.setMonth(i);}
    public void setDate(int i){super.setDate(i);}

    public String toString (){return super.toString();}
    public LocalTime toLocalTime(){return super.toLocalTime();}
    public Instant toInstant(){return super.toInstant();}
}
