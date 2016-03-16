package com.evuser.androidinstumentedtesting;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class ApplicationTest {

    //registerCase1 values
    public static final String FULL_NAME1 = "Ev Droider";
    public static final String EMAIL1 = "evdroid8@gmail.com";
    public static final String PASSWORD1 = "testing123";

    //registerCase2 values
    public static final String FULL_NAME2 = "";
    public static final String EMAIL2 = "evdroid8@gmail.com";
    public static final String PASSWORD2 = "testing123";

    //registerCase3 values
    public static final String FULL_NAME3 = "Ev Droider";
    public static final String EMAIL3 = "evdroid8@gmail.com";
    public static final String PASSWORD3 = "";

    //registerCase4 values
    public static final String FULL_NAME4 = "Ev Droider";
    public static final String EMAIL4 = "";
    public static final String PASSWORD4 = "testing123";

    //registerCase5 values
    public static final String FULL_NAME5 = "Ev Droider";
    public static final String EMAIL5 = "evdroid8gmail.com";
    public static final String PASSWORD5 = "testing123";

    @Rule
    public ActivityTestRule<MainActivity> mMainActivityRule = new ActivityTestRule<>(MainActivity.class);
    public ActivityTestRule<NextActivity> mNextActivityRule = new ActivityTestRule<>(NextActivity.class);

    @Test
    public void registerCase1() {
        // Type text and then press the button.
        onView(withId(R.id.edt_name)).perform(typeText(FULL_NAME1));
        onView(withId(R.id.edt_email)).perform(typeText(EMAIL1));
        onView(withId(R.id.edt_password)).perform(typeText(PASSWORD1), closeSoftKeyboard());
        onView(withId(R.id.btn_submit)).perform(click());

        onView(withId(R.id.btn_finish)).perform(click());
    }

    @Test
    public void registerCase2() {
        // Type text and then press the button.
        onView(withId(R.id.edt_name)).perform(typeText(FULL_NAME2));
        onView(withId(R.id.edt_email)).perform(typeText(EMAIL2));
        onView(withId(R.id.edt_password)).perform(typeText(PASSWORD2), closeSoftKeyboard());
        onView(withId(R.id.btn_submit)).perform(click());
    }

    @Test
    public void registerCase3() {
        // Type text and then press the button.
        onView(withId(R.id.edt_name)).perform(typeText(FULL_NAME3));
        onView(withId(R.id.edt_email)).perform(typeText(EMAIL3));
        onView(withId(R.id.edt_password)).perform(typeText(PASSWORD3), closeSoftKeyboard());
        onView(withId(R.id.btn_submit)).perform(click());
    }

    @Test
    public void registerCase4() {
        // Type text and then press the button.
        onView(withId(R.id.edt_name)).perform(typeText(FULL_NAME4));
        onView(withId(R.id.edt_email)).perform(typeText(EMAIL4));
        onView(withId(R.id.edt_password)).perform(typeText(PASSWORD4), closeSoftKeyboard());
        onView(withId(R.id.btn_submit)).perform(click());
    }

    @Test
    public void registerCase5() {
        // Type text and then press the button.
        onView(withId(R.id.edt_name)).perform(typeText(FULL_NAME5));
        onView(withId(R.id.edt_email)).perform(typeText(EMAIL5));
        onView(withId(R.id.edt_password)).perform(typeText(PASSWORD5), closeSoftKeyboard());
        onView(withId(R.id.btn_submit)).perform(click());
    }
}