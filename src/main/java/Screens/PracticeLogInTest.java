package Screens;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;

public class PracticeLogInTest {

    public WebDriver driver;

    public final By emailField = By.id("user-name");
    public final By passwordField = By.cssSelector("password");
    public final By loginBtn = By.id("login-button");
    private final By errorMsg = By.className("error-button");

    public PracticeLogInTest(WebDriver driver){
        this.driver = driver;
    }

    public PracticeLogInTest clickOnLogIn() {
        try {
            driver.findElement(loginBtn).click();
        }catch (NoSuchSessionException e){
            e.printStackTrace();
        }
        return this;
    }

    public PracticeLogInTest enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public PracticeLogInTest enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public PracticeLogInTest clickLogInBtn() {
        driver.findElement(loginBtn).click();
        return this;
    }

    public PracticeLogInTest checkErrorMsh(){
        Assert.assertTrue(driver.findElement(errorMsg).isDisplayed());
        return this;
    }
}
