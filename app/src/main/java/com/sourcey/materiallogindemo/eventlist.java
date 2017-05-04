package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by suryanarayana on 5/4/17.
 */

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.os.Build.VERSION_CODES.M;

public class eventlist extends AppCompatActivity implements HeadlineFragment.OnHeadlineSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("hi","event list class");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eventlist);
    }

    public void onArticleSelected(int position) {


        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            NewsFragment newsFragment = (NewsFragment) getSupportFragmentManager().findFragmentById(R.id.news_fragment);
            newsFragment.updateArticleView(position);
        }
        else {
            Intent myIntent = new Intent(eventlist.this, event2list.class);
            myIntent.putExtra("key", position);
            eventlist.this.startActivity(myIntent);
        }

    }
}

