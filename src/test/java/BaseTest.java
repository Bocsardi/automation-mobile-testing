import Model.User;
import Screens.PracticeLogInTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.Driver;
import utils.JsonUtils;

@Listeners(utils.Listeners.class)
public class BaseTest {

    public static final String LINK = "https://www.saucedemo.com/";
    protected PracticeLogInTest practiceLogInTest;
    protected User user;
    protected String jsonUtils;
    private final Logger LOG = LoggerFactory.getLogger(BaseTest.class);

    @BeforeClass
    public void selectedBrowser() {
        Driver.Initialize();
        Driver.Instance.navigate().to(LINK);
    }
}
