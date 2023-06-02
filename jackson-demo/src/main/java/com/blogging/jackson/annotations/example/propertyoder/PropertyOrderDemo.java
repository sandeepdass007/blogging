package com.blogging.jackson.annotations.example.propertyoder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PropertyOrderDemo {

    public static void main(String[] args) throws JsonProcessingException {
        User user = new User();
        user.setName("Random User");
        user.setAge(22);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(user);
        System.out.println(jsonString);
    }
}
