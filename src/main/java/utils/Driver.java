package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver Instance = null;
    public static final String BROWSER = System.getProperty("browser");

    public static void selectBrowser() {
        switch (BROWSER) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                Instance = new ChromeDriver();
                break;
            case "FireFox":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/geckodriver.exe");
                Instance = new FirefoxDriver();
                break;
        }
    }

    public static void Initialize() {
        selectBrowser();
        Instance.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Instance.manage().window().maximize();
    }
}

