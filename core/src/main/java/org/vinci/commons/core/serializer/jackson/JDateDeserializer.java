package org.vinci.commons.core.serializer.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import jodd.datetime.JDateTime;
import org.vinci.commons.core.datetime.JDate;

import java.io.IOException;

/**
 * Created by XizeTian on 2017/11/2.
 */
public class JDateDeserializer extends JsonDeserializer<JDate> {

    @Override
    public JDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return new JDate(jsonParser.getValueAsString());
    }

    @Override
    public Class<JDateTime> handledType() {
        return JDateTime.class;
    }
}