package stepdefinitions.apiStepDefinitions;

import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.DeanPojo;

import java.util.List;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static base_url.ManagementSchoolBaseUrl.setup;
import static base_url.ManagementSchoolBaseUrl.spec;
import static stepdefinitions.uiStepDefinitions.SD06_DeanManagementStepDefinition.deanObjectPojo;

public class API_SD06_DeanManagement {
    Response response;
    DeanPojo expectedData;
    int userIdPojo;
    String userNamePojo;

    @Given("Kayitli deanin userId bilgisi alinir_API")
    public void kayitliDeaninUserIdBilgisiAlinir_API() {
        setup("AdminB103", "12345678");

        String ssn = deanObjectPojo.getSsn();
        spec.pathParams("first", "dean", "second", "getAll");
        response = given(spec).get("{first}/{second}");

        JsonPath jsonPath = response.jsonPath();
        List<Integer> userIdList = jsonPath.getList("findAll{it.ssn=='" + ssn + "'}.userId");

        int userId = userIdList.get(0);
        deanObjectPojo.setUserId(userId);
        userIdPojo = deanObjectPojo.getUserId();

    }
    @And("Kayitli dean userId ile cagrilir")
    public void kayitliDeanUserIdIleCagrilir() {
        spec.pathParams("first", "dean", "second", "getManagerById", "third", userIdPojo);
        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("Dean bilgileri dogrulanir")
    public void deanBilgileriDogrulanir() {

        expectedData = new DeanPojo("OK", "Dean successfully found", deanObjectPojo);

        DeanPojo actualDataPojoGson = new Gson().fromJson(response.asString(), DeanPojo.class);
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getObject().getBirthDay(), actualDataPojoGson.getObject().getBirthDay());
        assertEquals(expectedData.getObject().getBirthPlace(), actualDataPojoGson.getObject().getBirthPlace());
        assertEquals(expectedData.getObject().getGender(), actualDataPojoGson.getObject().getGender());
        assertEquals(expectedData.getObject().getName(), actualDataPojoGson.getObject().getName());
        assertEquals(expectedData.getObject().getPhoneNumber(), actualDataPojoGson.getObject().getPhoneNumber());
        assertEquals(expectedData.getObject().getSsn(), actualDataPojoGson.getObject().getSsn());
        assertEquals(expectedData.getObject().getSurname(), actualDataPojoGson.getObject().getSurname()); //capraz kullanim
        assertEquals(expectedData.getObject().getUsername(), actualDataPojoGson.getObject().getUsername()); //capraz kullanim
        assertEquals(expectedData.getMessage(), actualDataPojoGson.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualDataPojoGson.getHttpStatus());
    }

    @And("Kayitli dean silinir")
    public void kayitliDeanSilinir() {
        spec.pathParams("first", "dean", "second", "delete", "third", userIdPojo);
        response = given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();

        assertEquals(200, response.statusCode());
    }

    @Then("gelen bodyde dean username {string} bulunmamalı")
    public void gelen_bodyde_dean_username_bulunmamali(String username) {
        JsonPath jsonPath = response.jsonPath();
        List<Object> actBodylist = jsonPath.getList("findAll{it.username=='"+username+"'}");

        assertEquals(200,response.statusCode());
        assertTrue(actBodylist.isEmpty());
    }

    @Given("Get request ile tum deanleri cagir")
    public void getRequestIleTumDeanleriCagir() {
        setup("AdminB103", "12345678");
        spec.pathParams("first","dean","second","getAll");

        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
    }
    @Then("Dean name bilgisi update edilir")
    public void deanNameBilgisiUpdateEdilir() {

        JsonPath jsonPath = response.jsonPath();
        List<Integer> nameList = jsonPath.getList("findAll{it.deanName=='" + "Ali Can" + "'}.name");
        String userName = nameList.get(0).toString();

        deanObjectPojo.setUsername(userName);
        userNamePojo = deanObjectPojo.getUsername();

        String  deanName= deanObjectPojo.getName();
        deanObjectPojo.setUsername(deanName);
        userNamePojo=deanObjectPojo.getUsername();

        spec.pathParams("first", "dean", "second", "update", "third", userIdPojo);
        response = given(spec).get("{first}/{second}/{third}");

        expectedData = new DeanPojo("OK", "Dean updated Successful", deanObjectPojo);



    }



}
