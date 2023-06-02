package com.blogging.jackson.annotations.example.anygetter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

public class AnyGetterDemo {

    public static void main(String[] args) throws JsonProcessingException {
        Model model = new Model();
        model.setName("New Model");
        HashMap<String, String> properties = new HashMap<>() {
            {
                put("property-1", "value-1");
                put("property-2", "value-2");
            }
        };
        model.setProperties(properties);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(model);
        System.out.println(jsonString);
    }
}
