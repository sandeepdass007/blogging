package com.blogging.jackson.annotations.example.rawvalue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RawValueDemo {

    public static void main(String[] args) throws JsonProcessingException {
        Properties properties = new Properties("2.3.5", "{\"configurable\": true}");
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(properties);
        System.out.println(jsonString);
    }
}
