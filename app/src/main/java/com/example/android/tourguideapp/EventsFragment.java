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
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Winter Jazzfest", "January @ Jacob Javits Center"));
        attractions.add(new Attraction("New York Jewish Film Festival", "January @ the Jewish Museum"));
        attractions.add(new Attraction("NYC Broadway Week", "January and September"));
        attractions.add(new Attraction("NYC Restaurant Week®", "January and July"));
        attractions.add(new Attraction("Lunar New Year Parade & Festival", "February @ Chinatown"));
        attractions.add(new Attraction("New York Fashion Week", "February and September"));
        attractions.add(new Attraction("St. Patrick’s Day Parade", "March"));
        attractions.add(new Attraction("Cherry Blossom Festival", "April @ Brooklyn Botanical Gardens"));
        attractions.add(new Attraction("Macy’s Fourth of July Fireworks", "July"));
        attractions.add(new Attraction("Hong Kong Dragon Boat Festival ", "August @ Meadow Lake"));
        attractions.add(new Attraction("Summer Streets", "August"));
        attractions.add(new Attraction("New York Comic Con", "September @ Jacob Javits Center"));
        attractions.add(new Attraction("New York Comedy Festival", "November"));
        attractions.add(new Attraction("Rockefeller Center Tree Lighting ", "December @ Rockefeller Center"));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }

}
