package com.sparta.javabinks.framework;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {

    private static final String BASEURL = "https://swapi.dev/api/";

    public static String getConnection() {
        getResponse();
        return BASEURL;
    }
    public static String getConnection(String option, String value) {
        getResponse();
        return BASEURL + "?" + option + "=" + value;
    }
    public static String getConnection(String option, int value) {
        getResponse();
        return BASEURL + "?" + option + "=" + value;
    }
    public static String getConnection(String option, double value) {
        getResponse();
        return BASEURL + "?" + option + "=" + value;
    }
    public static int getStatusCode() { return getResponse().statusCode(); }
    private static HttpResponse<String> getResponse() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = null;
        HttpResponse<String> httpResponse;
        try {
            httpRequest = HttpRequest.newBuilder(URI.create(BASEURL)).build();
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return httpResponse;
    }
}
