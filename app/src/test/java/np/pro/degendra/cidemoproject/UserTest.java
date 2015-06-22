package np.pro.degendra.cidemoproject;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@Config(emulateSdk = 18, reportSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class UserTest {

    @Test
    public void testUserNameTest() {
        User u = new User();

        u.setName("foo");

        Assert.assertEquals("foo", u.getName());
    }

    @Test
    public void testUserNameTest2() {
        User u = new User();

        u.setName("foo");

        Assert.assertEquals("foo", u.getName());
    }

}