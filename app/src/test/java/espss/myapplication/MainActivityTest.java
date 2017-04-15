package espss.myapplication;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by ${刘瑞亮} on 2017/4/6.
 */
public class MainActivityTest {
    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule(MainActivity.class);
    @Test
    public void onCreate() throws Exception {
        onView(withText("Hello world!")).check(ViewAssertions.matches(isDisplayed()));
    }

    @Test
    public void onFragmentInteraction() throws Exception {

    }

}