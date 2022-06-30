package com.sparta.javabinks.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.List;

public class BoredAPIDTO {

    @JsonProperty("activity")
    private String activity;

    @JsonProperty("accessibility")
    private Double accessibility;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("link")
    private String link;

    @JsonProperty("type")
    private String type;

    @JsonProperty("key")
    private String key;

    @JsonProperty("participants")
    private Integer participants;

    @JsonProperty("error")
    private String error;

    public String getActivity(){
        return activity;
    }

    public Double getAccessibility(){
        return accessibility;
    }

    public Double getPrice(){
        return price;
    }

    public String getLink(){
        return link;
    }

    public String getType(){
        return type;
    }

    public String getKey(){
        return key;
    }

    public Integer getParticipants(){
        return participants;
    }

    public List<String> getListOfTypes() {
        return Arrays.asList(
                "education",
                "recreational",
                "social",
                "diy",
                "charity",
                "cooking",
                "relaxation",
                "music",
                "busywork");
    }

    public boolean hasActivity() { return activity != null; }
    public boolean hasAccessibility() { return accessibility != null; }
    public boolean hasPrice() { return price != null; }
    public boolean hasLink() { return link != null; }
    public boolean hasType() { return type != null; }
    public boolean hasKey() { return key != null; }
    public boolean hasParticipants() { return participants != null; }
    public boolean doesNotHaveError() { return error == null; }
}