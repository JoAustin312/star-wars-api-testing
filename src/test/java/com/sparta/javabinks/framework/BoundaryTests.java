package com.sparta.javabinks.framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.restassured.RestAssured.given;

public class BoundaryTests {

    @ParameterizedTest
    @ValueSource(ints = {1, 82, 83})
    @DisplayName("Given there are 82 people in the API, only numbers within tis range should pass")
    void peopleValues(int extension){
        given().get(ConnectionManager.getConnection("people/"+extension)).then().assertThat().statusCode(200);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 7, 8})
    @DisplayName("Given there are 7 films in the API, only numbers within tis range should pass")
    void filmValues(int extension){
        given().get(ConnectionManager.getConnection("films/"+extension)).then().assertThat().statusCode(200);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 60, 61})
    @DisplayName("Given there are 60 planets in the API, only numbers within tis range should pass")
    void planetValues(int extension){
        given().get(ConnectionManager.getConnection("planets/"+extension)).then().assertThat().statusCode(200);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 37, 38})
    @DisplayName("Given there are 37 species in the API, only numbers within tis range should pass")
    void speciesValues(int extension){
        given().get(ConnectionManager.getConnection("species/"+extension)).then().assertThat().statusCode(200);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 36, 37})
    @DisplayName("Given there are 36 starships in the API, only numbers within tis range should pass")
    void starshipsValues(int extension){
        given().get(ConnectionManager.getConnection("starships/"+extension)).then().assertThat().statusCode(200);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 39, 40})
    @DisplayName("Given there are 39 vehicles in the API, only numbers within tis range should pass")
    void vehicleValues(int extension){
        given().get(ConnectionManager.getConnection("vehicles/"+extension)).then().assertThat().statusCode(200);
    }



}
