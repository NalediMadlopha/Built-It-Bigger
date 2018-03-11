package com.udacity.gradle.builditbigger.jokesdisplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        String joke = getIntent().getStringExtra(Intent.EXTRA_TEXT);

        TextView jokeTextView = findViewById(R.id.joke_text_view);
        jokeTextView.setText(joke);
    }

}
