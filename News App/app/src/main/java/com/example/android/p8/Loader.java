package com.example.android.p8;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class Loader extends AsyncTaskLoader<List<com.example.android.p8.News>> {
    private String mURL;
    public Loader(Context context, String url) {
        super(context);
        mURL = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<com.example.android.p8.News> loadInBackground() {
        if (mURL == null) {
            return null;
        }
        List<com.example.android.p8.News> allNews = com.example.android.p8.Utilities.fetchNewsData(mURL);
        return allNews;
    }
}