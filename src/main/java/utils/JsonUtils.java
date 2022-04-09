package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonUtils {

    public static final String TEST_DATA_PATH = "src\\main\\resources\\testData.json";
    public static final String TEST_DATA = System.getProperty("testData");

    public static String getUsername() {
        return "username";
    }

    public static String getPassword() {
        return "password";
    }

    public static String testData() {
        if (TEST_DATA.equalsIgnoreCase("testDataOne"))
            return "testDataOne";
        else return "testDataTwo";
    }

    public static synchronized String getTestData(String testData) {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = null;
        try {
            reader = new FileReader(TEST_DATA_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = null;
        try {
            jsonObject = (JSONObject) jsonParser.parse(reader);
        } catch (IOException  | ParseException e) {
            e.printStackTrace();
        }
        JSONObject testDataJsonObject = jsonObject;
        JSONObject selectedTestData = (JSONObject) testDataJsonObject.get(testData());
        return (String) selectedTestData.get(testData);
    }
}
