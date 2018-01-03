package com.example.android.p8;;

public class News {

    private String mTitle;
    private String mDate;
    private String mTime;
    private String mType;
    private String mSection;
    private String mWebURL;

    public News(String title, String date, String time, String type, String section, String webURL) {
        mTitle = title;
        mDate = date;
        mTime = time;
        mType = type;
        mSection = section;
        mWebURL = webURL;
    }

    public String getTitle() {
        return mTitle;
    }
    public String getDate() {
        return mDate;
    }
    public String getType() {
        return mType;
    }
    public String getSection() {
        return mSection;
    }
    public String getmWebURL() {
        return mWebURL;
    }
    public String getTime() {
        return mTime;
    }
}