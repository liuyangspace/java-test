package javaee.jdbc.data;

import java.time.Instant;
import java.time.LocalDate;

/**
 * A thin wrapper around a millisecond value that allows
 * JDBC to identify this as an SQL <code>DATE</code> value.
 * @see java.sql.Date
 */
public class Date extends java.sql.Date {

    public Date(int year, int month, int day) { super(year, month, day); }
    public Date(long date) { super(date); }

    public void setTime(long date) {super.setTime(date);}
    public String toString () {return super.toString();}

    public int getHours(){return super.getHours();}
    public int getMinutes(){return super.getMinutes();}
    public int getSeconds(){return super.getSeconds();}
    public void setHours(int i){super.setHours(i);}
    public void setMinutes(int i){super.setMinutes(i);}
    public void setSeconds(int i){super.setSeconds(i);}

    public static java.sql.Date valueOf(LocalDate date){return java.sql.Date.valueOf(date);}
    public static java.sql.Date valueOf(String s) {return java.sql.Date.valueOf(s);}
    public LocalDate toLocalDate(){return super.toLocalDate();}
    public Instant toInstant(){return super.toInstant();}

}
