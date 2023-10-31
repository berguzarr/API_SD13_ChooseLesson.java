package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static String generateToken(String username, String password) {
        String url= ConfigReader.getProperty("base_url") + "/auth/login";
        Map<String, Object>token=new HashMap<>();
        token.put( "password", password);
        token.put("username", username);
        Response response=given().contentType(ContentType.JSON).body(token).post(url);
        response.prettyPrint();
        return response.jsonPath().getString("token");

    }

}