package com.mendhak.gpslogger.barista;

import android.support.test.rule.ActivityTestRule;

import com.mendhak.gpslogger.GpsMainActivity;
import com.mendhak.gpslogger.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import gr.aueb.android.barista.core.annotations.Gps;
import gr.aueb.android.barista.core.annotations.enumarations.NetworkAdapterStateType;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class BaristaInitialization {

    private GpsMainActivity main = null;

    @Rule
    public ActivityTestRule<GpsMainActivity> activityActivityTestRule = new ActivityTestRule<GpsMainActivity>(GpsMainActivity.class);

    @Before
    public void init() {
        //GoToTrackLogger.deleteAllTracks();
        activityActivityTestRule.getActivity().getContentScene();
    }

    @Test
    @Gps(NetworkAdapterStateType.DISABLED)
    public void GPSOff() {
        onView(withText("START LOGGIN")).perform(click());
    }
}
