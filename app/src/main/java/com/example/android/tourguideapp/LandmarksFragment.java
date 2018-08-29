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
public class LandmarksFragment extends Fragment {

    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Statue of Liberty", "New York, NY 10004", R.drawable.statueofliberty));
        attractions.add(new Attraction("Central Park", "New York, NY", R.drawable.centralpark));
        attractions.add(new Attraction("Empire State Building", "350 5th Ave, New York, NY 10118", R.drawable.empirestate));
        attractions.add(new Attraction("Times Square", "Manhattan, NY 10036", R.drawable.timessq));
        attractions.add(new Attraction("Brooklyn Bridge", "Brooklyn Bridge, New York, NY 10038", R.drawable.brooklynbridge));
        attractions.add(new Attraction("High Line", "New York, NY 10011", R.drawable.highline));
        attractions.add(new Attraction("Rockefeller Center", "45 Rockefeller Plaza, New York, NY 10111", R.drawable.rockefeller));
        attractions.add(new Attraction("Grand Central Terminal", "89 E 42nd St, New York, NY 10017", R.drawable.grandcentral));
        attractions.add(new Attraction("One World Trade Center", "285 Fulton St, New York, NY 10007", R.drawable.worldtrade));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
