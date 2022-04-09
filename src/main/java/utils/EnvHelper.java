package utils;

public class EnvHelper {

    public static final String TEST_DATA = System.getProperty("testData");

    public  String testData() {
        if (TEST_DATA.equalsIgnoreCase("testDataOne"))
            return "testDataOne";
        else return "testDataTwo";
    }
}
