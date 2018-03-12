package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.activity.MainActivity;
import com.udacity.gradle.builditbigger.jokesdisplay.DisplayJokeActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.ComponentNameMatchers.hasClassName;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(AndroidJUnit4.class)
public class FetchJokesAsyncTaskTest {

    @Rule
    public IntentsTestRule<MainActivity> rule = new IntentsTestRule<>(MainActivity.class);

    @Test
    public void retrieveJokeOnClick() {
        onView(withId(R.id.tell_joke_button)).perform(click());
        intended(hasComponent(hasClassName(DisplayJokeActivity.class.getName())));
        intended(hasExtra(equalTo(Intent.EXTRA_TEXT), notNullValue()));
    }

}