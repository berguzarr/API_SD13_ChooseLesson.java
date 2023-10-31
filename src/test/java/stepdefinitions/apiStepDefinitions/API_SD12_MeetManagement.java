package stepdefinitions.apiStepDefinitions;


import base_url.ManagementSchoolBaseUrl;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static base_url.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.apache.poi.ss.formula.CollaboratingWorkbooksEnvironment.setup;
import static stepdefinitions.uiStepDefinitions.SD12_MeetManagementStepDefiniton.*;


public class API_SD12_MeetManagement {
    int actualStatusCode;
    String actualDate;
    Response response;
    @Given("User sets the url Hus")
    public void user_sets_the_url_hus() {
        ManagementSchoolBaseUrl.setup("Huseyin01","12345678");
        spec.pathParams("first","meet","second","getAllMeetByAdvisorTeacherAsList");
    }
    @When("User sets the expected data Hus")
    public void user_sets_the_expected_data_hus() {

    }
    @When("User sends post request and gets the response Hus")
    public void user_sends_post_request_and_gets_the_response_hus() throws ParseException {
        response = given(spec).get("{first}/{second}");
        JsonPath jsonPath = response.jsonPath();
        List<String> dateList = jsonPath.getList("findAll{it.teacherName=='" + "Hacı Hüseyin" + "'}.date");

        String tarih = dateList.get(dateList.size()-1);
        String mevcutFormat = "yyyy-MM-dd";

        try {
            // SimpleDateFormat sınıfını kullanarak mevcut formatı belirtin
            SimpleDateFormat sdfMevcut = new SimpleDateFormat(mevcutFormat);

            // Biçimlendirilmiş tarih formatını belirleyin
            String hedefFormat = "dd.MM.yyyy";

            // SimpleDateFormat sınıfını kullanarak hedef formatı belirtin
            SimpleDateFormat sdfHedef = new SimpleDateFormat(hedefFormat);

            // Biçimlendirilmiş tarihi alın
            Date date = sdfMevcut.parse(tarih);

            // Biçimlendirilmiş tarihi hedef formata göre dönüştürün
            actualDate = sdfHedef.format(date);

            // Sonucu yazdırın
            System.out.println("Mevcut tarih: " + tarih);
            System.out.println("Hedef tarih: " + actualDate);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }



    @Then("User does assertion Hus")
    public void user_does_assertion_hus() {
        Assert.assertNotEquals(expectedDate1,actualDate);
    }


    @Then("User does assertioniki Hus")
    public void userDoesAssertionikiHus() {
        Assert.assertNotEquals(expectedDate2,actualDate);

    }

    @Then("User does assertionuc Hus")
    public void userDoesAssertionucHus() {
        Assert.assertNotEquals(expectedDate3,actualDate);

    }
}
