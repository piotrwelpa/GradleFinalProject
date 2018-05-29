package builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;

import java.util.concurrent.TimeUnit;

import com.udacity.gradle.builditbigger.EndpointsAsyncTaskTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class EndpointsTest {
    @Test
    public void test() throws Exception {
        EndpointsAsyncTaskTest test =  new EndpointsAsyncTaskTest();
        test.execute(new Pair<Context, String>(InstrumentationRegistry.getContext(), null));
        String joke = test.get(5, TimeUnit.SECONDS);
        Assert.assertEquals("Some greate joke",joke);
    }
}
