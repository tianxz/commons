package org.vinci.commons.core.serializer.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import jodd.datetime.JDateTime;
import org.vinci.commons.core.datetime.JDate;

import java.io.IOException;

/**
 * Created by XizeTian on 2017/2/23.
 */
public class JDateSerializer extends JsonSerializer<JDate> {

    @Override
    public void serialize(JDate jDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(jDate.toString());
    }

    @Override
    public Class<JDate> handledType() {
        return JDate.class;
    }
}
