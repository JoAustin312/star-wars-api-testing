package com.sparta.javabinks.framework;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {

    private static final String BASEURL = "https://swapi.dev/api/";

    public static String getConnection() { //retrieve root url
        getResponse();
        return BASEURL;
    }
    public static String getConnection(String option, String value) { //search query
        getResponse();
        return BASEURL + "?" + option + "=" + value;
    }
    public static String getConnection(String option, int value) { //search query
        getResponse();
        return BASEURL + "?" + option + "=" + value;
    }
    public static String getConnection(String option, double value) { //search query
        getResponse();
        return BASEURL + "?" + option + "=" + value;
    }
    public static String getConnection(String extension) { //retrieve deeper resource
        getResponse();
        return BASEURL + extension;
    }
    public static String getConnection(String extension, String option, String value) { //retrieve deeper resource + query
        getResponse();
        return BASEURL + extension + "?" + option + "=" + value;
    }
    public static String getConnection(String extension, String option, int value) { //retrieve deeper resource + query
        getResponse();
        return BASEURL + extension + "?" + option + "=" + value;
    }
    public static String getConnection(String extension, String option, double value) { //retrieve deeper resource + query
        getResponse();
        return BASEURL + extension + "?" + option + "=" + value;
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
