package com.example.domain.type;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class AmountSerializer extends JsonSerializer<Amount> {

    @Override
    public void serialize(Amount amount,
                          JsonGenerator generator,
                          SerializerProvider serializers) throws IOException {
        generator.writeObject(amount.value);
    }
}