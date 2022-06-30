package com.sparta.javabinks.framework;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.sparta.javabinks.framework.ConnectionManager;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.hasLength;
import static org.hamcrest.Matchers.notNullValue;


public class FrameworkTest {
    ObjectMapper mapper = new ObjectMapper();


    @Test
    @DisplayName("Connection response starts with {")
    public void testConnectionStartsWithCorrectFormat(){
        given().get(ConnectionManager.getConnection()).
                then()
                .assertThat()
                .extract()
                .toString()
                .substring(0, 1)
                .equals("{");
    }
    

    @Test
    @DisplayName("Connection returns Status Code 200")
    void ableToConnect(){
        given().get(ConnectionManager.getConnection())
                .then()
                .assertThat()
                .statusCode(200);
    }


    @ParameterizedTest
    @MethodSource("headersHaveValues")
    void headerHaveValue(String key, Matcher value){
        given().get(ConnectionManager.getConnection()).then().assertThat().header(key, value);
    }
    private static Stream<Arguments> headersHaveValues(){
        return Stream.of(
                Arguments.arguments("Server", notNullValue()),
                Arguments.arguments("Date", notNullValue()),
                Arguments.arguments("Content-Type", notNullValue()),
                Arguments.arguments("Transfer-Encoding", notNullValue()),
                Arguments.arguments("Connection", notNullValue()),
                Arguments.arguments("Vary", notNullValue()),
                Arguments.arguments("X-Frame-Options", notNullValue()),
                Arguments.arguments("Etag", notNullValue()),
                Arguments.arguments("Allow", notNullValue()),
                Arguments.arguments("Strict-Transport-Security", notNullValue())
        );
    }

    @Test
    @DisplayName("Extract JSON into File")
    void extractJSON(){
        String JSON = given().get(ConnectionManager.getConnection())
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .asString();
        try {
            mapper.writeValue(Paths.get("src/test/resources/StarWarsInfo.json").toFile(), JSON);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
