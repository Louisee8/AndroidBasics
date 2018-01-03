package com.example.android.p8;

import android.app.LoaderManager;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ver2point0.android.thegreatestnews.R;

import java.util.ArrayList;
import java.util.List;

public abstract class MainActivity extends AppCompatActivity
        implements LoaderManager.LoaderCallbacks<List<com.example.android.p8.News>> {


    private static final String NEWS_REQUEST_URL = "https://content.guardianapis.com";
    private static final int NEWS_LOADER_ID = 1;
    private TextView mEmptyStateTextView;
    private ProgressBar mProgressBar;
    private List<com.example.android.p8.News> newsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private com.example.android.p8.Adapter mAdapter;

    @Override
    protected void onResume() {
        super.onResume();
        getLoaderManager().restartLoader(1, null, this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEmptyStateTextView = (TextView) findViewById(R.id.empty_view);
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new Adapter(newsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        if (isConnected()) {
            LoaderManager loaderManager = getLoaderManager();
            loaderManager.initLoader(NEWS_LOADER_ID, null, this);
        } else {
            mProgressBar.setVisibility(View.GONE);
            mEmptyStateTextView.setText(R.string.no_internet);
            mEmptyStateTextView.setVisibility(View.VISIBLE);
        }
    }

    public boolean isConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return (networkInfo != null && networkInfo.isConnected());
    }

    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String contentPar = sharedPreferences.getString(getString(R.string.search_content_key), "");
        String sectionPar = sharedPreferences.getString(getString(R.string.search_section_key), "");
        String tagPar = sharedPreferences.getString(getString(R.string.search_tag_key), "");
        String startData = sharedPreferences.getString(getString(R.string.start_date_key), "");
        String endData = sharedPreferences.getString(getString(R.string.end_date_key), "");
        Uri baseUri = Uri.parse(NEWS_REQUEST_URL);
        Uri.Builder uriBuilder = baseUri.buildUpon();
        if (!contentPar.equals("")) {
            uriBuilder.clearQuery();
            uriBuilder.path("");
            uriBuilder.appendPath("search");
            uriBuilder.appendQueryParameter("q", contentPar);
        }
        if (!sectionPar.equals("")) {
            uriBuilder.clearQuery();
            uriBuilder.path("");
            uriBuilder.appendPath("sections");
            uriBuilder.appendQueryParameter("q", sectionPar);
        }
        if (!tagPar.equals("")) {
            uriBuilder.clearQuery();
            uriBuilder.path("");
            uriBuilder.appendPath("tags");
            uriBuilder.appendQueryParameter("q", tagPar);
        }
        if (!startData.equals("")) {
            uriBuilder.appendQueryParameter("from-date", startData);
        }
        if (!endData.equals("")) {
            uriBuilder.appendQueryParameter("to-date", endData);
        }
        uriBuilder.appendQueryParameter("api-key", "test");
        return new Loader(this);
    }

    @Override
    public void onLoadFinished(Loader<List<com.example.android.p8.News>> loader, List<com.example.android.p8.News> allNews) {
        newsList.clear();
        mProgressBar.setVisibility(View.GONE);
        if ((allNews != null) && (allNews.size() != 0)) {
            newsList.addAll(allNews);
            mAdapter.notifyDataSetChanged();
            mEmptyStateTextView.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);
        } else {
            mEmptyStateTextView.setText(R.string.no_news);
            mEmptyStateTextView.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.GONE);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<com.example.android.p8.News>> loader) {
        newsList.clear();
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_search) {
            Intent settingsIntent = new Intent(this, com.example.android.p8.Searcher.class);
            startActivity(settingsIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}