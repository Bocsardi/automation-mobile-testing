import Screens.PracticeLogInTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static final String LINK= "https://www.saucedemo.com/";
    public static final String BROWSER = System.getProperty("browser");
    protected PracticeLogInTest practiceLogInTest;
    private final Logger LOG = LoggerFactory.getLogger(BaseTest.class);

    @BeforeMethod
    public void selectedBrowser() {
//        if (BROWSER.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to(LINK);
            driver.manage().window().maximize();
            practiceLogInTest = new PracticeLogInTest(driver);
            try{wait(5000);}
            catch (InterruptedException  | IllegalMonitorStateException e ){
                e.printStackTrace();
            }
//        } else {
//            LOG.warn("VM parameter is not set");
//        }
    }
}
