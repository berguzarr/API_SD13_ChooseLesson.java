package stepdefinitions.apiStepDefinitions;


import com.google.gson.Gson;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.AdminObjectPojo;
import pojos.DeanObjectPojo;
import pojos.DeanPojo;
import utilities.ReusableMethods;

import java.util.List;

import static base_url.ManagementSchoolBaseUrl.setup;
import static base_url.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.uiStepDefinitions.SD07_ViceDeanManagementStepDefinition.adminObjectPojo;


public class API_SD07_ViceDeanManagement {
    Response response;
    DeanObjectPojo expectedData;
    String userIdPojo;
    String expectedPhoneNumber;
    String actualPhoneNumber;
    AdminObjectPojo object;
    DeanObjectPojo deanObjectPojo=new DeanObjectPojo();

    @Given("Kayitli Vice Dean userId bilgisi alinir_API_Ab")
    public void KayitliViceDeanuserIdBilgisiAlinirAPI_Ab(){
        setup("einstein.aa", "canada1234");
        spec.pathParams("first","ViceDean" , "second", "getAll");
        response=given(spec).get("{first/second");
        //String username = DeanObjectPojo.getName();

    }
    @And("Kayitli Vice Dean userId ile cagirilir_Ab")
    public void KayitliViceDeanuserIdilecagirilir_Ab(){
        spec.pathParams("first","vicedean","second","getViceDeanById","third",userIdPojo);
        response=given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();
    }
    @When("Vice Dean bilgileri dogrulanir_Ab")
    public void  ViceDeanBilgileriDogrulanir_Ab(){
        deanObjectPojo=new DeanObjectPojo(userIdPojo ,
                deanObjectPojo.getBirthDay(),
                deanObjectPojo.getGender(),
                deanObjectPojo.getName(),
                deanObjectPojo.getPhoneNumber(),
                deanObjectPojo.getSsn(),
                deanObjectPojo.getSurname(),
                deanObjectPojo.getUserId(),
                deanObjectPojo.getUsername());
        DeanPojo actualDataPojoGson =new Gson().fromJson(response.asString(), DeanPojo.class);
        assertEquals(200,response.statusCode());
        assertEquals(deanObjectPojo.getBirthDay(),actualDataPojoGson.getObject().getBirthDay());
        assertEquals(deanObjectPojo.getGender(),actualDataPojoGson.getObject().getGender());
        assertEquals(deanObjectPojo.getName(),actualDataPojoGson.getObject().getName());
        assertEquals(deanObjectPojo.getPhoneNumber(),actualDataPojoGson.getObject().getPhoneNumber());
        assertEquals(deanObjectPojo.getSsn(),actualDataPojoGson.getObject().getSsn());
        assertEquals(deanObjectPojo.getSurname(),actualDataPojoGson.getObject().getSurname());
        assertEquals(deanObjectPojo.getUsername(),actualDataPojoGson.getObject().getUsername());
    }



    @Given("User sets the url_Koz")
    public void user_sets_the_url_koz() {
        ReusableMethods.waitFor(5);
        setup("alexdesouza", "Kral1907");
        spec.pathParams("first", "vicedean", "second", "getAll");
    }
    @When("User sets the expected data_Koz")
    public void user_sets_the_expected_data_koz() {
        expectedPhoneNumber = adminObjectPojo.getPhoneNumber();
    }
    @When("User sends post request and gets the response_Koz")
    public void user_sends_post_request_and_gets_the_response_koz() {
        response = given(spec).get("{first}/{second}");
        JsonPath jsonPath = response.jsonPath();
        List<String> phoneNumberList = jsonPath.getList("findAll{it.phoneNumber=='" +expectedPhoneNumber+ "'}.phoneNumber");
        List<Integer> idList = jsonPath.getList("findAll{it.phoneNumber=='" +expectedPhoneNumber+ "'}.userId");
        actualPhoneNumber = phoneNumberList.get(0);
        adminObjectPojo.setUserId(idList.get(0));

    }
    @Then("User does assertion_Koz")
    public void user_does_assertion_koz() {
        Assert.assertEquals(expectedPhoneNumber,actualPhoneNumber);
        Assert.assertEquals(200, response.statusCode());
    }



    @And("Vice Dean silinir")
    public void viceDeanSilinir() {

        spec.pathParams("first", "vicedean", "second", "delete", "third", userIdPojo);
        response = given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();

        assertEquals(200, response.statusCode());
    }

    @Given("User sets the url_Koz_Admin")
    public void userSetsTheUrl_Koz_Admin() {
        setup("AdminB103", "12345678");
        spec.pathParams("first", "vicedean", "second", "getAll");
    }
}
