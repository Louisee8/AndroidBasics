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
public class PartyActivity extends Fragment {

    public PartyActivity() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Locations of parties in Rotterdam
        final ArrayList<Location> places = new ArrayList<Location>();
        places.add(new Location(getString(R.string.restaurants1_name), getString(R.string.restaurants1_description), getString(R.string.restaurants1_url), R.drawable.eat_euromast, getString(R.string.restaurants1_price)));
        places.add(new Location(getString(R.string.restaurants2_name), getString(R.string.restaurants2_description), getString(R.string.restaurants2_url), R.drawable.eat_hotelny, getString(R.string.restaurants2_price)));
        places.add(new Location(getString(R.string.restaurants3_name), getString(R.string.restaurants3_description), getString(R.string.restaurants3_url), R.drawable.eat_bazar, getString(R.string.restaurants3_price)));
        places.add(new Location(getString(R.string.restaurants4_name), getString(R.string.restaurants4_description), getString(R.string.restaurants4_url), R.drawable.eat_thoms, getString(R.string.restaurants4_price)));
        places.add(new Location(getString(R.string.restaurants5_name), getString(R.string.restaurants5_description), getString(R.string.restaurants5_url), R.drawable.eat_shiki, getString(R.string.restaurants5_price)));
        places.add(new Location(getString(R.string.restaurants6_name), getString(R.string.restaurants6_description), getString(R.string.restaurants6_url), R.drawable.eat_markthal, getString(R.string.restaurants6_price)));

        // Create a new {@link ArrayAdapter} for party category
        final LocationSwiper adapter = new LocationSwiper(getActivity(), places, R.color.category_party);

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