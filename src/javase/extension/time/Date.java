package javase.extension.time;

import java.time.Instant;

/**
 * The class {@code Date} represents a specific instant in time, with millisecond precision.
 *
 * @see java.util.Date
 * @see java.text.DateFormat
 * @see java.util.Calendar
 * @see java.util.TimeZone
 * @see java.time.Instant
 */
public class Date extends java.util.Date{

    public Date(){super();}
    public Date(long date){super(date);}
    @Deprecated public Date(int year, int month, int date){super(year,month,date);}
    @Deprecated public Date(int year, int month, int date, int hrs, int min){super(year,month,date,hrs,min);}
    @Deprecated public Date(int year, int month, int date, int hrs, int min, int sec){super(year,month,date,hrs,min,sec);}
    @Deprecated public Date(String s){super(s);}

    public Object clone(){return super.clone();}

    @Deprecated public static long UTC(int year, int month, int date, int hrs, int min, int sec){return java.util.Date.UTC(year,month,date,hrs,min,sec);}
    @Deprecated public static long parse(String s) {return java.util.Date.parse(s);}

    @Deprecated public int getYear(){return super.getYear();}
    @Deprecated public void setYear(int year){super.setYear(year);}
    @Deprecated public int getMonth(){return super.getMonth();}
    @Deprecated public void setMonth(int month){super.setMonth(month);}
    @Deprecated public int getDate(){return super.getDate();}
    @Deprecated public void setDate(int date){super.setDate(date);}
    @Deprecated public int getDay(){return super.getDay();}
    @Deprecated public int getHours(){return super.getHours();}
    @Deprecated public void setHours(int hours){super.setHours(hours);}
    @Deprecated public int getMinutes(){return super.getMinutes();}
    @Deprecated public void setMinutes(int minutes){super.setMinutes(minutes);}
    @Deprecated public int getSeconds(){return super.getSeconds();}
    @Deprecated public void setSeconds(int seconds){super.setSeconds(seconds);}

    public long getTime(){return super.getTime();}
    public void setTime(long time){super.setTime(time);}
    public boolean before(java.util.Date when){return super.before(when);}
    public boolean after(java.util.Date when){return super.after(when);}
    public boolean equals(Object obj){return super.equals(obj);}
    public int compareTo(java.util.Date anotherDate){return super.compareTo(anotherDate);}

    public int hashCode(){return super.hashCode();}
    public String toString(){return super.toString();}
    @Deprecated public String toLocaleString(){return super.toLocaleString();}
    @Deprecated public String toGMTString(){return super.toGMTString();}
    @Deprecated public int getTimezoneOffset(){return super.getTimezoneOffset();}
    public static java.util.Date from(Instant instant){return java.util.Date.from(instant);}
    public Instant toInstant(){return super.toInstant();}
}
