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
public class JDate extends JDateTime {
    private final String FORMAT = "YYYY-MM-DD";

    public JDate(int year, int month, int day) {
        super(year, month, day);
    }

    public JDate(long millis) {
        super(millis);
    }

    public JDate() {
    }

    public JDate(Calendar calendar) {
        super(calendar);
    }

    public JDate(Date date) {
        super(date);
    }

    public JDate(DateTimeStamp dts) {
        super(dts);
    }

    public JDate(JulianDateStamp jds) {
        super(jds);
    }

    public JDate(double jd) {
        super(jd);
    }

    public JDate(String src) {
        super(src);
    }

    public JDate(String src, String template) {
        super(src, template);
    }

    public JDate(String src, JdtFormat jdtFormat) {
        super(src, jdtFormat);
    }

    @Override
    public String toString() {
        return super.toString(FORMAT);
    }
}
