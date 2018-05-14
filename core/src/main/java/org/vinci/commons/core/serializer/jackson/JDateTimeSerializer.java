package org.vinci.commons.core.serializer.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import jodd.datetime.JDateTime;

import java.io.IOException;

/**
 * Created by mt on 2016-07-19 19:40.
 */
public class JDateTimeSerializer extends JsonSerializer<JDateTime> {

    @Override
    public void serialize(JDateTime dateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(dateTime.toString());
    }

    @Override
    public Class<JDateTime> handledType() {
        return JDateTime.class;
    }
}
