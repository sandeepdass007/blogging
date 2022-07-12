package com.blogging.jackson.annotations.example.rawvalue;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class Properties {

    private String version;

    @JsonRawValue
    private String customJson;

    public Properties() {
    }

    public Properties(String version, String customJson) {
        this.version = version;
        this.customJson = customJson;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCustomJson() {
        return customJson;
    }

    public void setCustomJson(String customJson) {
        this.customJson = customJson;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "version='" + version + '\'' +
                ", customJson='" + customJson + '\'' +
                '}';
    }
}
