import Screens.PracticeLogInTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static final String LINK= "https://www.saucedemo.com/";
    public static final String BROWSER = System.getProperty("browser");
    protected PracticeLogInTest practiceLogInTest;
    private final Logger LOG = LoggerFactory.getLogger(BaseTest.class);

    @BeforeMethod
    public void selectedBrowser() {
        if (BROWSER.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            LOG.warn("Chrome is selected browser");
            driver.navigate().to(LINK);
            driver.manage().window().maximize();
            practiceLogInTest = new PracticeLogInTest(driver);
            try {
                wait(5000);
            } catch (InterruptedException | IllegalMonitorStateException e) {
                e.printStackTrace();
            }
        } else if (BROWSER.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckoDriver.exe");
            WebDriver driver = new FirefoxDriver();
            LOG.warn("Firefox is selected browser");
            driver.navigate().to(LINK);
            driver.manage().window().maximize();
            practiceLogInTest = new PracticeLogInTest(driver);
            try {
                wait(5000);
            } catch (InterruptedException | IllegalMonitorStateException e) {
                e.printStackTrace();
            }
        }
    }
}
