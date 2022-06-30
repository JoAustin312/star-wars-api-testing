package com.sparta.javabinks.framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.javabinks.dtos.PeopleDTO;

import java.io.IOException;
import java.net.URL;

public class Injector {
    public static PeopleDTO injectPeopleDTO(String url) {
        PeopleDTO peopleDTO = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            peopleDTO = mapper.readValue(new URL(url), PeopleDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return peopleDTO;
    }
}
