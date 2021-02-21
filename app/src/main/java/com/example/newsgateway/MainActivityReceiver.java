package com.example.newsgateway;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.List;

import static com.example.newsgateway.MainActivity.ARTICLE_LIST;

public class MainActivityReceiver extends BroadcastReceiver {

    private static final String TAG = "MainActivityReceiver";

    private final MainActivity mainActivity;

    public MainActivityReceiver(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: ");
        String action = intent.getAction();
        if (action == null)
            return;
        if (MainActivity.ACTION_NEWS_STORY.equals(action)) {
            List<Article> articles;
            if (intent.hasExtra(ARTICLE_LIST)) {
                articles = (List<Article>) intent.getSerializableExtra(ARTICLE_LIST);
                mainActivity.updateFragments(articles);
            }
        }
    }
}