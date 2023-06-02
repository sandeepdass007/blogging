package com.blogging.jackson;

import com.blogging.jackson.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainClass {

    public static void main(String[] args) throws JsonProcessingException {
        stringToObject();
        objectToString();
    }

    private static void objectToString() throws JsonProcessingException {
        System.out.println("========= Object to String =========");
        User user = new User("Sandeep Dass", 28);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(user);
        System.out.println(jsonString);
    }

    private static void stringToObject() throws JsonProcessingException {
        System.out.println("========= String to Object =========");
        final String JSON_STRING = """
                {
                    "name" : "Sandeep Dass",
                    "age" : 28
                }
                """;
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(JSON_STRING, User.class);
        System.out.println("User name: " + user.getName());
        System.out.println("User age: " + user.getAge());
    }
}
