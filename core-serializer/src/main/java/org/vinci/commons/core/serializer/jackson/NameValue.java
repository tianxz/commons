package org.vinci.commons.core.serializer.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by XizeTian on 2017/11/3.
 */
public class NameValue<N, V> extends jodd.util.NameValue<N, V> {
    @JsonCreator
    public NameValue(@JsonProperty("name") N name, @JsonProperty("value") V value) {
        super(name, value);
    }
}
