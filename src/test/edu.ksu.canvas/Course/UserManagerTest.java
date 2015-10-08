package Course;

import config.BaseTestConfig;
import config.CourseTestConfig;
import edu.ksu.canvas.impl.UserImpl;
import edu.ksu.canvas.model.Course;
import edu.ksu.canvas.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import scala.runtime.TraitSetter;

import java.io.IOException;
import java.util.Optional;

/**
 * Created by prakashreddy on 10/7/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("dev")
@ContextConfiguration(classes = {BaseTestConfig.class})
@WebAppConfiguration
public class UserManagerTest {
    String canvasBaseURL = "https://k-state.test.instructure.com";
    Integer apiVersion = 1;
    String token = "1726~MQ8vuaJUbVosHUcvEcUfdHixQobAkS03AxSKVXvRy79lAcSX2uURHc2IHnDINpP2";
    private static final String account_id="1";
    Integer userId ;
    UserImpl userImpl;

    @Before
    public void setupData(){
        userImpl = new UserImpl(canvasBaseURL,apiVersion,token);
        userId=0;
    }

    @Test
    public void testCreateUser() throws IOException{
        User user = new User();
        user.setName("somestring4");
        user.setLoginId("somestring4");
        Optional<User> response = userImpl.createUser(token,user);
        userId=response.get().getId();
        Assert.assertEquals("somestring4",response.get().getName());
        Assert.assertNotNull(response.get().getId());

    }

    @Test
    public void testDeleteUser() throws IOException{
        Assert.assertTrue(userImpl.deleteUser(token,userId));
    }
}
