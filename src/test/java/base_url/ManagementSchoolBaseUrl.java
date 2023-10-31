package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

import static utilities.Authentication.generateToken;

public class ManagementSchoolBaseUrl {
    public static RequestSpecification spec;
    public static void setup(String username, String password){
        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization", generateToken(username,password)).
                setBaseUri(ConfigReader.getProperty("base_url")).build();
    }
}
