package org.vinci.commons.core.serializer.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import jodd.datetime.JDateTime;

import java.io.IOException;

/**
 * Created by mt on 2016-07-19 19:40.
 */
public class JDateTimeDeserializer extends JsonDeserializer<JDateTime> {
    @Override
    public JDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return new JDateTime(jsonParser.getValueAsString());
    }

    @Override
    public Class<JDateTime> handledType() {
        return JDateTime.class;
    }
}