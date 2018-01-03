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
public class SightsActivity extends Fragment {

    public SightsActivity() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Locations of sights in Rotterdam
        final ArrayList<Location> places = new ArrayList<Location>();
        places.add(new Location(getString(R.string.sights1_name), getString(R.string.sights1_description), getString(R.string.sights1_url), R.drawable.sights_wit, getString(R.string.sights1_price)));
        places.add(new Location(getString(R.string.sights2_name), getString(R.string.sights2_description), getString(R.string.sights2_url), R.drawable.sights_son, getString(R.string.sights2_price)));
        places.add(new Location(getString(R.string.sights3_name), getString(R.string.sights3_description), getString(R.string.sights3_url), R.drawable.sights_stolk, getString(R.string.sights3_price)));
        places.add(new Location(getString(R.string.sights4_name), getString(R.string.sights4_description), getString(R.string.sights4_url), R.drawable.sights_sint, getString(R.string.sights4_price)));
        places.add(new Location(getString(R.string.sights5_name), getString(R.string.sights5_description), getString(R.string.sights5_url), R.drawable.sights_kijk, getString(R.string.sights5_price)));
        places.add(new Location(getString(R.string.sights6_name), getString(R.string.sights6_description), getString(R.string.sights6_url), R.drawable.sights_kunst, getString(R.string.sights6_price)));
        places.add(new Location(getString(R.string.sights7_name), getString(R.string.sights7_description), getString(R.string.sights7_url), R.drawable.sights_future, getString(R.string.sights7_price)));
        places.add(new Location(getString(R.string.sights8_name), getString(R.string.sights8_description), getString(R.string.sights8_url), R.drawable.sights_blijdorp, getString(R.string.sights8_price)));

        // Create a new {@link ArrayAdapter} for sights category
        final LocationSwiper adapter = new LocationSwiper(getActivity(), places, R.color.category_sights);

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