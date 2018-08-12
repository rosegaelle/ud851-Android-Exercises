package com.example.android.datafrominternet;

import android.os.AsyncTask;

import com.example.android.datafrominternet.utilities.NetworkUtils;

import java.io.IOException;
import java.net.URL;


public class GithubQueryTask extends AsyncTask {

    @Override
    protected Object doInBackground(Object[] objects) {

        URL githubSearchUrl = (URL) objects[0];

        String githubSearchResults = null;

        try {
            githubSearchResults = NetworkUtils.getResponseFromHttpUrl(githubSearchUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return githubSearchResults;
    }
}
