package com.sparta.javabinks.framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.javabinks.dtos.BoredAPIDTO;

import java.io.IOException;
import java.net.URL;

public class Injector {
    public static BoredAPIDTO injectDTO(String url) {
        BoredAPIDTO boredAPIDTO;
        ObjectMapper mapper = new ObjectMapper();
        try {
            boredAPIDTO = mapper.readValue(new URL(url), BoredAPIDTO.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return boredAPIDTO;
    }
}
