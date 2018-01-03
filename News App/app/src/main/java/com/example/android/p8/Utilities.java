package com.example.android.p8;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;


public class Utilities {
    private Utilities () {
    }

    public static List<com.example.android.p8.News> fetchNewsData(String requestURL) {
        URL url = createUrl(requestURL);
        String jsonResponse = null;
        try {
            jsonResponse = makeHttpRequest(url);
        } catch (IOException e) {
            Log.e("QueryUtils", "HTTP request error", e);
        }
        List<com.example.android.p8.News> allnews = extractFeatureFromJson(jsonResponse);
        return allnews;
    }

    private static URL createUrl(String stringURL) {
        URL url = null;
        try {
            url = new URL(stringURL);
        } catch (MalformedURLException e) {
            Log.e("QueryUtils", "URL error ", e);
        }
        return url;
    }

    private static String makeHttpRequest(URL url) throws IOException {
        String jsonResponse = "";
        if (url == null) {
            return jsonResponse;
        }
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000 /* milliseconds */);
            urlConnection.setConnectTimeout(15000 /* milliseconds */);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                inputStream = urlConnection.getInputStream();
                jsonResponse = readFromStream(inputStream);
            } else {
                Log.e("urlConnection", "Error response code: " + urlConnection.getResponseCode());
            }
        } catch (IOException e) {
            Log.e("urlConnection", "Problem retrieving the news JSON results.", e);
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return jsonResponse;
    }

    private static String readFromStream(InputStream inputStream) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                stringBuilder.append(line);
                line = bufferedReader.readLine();
            }
        }
        return stringBuilder.toString();
    }

    private static List<com.example.android.p8.News> extractFeatureFromJson(String newsJSON) {
        if (TextUtils.isEmpty(newsJSON)) {
            return null;
        }
        List<com.example.android.p8.News> allnews = new ArrayList<>();
        try {
            JSONObject root = new JSONObject(newsJSON);
            JSONObject responseObject = root.getJSONObject("response");
            if (responseObject.getString("status").equals("ok")) {
                if (responseObject.has("results")) {
                    JSONArray resultsArray = responseObject.getJSONArray("results");
                    for (int i = 0; i < resultsArray.length(); i++) {
                        JSONObject currentNews = resultsArray.getJSONObject(i);
                        String currentNewsTitle = currentNews.getString("webTitle");
                        String currentNewsDate;
                        String currentTime;
                        String currentNewsType;
                        String currentNewsSection;
                        String currentNewsWebURL;
                        if (currentNews.has("webPublicationDate")) {
                            currentNewsDate = currentNews.getString("webPublicationDate");
                            currentTime = currentNewsDate.substring(currentNewsDate.indexOf("T") + 1, currentNewsDate.length() - 1);
                            currentNewsDate = currentNewsDate.substring(0, currentNewsDate.indexOf("T"));
                        } else {
                            currentNewsDate = "Date N/A";
                            currentTime = "";
                        }
                        if (currentNews.has("type")) {
                            currentNewsType = currentNews.getString("type");
                        } else {
                            currentNewsType = "Type N/A";
                        }
                        if (currentNews.has("sectionName")) {
                            currentNewsSection = currentNews.getString("sectionName");
                        } else {
                            currentNewsSection = "Section N/A";
                        }
                        currentNewsWebURL = currentNews.getString("webUrl");
                        com.example.android.p8.News news = new com.example.android.p8.News(currentNewsTitle, currentNewsDate, currentTime, currentNewsType, currentNewsSection, currentNewsWebURL);
                        allnews.add(news);
                    }
                }
            }
        } catch (JSONException e) {
            Log.e("JSON", "JSON Error", e);
        }
        return allnews;
    }
}