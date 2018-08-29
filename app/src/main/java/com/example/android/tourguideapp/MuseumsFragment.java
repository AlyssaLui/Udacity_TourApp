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
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("American Museum of Natural History", "Central Park West & 79th St, New York, NY 10024"));
        attractions.add(new Attraction("Solomon R. Guggenheim Museum", "1071 5th Ave, New York, NY 10128"));
        attractions.add(new Attraction("Museum of Modern Art", "11 W 53rd St, New York, NY 10019"));
        attractions.add(new Attraction("Metropolitan Museum of Art", "1000 5th Ave, New York, NY 10028"));
        attractions.add(new Attraction("Museum of the City of New York", "1220 5th Ave & 103rd Street, New York, NY 10029"));
        attractions.add(new Attraction("New York City Fire Museum", "278 Spring St, New York, NY 10013"));
        attractions.add(new Attraction("National Museum of the American Indian", "1 Bowling Green, New York, NY 10004"));
        attractions.add(new Attraction("Children's Museum of the Arts", "103 Charlton St, New York, NY 10014"));
        attractions.add(new Attraction("Queens Museum", "New York City Building, Corona, NY 11368"));
        attractions.add(new Attraction("National Museum of Mathematics", "11 E 26th St, New York, NY 10010"));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
