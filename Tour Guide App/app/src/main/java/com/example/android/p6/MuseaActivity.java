package com.example.android.p6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

//A simple {@link Fragment} subclass
public class MuseaActivity extends Fragment {

    public MuseaActivity() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Locations of musea in Rotterdam
        final ArrayList<Location> places = new ArrayList<Location>();
        places.add(new Location(getString(R.string.musea1_name), getString(R.string.musea1_description), getString(R.string.musea1_url), R.drawable.mus_world, getString(R.string.musea1_price)));
        places.add(new Location(getString(R.string.musea2_name), getString(R.string.musea2_description), getString(R.string.musea2_url), R.drawable.mus_bvb, getString(R.string.musea2_price)));
        places.add(new Location(getString(R.string.musea3_name), getString(R.string.musea3_description), getString(R.string.musea3_url), R.drawable.mus_tax, getString(R.string.musea3_price)));
        places.add(new Location(getString(R.string.musea4_name), getString(R.string.musea4_description), getString(R.string.musea4_url), R.drawable.mus_chabot, getString(R.string.musea4_price)));
        places.add(new Location(getString(R.string.musea5_name), getString(R.string.musea5_description), getString(R.string.musea5_url), R.drawable.mus_maritime, getString(R.string.musea5_price)));
        places.add(new Location(getString(R.string.musea6_name), getString(R.string.musea6_description), getString(R.string.musea6_url), R.drawable.mus_photo, getString(R.string.musea6_price)));
        places.add(new Location(getString(R.string.musea7_name), getString(R.string.musea7_description), getString(R.string.musea7_url), R.drawable.mus_nature, getString(R.string.musea7_price)));
        places.add(new Location(getString(R.string.musea8_name), getString(R.string.musea8_description), getString(R.string.musea8_url), R.drawable.mus_actw, getString(R.string.musea8_price)));
        places.add(new Location(getString(R.string.musea9_name), getString(R.string.musea9_description), getString(R.string.musea9_url), R.drawable.mus_fey, getString(R.string.musea9_price)));
        places.add(new Location(getString(R.string.musea10_name), getString(R.string.musea10_description), getString(R.string.musea10_url), R.drawable.mus_port, getString(R.string.musea10_price)));
        places.add(new Location(getString(R.string.musea11_name), getString(R.string.musea11_description), getString(R.string.musea11_url), R.drawable.mus_rot, getString(R.string.musea11_price)));
        places.add(new Location(getString(R.string.musea12_name), getString(R.string.musea12_description), getString(R.string.musea12_url), R.drawable.mus_radio, getString(R.string.musea12_price)));

        // Create a new {@link ArrayAdapter} for musea category
        final LocationSwiper adapter = new LocationSwiper(getActivity(), places, R.color.category_musea);

        // Find a reference to the {@link ListView} in the layout
        final ListView placesListView = (ListView) rootView.findViewById(R.id.list);
        // Set adapter on {@link ListView}
        placesListView.setAdapter(adapter);
        placesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Location currentPlace = adapter.getItem(position);
                Uri placeUri = Uri.parse(currentPlace.getUrl());
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, placeUri);
                startActivity(websiteIntent);
            }
        });
        return rootView;
    }
}