package org.vinci.commons.core.serializer.jackson;

/**
 * Created by mt on 2016-07-19 19:40.
 */
public class JDateTimeSerializer extends JDateSerializer {
    @Override
    public String getFormat() {
        return "YYYY-MM-DD hh:mm:ss";
    }
}
