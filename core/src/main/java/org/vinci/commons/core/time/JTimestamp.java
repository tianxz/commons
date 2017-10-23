package org.vinci.commons.core.time;

import jodd.datetime.DateTimeStamp;
import jodd.datetime.JDateTime;
import jodd.datetime.JulianDateStamp;
import jodd.datetime.format.JdtFormat;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by XizeTian on 2017/10/23.
 */
public class JTimestamp extends JDateTime {
    public JTimestamp(int year, int month, int day, int hour, int minute, int second, int millisecond) {
        super(year, month, day, hour, minute, second, millisecond);
    }

    public JTimestamp(int year, int month, int day) {
        super(year, month, day);
    }

    public JTimestamp(long millis) {
        super(millis);
    }

    public JTimestamp() {
    }

    public JTimestamp(Calendar calendar) {
        super(calendar);
    }

    public JTimestamp(Date date) {
        super(date);
    }

    public JTimestamp(DateTimeStamp dts) {
        super(dts);
    }

    public JTimestamp(JulianDateStamp jds) {
        super(jds);
    }

    public JTimestamp(double jd) {
        super(jd);
    }

    public JTimestamp(String src) {
        super(src);
    }

    public JTimestamp(String src, String template) {
        super(src, template);
    }

    public JTimestamp(String src, JdtFormat jdtFormat) {
        super(src, jdtFormat);
    }

    @Override
    public String toString() {
        return String.valueOf(this.getTimeInMillis());
    }
}
