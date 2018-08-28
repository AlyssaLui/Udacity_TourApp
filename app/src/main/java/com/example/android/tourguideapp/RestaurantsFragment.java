package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("The Spotted Pig"));
        attractions.add(new Attraction("Momofuku"));
        attractions.add(new Attraction("The Halal Guys"));
        attractions.add(new Attraction("Arepa Lady"));
        attractions.add(new Attraction("Junior's"));
        attractions.add(new Attraction("Joe's Shanghai"));
        attractions.add(new Attraction("Katz's Delicatessen"));

        return rootView;

    }

}
