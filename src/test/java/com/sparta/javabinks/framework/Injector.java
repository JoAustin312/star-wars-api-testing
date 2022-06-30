package com.sparta.javabinks.framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.javabinks.dtos.*;

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
    public static FilmDTO injectFilmDTO(String url) {
        FilmDTO filmDTO = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            filmDTO = mapper.readValue(new URL(url), FilmDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filmDTO;
    }
    public static PlanetsDTO injectPlantsDTO(String url) {
        PlanetsDTO planetsDTO = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            planetsDTO = mapper.readValue(new URL(url), PlanetsDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return planetsDTO;
    }
    public static StarshipsDTO injectStarshipsDTO(String url) {
        StarshipsDTO starshipsDTO = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            starshipsDTO = mapper.readValue(new URL(url), StarshipsDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return starshipsDTO;
    }
    public static SpeciesDTO injectSpeciesDTO(String url) {
        SpeciesDTO speciesDTO = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            speciesDTO = mapper.readValue(new URL(url), SpeciesDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return speciesDTO;
    }

    public static VehiclesDTO injectVehiclesDTO(String url) {
        VehiclesDTO vehiclesDTO = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            vehiclesDTO = mapper.readValue(new URL(url), VehiclesDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vehiclesDTO;
    }
}
