package Model;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.IOException;
public class User {


    private String username;
    private String password;
    public ObjectMapper objectMapper = new ObjectMapper();
    public static final String TEST_DATA = System.getProperty("testData");


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

//    public User getTestData(String testData) throws IOException {
//        JSONObject jsonObject = utils.JsonUtils.getTestData(testData);
//        try {
//            return objectMapper.readValue(jsonObject.toJSONString(), User.class);
//        } catch (JsonProcessingException e){
//            e.printStackTrace();
//            throw e;
//        }
//    }
}
