package org.vinci.commons.core.time;

import jodd.datetime.JDateTime;

/**
 * Created by XizeTian on 2017/10/23.
 */
public class JTime extends JDateTime {
    private final String FORMAT = "hh:mm:ss.mss";

    public JTime(int hour, int minute, int second, int millisecond) {
        super(1970, 1, 1, hour, minute, second, millisecond);
    }

    public JTime(int hour, int minute, int second) {
        super(1970, 1, 1, hour, minute, second, 0);
    }

    public JTime() {
        super();
    }

    public JTime(String src) {
        super(src);
    }

    @Override
    public String toString() {
        return super.toString(FORMAT);
    }
}
