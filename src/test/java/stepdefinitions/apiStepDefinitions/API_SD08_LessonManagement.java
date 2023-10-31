package stepdefinitions.apiStepDefinitions;

import com.google.gson.Gson;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static base_url.ManagementSchoolBaseUrl.setup;
import static base_url.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.uiStepDefinitions.SD08_LessonManagementStepDefinition.lessonPojo;


public class API_SD08_LessonManagement {
    Response response;
    LessonPojo expectedData;
    LessonProgramObjectPojo object;
    LessonProgramPojo expectedDatasvd;
    @Given("Kaydedilen dersin lessonId bilgisi alinir")
    public void kaydedilen_dersin_lesson_id_bilgisi_alinir() {
        setup("gurkayvd", "22qw76AS*");

        spec.pathParams("first", "lessons", "second", "getAll");
        response = given(spec).get("{first}/{second}");

        JsonPath jsonPath = response.jsonPath();
        List<Integer> lessonIdList = jsonPath.getList("findAll{it.lessonName=='" + lessonPojo.getLessonName() + "'}.lessonId");
        lessonPojo.setLessonId(lessonIdList.get(0));

    }

    @Given("Kaydedilen ders lessonId ile cagirilir")
    public void kaydedilen_ders_lesson_id_ile_cagirilir() {
        spec.pathParams("first", "lessons", "second", "getAllLessonByLessonId").queryParam("lessonId", lessonPojo.getLessonId());
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();

    }
    @Then("Lesson bilgileri dogrulanir")
    public void lesson_bilgileri_dogrulanir() {
        expectedData = new LessonPojo(lessonPojo.getLessonId(),
                lessonPojo.getLessonName(),
                lessonPojo.getCreditScore(),
                lessonPojo.isCompulsory());

        LessonPojo[] actualData = new Gson().fromJson(response.asString(), LessonPojo[].class);
        assertEquals(200, response.statusCode());
        assertEquals(1, actualData.length);
        assertEquals(expectedData.getLessonName(), actualData[0].getLessonName());
        assertEquals(expectedData.getCreditScore(), actualData[0].getCreditScore());
        assertEquals(expectedData.isCompulsory(), actualData[0].isCompulsory());
    }

    @Then("Kayitli lesson silinir")
    public void kayitli_lesson_silinir() {
        spec.pathParams("first", "lessons", "second", "delete", "third", lessonPojo.getLessonId());
        response = given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();

        assertEquals(200, response.statusCode());

    }










































































































































































































  //US10 API_ABAT
  @Given("Vice Dean kayitli lesson program ders cagirir_API_Ab")
    public void ViceDeanKayitliLessonProgramDersCagirir_API_Ab(){
        setup("einstein.aa", "canada1234");

        spec.pathParams("first","lessonPrograms","second", "getAll");
        response=given(spec).get("{first}/{second}");
        JsonPath jsonPath=response.jsonPath();
        response.prettyPrint();
        //String lessonName = lessonPojo.getLessonName();

    }
    @When("Kaydedilen lessonProgram dersleri dogrulanir_Ab")
    public void KaydedilenLessonProgramDersleriDogrulanir_Ab(){
        Assert.assertEquals(200,response.statusCode());

    }
    @When("Kayitli Lesson Program silinir_Ab")
    public void KayitliLessonProgramSilinir_Ab(){
        spec.pathParams("first","lessonPrograms","second","delete","third","id");

        response=given(spec).delete("{first}/{second}/{id)");
        response.prettyPrint();
        assertEquals(200, response.statusCode());

    }


























































































































    // SEVDA ISIK 200. Satir
//   PostApiSevda


    @Given("Gerekli bilgileri olusturur")
    public void gerekli_bilgileri_olusturur() {
        setup("Conroy", "12345678");

        List<Integer> lesson = new ArrayList<>();
        lesson.add(3);
        lesson.add(1);

        spec.pathParams("first", "lessonPrograms", "second", "save");
        object = new LessonProgramObjectPojo("MONDAY", 5, lesson, "12:00", "14:00");
        expectedDatasvd = new LessonProgramPojo(object, "Created Lesson Program", "CREATED");
        // System.out.println(expectedData);
        response = given(spec).body(object).post("{first}/{second}");
        response.prettyPrint();

    }

    @Then("Olusturulan bilgileri kontrol eder")
    public void olusturulan_bilgileri_kontrol_eder() {
        response.then().statusCode(200).body("message", equalTo("Created Lesson Program"));
        spec.pathParams("first", "lessonPrograms", "second", "getAllAssigned");
        response = given(spec).body(object).get("{first}/{second}");
        response.prettyPrint();

    }
















}


























