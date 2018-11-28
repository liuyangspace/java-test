package javase.extension.system.thread.concurrent;

import java.time.temporal.ChronoUnit;

/**
 * @see java.util.concurrent.TimeUnit
 */
public enum TimeUnit {

    NANOSECONDS(TimeUnit.NANO_SCALE),
    MICROSECONDS(TimeUnit.MICRO_SCALE),
    MILLISECONDS(TimeUnit.MILLI_SCALE),
    SECONDS(TimeUnit.SECOND_SCALE),
    MINUTES(TimeUnit.MINUTE_SCALE),
    HOURS(TimeUnit.HOUR_SCALE),
    DAYS(TimeUnit.DAY_SCALE);

    // Scales as constants
    private static final long NANO_SCALE   = 1L;
    private static final long MICRO_SCALE  = 1000L * NANO_SCALE;
    private static final long MILLI_SCALE  = 1000L * MICRO_SCALE;
    private static final long SECOND_SCALE = 1000L * MILLI_SCALE;
    private static final long MINUTE_SCALE = 60L * SECOND_SCALE;
    private static final long HOUR_SCALE   = 60L * MINUTE_SCALE;
    private static final long DAY_SCALE    = 24L * HOUR_SCALE;

    private final java.util.concurrent.TimeUnit $this;

    private TimeUnit(long s) { $this=java.util.concurrent.TimeUnit.valueOf(String.valueOf(s)); }

    public long convert(long sourceDuration, java.util.concurrent.TimeUnit sourceUnit) {return $this.convert(sourceDuration,sourceUnit);}
    public long toNanos(long duration) {return $this.toNanos(duration);}
    public long toMicros(long duration) {return $this.toMicros(duration);}
    public long toMillis(long duration) {return $this.toMillis(duration);}
    public long toSeconds(long duration) {return $this.toSeconds(duration);}
    public long toMinutes(long duration) {return $this.toSeconds(duration);}
    public long toHours(long duration) {return $this.toSeconds(duration);}
    public long toDays(long duration) {return $this.toSeconds(duration);}

    public void timedWait(Object obj, long timeout) throws InterruptedException {$this.timedWait(obj,timeout);}
    public void timedJoin(Object obj, long timeout) throws InterruptedException {$this.timedWait(obj,timeout);}
    public void sleep(long timeout) throws InterruptedException {$this.sleep(timeout);}
    public ChronoUnit toChronoUnit() {return $this.toChronoUnit();}

    public static java.util.concurrent.TimeUnit of(ChronoUnit chronoUnit) {return java.util.concurrent.TimeUnit.of(chronoUnit);}

}
