package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
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
        attractions.add(new Attraction("The Spotted Pig", "314 W 11th St, New York, NY 10014"));
        attractions.add(new Attraction("Momofuku", "171 1st Avenue, New York, NY 10003"));
        attractions.add(new Attraction("The Halal Guys", "W 53rd St, New York, NY 10019"));
        attractions.add(new Attraction("Arepa Lady", "1 Dekalb Ave, Brooklyn, NY 11201"));
        attractions.add(new Attraction("Junior's", "386 Flatbush Ave Ext, Brooklyn, NY 11201"));
        attractions.add(new Attraction("Joe's Shanghai", "24 W 56th St, New York, NY 10019"));
        attractions.add(new Attraction("Katz's Delicatessen", "205 E Houston St, New York, NY 10002"));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }

}
