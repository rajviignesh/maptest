package com.example.maptest;

public class location {
    private String lat;
    private String lng;

    public location(){

    }

    public location(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }
}