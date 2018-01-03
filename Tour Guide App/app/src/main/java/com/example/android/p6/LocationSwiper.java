package com.example.android.p6;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationSwiper extends ArrayAdapter<Location> {

    private int mColorResourceID;

    public LocationSwiper(Context context, ArrayList<Location> pPlaces, int colorResourceID) {
        super(context, 0, pPlaces);
        mColorResourceID = colorResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.activity_display, parent, false);
        }

        // Get object
        Location currentPlace = getItem(position);

        // Find TextView with view ID name
        TextView name = (TextView) listView.findViewById(R.id.name);
        name.setText(currentPlace.getName());

        // Find TextView with ID knownFor
        TextView description = (TextView) listView.findViewById(R.id.description);
        description.setText(currentPlace.getDescription());

        // Find background colour
        View container = listView.findViewById(R.id.container);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        container.setBackgroundColor(color);

        // Find TextView with ID price
        TextView price = (TextView) listView.findViewById(R.id.price);
        price.setText(currentPlace.getPrice());

        //Image activity:
        // Find ImageView in list_item.xml layout
        ImageView imageView = (ImageView) listView.findViewById(R.id.image);
        // Check if image is provided
        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getmImageResourceId());
            // Check if image is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // If image not visible, hide
            imageView.setVisibility(View.GONE);
        }
        return listView;
    }
}