import Model.User;
import Screens.PracticeLogInTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Driver;
import utils.JsonUtils;

import java.io.IOException;

public class LogInTest extends BaseTest {

    @BeforeClass
    public void setUp() throws IOException {
        practiceLogInTest = new PracticeLogInTest(Driver.Instance);
    }

    @Test
    public void logIn() {
        practiceLogInTest
                .typeUserName(JsonUtils.getTestData(JsonUtils.getUsername()))
                .typePassword(JsonUtils.getTestData(JsonUtils.getPassword()))
                .clickLogInBtn()
                .checkIfLogoIsDisplayed();
    }
}
