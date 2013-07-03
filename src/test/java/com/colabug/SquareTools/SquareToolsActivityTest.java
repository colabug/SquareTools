package com.colabug.SquareTools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertNotNull;


@RunWith(RobolectricTestRunner.class)
public class SquareToolsActivityTest
{
    @Test
    public void shouldNotBeNull() throws Exception
    {
        SquareToolsActivity activity = Robolectric.buildActivity( SquareToolsActivity.class )
                                                  .create()
                                                  .start()
                                                  .resume()
                                                  .get();
        assertNotNull( activity );
    }
}
