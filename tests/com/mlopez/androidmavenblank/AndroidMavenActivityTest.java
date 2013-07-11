package com.mlopez.androidmavenblank;

import com.xtremelabs.robolectric.RobolectricTestRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Marcos on 2/07/13.
 */
@RunWith(RobolectricTestRunner.class)
public class AndroidMavenActivityTest {

    @Test
    public void shouldHaveHappySmiles() throws Exception {
        String appName = new AndroidMavenActivity().getResources().getString(R.string.app_name);
        assertThat(appName, equalTo("Android Maven Empty"));
    }

}
