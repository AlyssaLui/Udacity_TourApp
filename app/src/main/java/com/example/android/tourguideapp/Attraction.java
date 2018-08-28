package com.example.android.tourguideapp;

public class Attraction {
    private String name;
    private String details;

    public Attraction (String aName, String additionalDetails){
        name = aName;
        details = additionalDetails;
    }

    public String getName(){
        return name;
    }
}
