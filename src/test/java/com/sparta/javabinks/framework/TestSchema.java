package com.sparta.javabinks.framework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class TestSchema {

    @ParameterizedTest
    @MethodSource("getSchema")
    @DisplayName("Using the /schema page should return statuscode: 200 allowing access to attribute schema")
    void accessSchema(String extension, int statusCode){
        given().get(ConnectionManager.getConnection(extension)).then().assertThat().statusCode(statusCode);
    }

    private static Stream<Arguments> getSchema() {
        return Stream.of(
                Arguments.arguments("people/schema", 200),
                Arguments.arguments("films/schema", 200),
                Arguments.arguments("planets/schema", 200),
                Arguments.arguments("species/schema", 200),
                Arguments.arguments("starships/schema", 200),
                Arguments.arguments("vehicles/schema", 200)
        );
    }
}

