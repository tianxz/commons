package org.vinci.commons.core.datetime;

import jodd.datetime.DateTimeStamp;
import jodd.datetime.JDateTime;
import jodd.datetime.JulianDateStamp;
import jodd.datetime.format.JdtFormat;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by XizeTian on 2017/10/23.
 */
public class JTime extends JDateTime {
    private final String TIME_NOT_MILLISECOND_FORMAT = "hh:mm:ss";

    public JTime() {
        super();
    }

    public JTime(int hour, int minute, int second, int millisecond) {
        super(1, 1, 1, hour, minute, second, millisecond);
    }

    public JTime(int hour, int minute, int second) {
        this(hour, minute, second, 0);
    }

    public JTime(int hour, int minute) {
        this(hour, minute, 0, 0);
    }

    public JTime(int hour) {
        this(hour, 0, 0, 0);
    }

    public JTime(String src) {
        super(src);
    }

    public JTime(String src, String template) {
        super(src, template);
    }

    public JTime(String src, JdtFormat jdtFormat) {
        super(src, jdtFormat);
    }

    public JTime(long millis) {
        super(millis);
    }

    public JTime(Calendar calendar) {
        super(calendar);
    }

    public JTime(Date date) {
        super(date);
    }

    public JTime(DateTimeStamp dts) {
        super(dts);
    }

    public JTime(JulianDateStamp jds) {
        super(jds);
    }

    public JTime(double jd) {
        super(jd);
    }

    @Override
    public String toString() {
        return super.toString(TIME_NOT_MILLISECOND_FORMAT);
    }
}
