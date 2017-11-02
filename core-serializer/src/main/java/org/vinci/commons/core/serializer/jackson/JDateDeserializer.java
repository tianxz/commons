package org.vinci.commons.core.serializer.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import jodd.datetime.JDateTime;

import java.io.IOException;

/**
 * Created by XizeTian on 2017/11/2.
 */
public class JDateDeserializer extends JsonDeserializer<JDateTime> {
    @Override
    public JDateTime deserialize(JsonParser p, DeserializationContext dc) throws IOException {
        return new JDateTime(p.getValueAsString());
    }
}
