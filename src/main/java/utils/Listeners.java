package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

    private final Logger LOG = LoggerFactory.getLogger(Listeners.class);

    public void onTestStart(ITestResult result) {
       LOG.info("Get start test : " + result.getName() );
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName() + "test is passed");
    }

    public void onTestFailure(ITestResult result){
        Driver.Instance.close();
    }
}
