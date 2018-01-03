package com.example.android.p6;

public class Location {
    // Location name
    private String mName;

    // Location description
    private String mDescription;

    // Location website URL
    private String mUrl;

    // Location price
    private String mPrice;

    // Location image
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /*** Constructs a new {@link Location} object:
     * @param name is the location name
     * @param description is the location description
     * @param url is the location website URL
     * @param price is the location price
     */

    public Location(String name, String description, String url, int imageResourceId, String price) {
        mName = name;
        mDescription = description;
        mUrl = url;
        mImageResourceId = imageResourceId;
        mPrice = price;
    }

    public String getName() { return mName; }
    public String getDescription() {return mDescription; }
    public String getUrl() {return mUrl; }
    public int getmImageResourceId() { return mImageResourceId; }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public String getPrice() {return mPrice; }

}