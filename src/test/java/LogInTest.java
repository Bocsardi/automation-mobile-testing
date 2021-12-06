import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void logIn() {
        practiceLogInTest
                .clickOnLogIn()
                .checkErrorMsh();
    }
}
