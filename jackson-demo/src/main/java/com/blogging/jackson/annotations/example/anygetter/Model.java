package com.blogging.jackson.annotations.example.anygetter;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.Map;

public class Model {

    private String name;

    private Map<String, String> properties;

    public Model() {
    }

    public Model(String name, Map<String, String> properties) {
        this.name = name;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", properties=" + properties +
                '}';
    }
}
