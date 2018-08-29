package com.example.android.tourguideapp;

public class Attraction {
    private String name;
    private String details;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Attraction (String aName, String additionalDetails){
        name = aName;
        details = additionalDetails;
        imageResourceId = NO_IMAGE_PROVIDED;
    }
    public Attraction (String aName, String additionalDetails, int image){
        name = aName;
        details = additionalDetails;
        imageResourceId = image;
    }

    public String getName(){
        return name;
    }
    public String getDetails() { return details; }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
