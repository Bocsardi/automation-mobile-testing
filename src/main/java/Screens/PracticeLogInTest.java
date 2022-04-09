package Screens;

import Model.User;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Helpers;

public class PracticeLogInTest {

    private final Logger LOG = LoggerFactory.getLogger(PracticeLogInTest.class);

    public WebDriver driver;
    public Helpers helpers = new Helpers();

    public final By emailField = By.id("user-name");
    public final By passwordField = By.id("password");
    public final By loginBtn = By.id("login-button");
    public final By logo = By.className("app_logo");

    public PracticeLogInTest(WebDriver driver) {
        this.driver = driver;
    }

    public PracticeLogInTest clickOnLogIn() {
        try {
            driver.findElement(loginBtn).click();
        } catch (NoSuchSessionException e) {
            e.printStackTrace();
        }
        return this;
    }

    public PracticeLogInTest typeUserName(String email) {
        LOG.info("Type username...");
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public PracticeLogInTest typePassword(String password) {
        LOG.info(" Type password...");
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public PracticeLogInTest clickLogInBtn() {
        LOG.info("Click on login button...");
        driver.findElement(loginBtn).click();
        return this;
    }

    public PracticeLogInTest checkIfLogoIsDisplayed() {
        LOG.info("Check if website logo is displayed");
        helpers.waitForElementIsPresent(logo, 5);
        Assert.assertTrue(helpers.isElementDisplayed(logo));
        return this;
    }
}
