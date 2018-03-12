package com.udacity.gradle.builditbigger.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

import com.udacity.gradle.builditbigger.R;
import com.udacity.gradle.builditbigger.async.FetchJokesAsyncTask;
import com.udacity.gradle.builditbigger.view.ProgressView;


public class MainActivity extends AppCompatActivity implements ProgressView {

    private ProgressBar progressBar;
    private View fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progress_bar);
        fragment = findViewById(R.id.fragment);

    }

    @Override
    public void showProgressView() {
        fragment.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressView() {
        progressBar.setVisibility(View.GONE);
        fragment.setVisibility(View.VISIBLE);
    }

    public void tellJoke(View view) {
        new FetchJokesAsyncTask(this).execute();
    }
}
