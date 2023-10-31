package stepdefinitions.apiStepDefinitions;

import com.google.gson.Gson;
import io.cucumber.java.en.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import pojos.TeacherObjectPojo;
import pojos.TeacherPojo;

import java.util.List;

import static base_url.ManagementSchoolBaseUrl.setup;
import static base_url.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static stepdefinitions.uiStepDefinitions.SD09_TeacherManagementStepDefinition.teacherObjectPojo;

public class API_SD09_TeacherManagement {

    Response response;
    JsonPath jsonPath;
    TeacherPojo expectedData;
    List<Integer> userIdList;

    @Given("{string} yetkisi ile giris yapilir")
    public void yetkisiIleGirisYapılır(String str) {
        if (str.equals("Vice Dean")) {
            setup("gurkayvd", "22qw76AS*");
            System.out.println("Vice Dean yetkisi ile giriş yapıldı.");
        } else if (str.equals("Admin")) {
            setup("gurkayadm", "22qw76AS*");
            System.out.println("Admin yetkisi ile giriş yapıldı.");
        }else {
            System.out.println("Hatalı veri girdiniz.");
        }
    }
    @And("Kayitli ogretmenin userId bilgisi alinir")
    public void kayitliOgretmeninUserIdBilgisiAlinir() {
        spec.pathParams("first", "teachers", "second", "getAll");
        response = given(spec).get("{first}/{second}");

        jsonPath = response.jsonPath();
        userIdList = jsonPath.getList("findAll{it.email=='" + teacherObjectPojo.getEmail() + "'}.userId");
        teacherObjectPojo.setUserId(userIdList.get(0));
        System.out.println("Kayıtlı öğretmen userId bilgisi alındı: " + teacherObjectPojo.getUserId());
    }

    @And("Kayitli ogretmen userId ile cagrilir")
    public void kayitliOgretmenUserIdIleCagrilir() {
        spec.pathParams("first", "teachers", "second", "getSavedTeacherById", "third", teacherObjectPojo.getUserId());
        response = given(spec).get("{first}/{second}/{third}");
        System.out.println("Kayıtlı öğretmen " + teacherObjectPojo.getUserId() + " nolu userId ile çağrıldı.");
        response.prettyPrint();
        jsonPath = response.jsonPath();
    }

    @Then("Ogretmen bilgileri dogrulanir")
    public void ogretmenBilgileriDogrulanir() {
        expectedData = new TeacherPojo(teacherObjectPojo, "Teacher successfully found", "OK");

        TeacherPojo actualDataPojoGson = new Gson().fromJson(response.asString(), TeacherPojo.class);

        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getObject().getUsername(), actualDataPojoGson.getObject().getUsername());
        assertEquals(expectedData.getObject().getName(), actualDataPojoGson.getObject().getName());
        assertEquals(expectedData.getObject().getSurname(), actualDataPojoGson.getObject().getSurname());
        assertEquals(expectedData.getObject().getBirthDay(), actualDataPojoGson.getObject().getBirthDay());
        assertEquals(expectedData.getObject().getSsn(), actualDataPojoGson.getObject().getSsn());
        assertEquals(expectedData.getObject().getBirthPlace(), actualDataPojoGson.getObject().getBirthPlace());
        assertEquals(expectedData.getObject().getPhoneNumber(), actualDataPojoGson.getObject().getPhoneNumber());
        assertEquals(expectedData.getObject().getGender(), actualDataPojoGson.getObject().getGender());
        assertEquals(expectedData.getObject().getEmail(), actualDataPojoGson.getObject().getEmail());

        assertEquals(expectedData.getMessage(), actualDataPojoGson.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualDataPojoGson.getHttpStatus());
        System.out.println(teacherObjectPojo.getUserId() + " userId nolu öğretmen bilgileri doğrulandı.");
    }

    @Then("Birden fazla ders secildigi dogrulanir")
    public void birdenFazlaDersSecildigiDogrulanir() {
        if (jsonPath.getString("object").contains("lessonPrograms")) {
            List<Object> lessons = jsonPath.getList("object.lessonPrograms");
            int numOfLessons = lessons.size();
            assertTrue(numOfLessons > 1);
            System.out.println(numOfLessons + " adet ders secildi.");
        }else {
            assertTrue(jsonPath.getString("object").contains("lessonPrograms"));
            System.out.println("Response'ta lessonPrograms bilgisi yoktur.");
        }
    }

    @Then("Kaydin gerceklesmedigi dogrulanir")
    public void kaydinGerceklesmedigiDogrulanir() {
        assertEquals(404, response.statusCode());
        assertEquals("Error: User with SSN " + teacherObjectPojo.getUserId() + " not found", response.jsonPath().getString("message"));
    }

    @Then("Kayitli ogretmen silinir")
    public void kayitli_ogretmen_silinir() {
        spec.pathParams("first", "teachers", "second", "delete", "third", teacherObjectPojo.getUserId());
        response = given(spec).delete("{first}/{second}/{third}");
        System.out.println(teacherObjectPojo.getUserId() + " userId nolu öğretmen bilgileri silindi.");
        response.prettyPrint();
    }

    @Then("Kayitli iki ogretmen silinir")
    public void kayitli_iki_ogretmen_silinir() {
        spec.pathParams("first", "teachers", "second", "delete", "third", teacherObjectPojo.getUserId());
        response = given(spec).delete("{first}/{second}/{third}");
        System.out.println(teacherObjectPojo.getUserId() + " userId nolu öğretmen bilgileri silindi.");
        response.prettyPrint();

        spec.pathParams("first", "teachers", "second", "delete", "third", teacherObjectPojo.getUserId()+1);
        response = given(spec).delete("{first}/{second}/{third}");
        System.out.println(teacherObjectPojo.getUserId()+1 + " userId nolu öğretmen bilgileri silindi.");
        response.prettyPrint();
    }

    @Then("Ogretmen kaydinin silindigi dogrulanir")
    public void ogretmenKaydininSilindigiDogrulanir() {
        assertEquals(200, response.statusCode());
        assertEquals("Teacher Deleted", response.jsonPath().getString("message"));
        assertEquals("OK", response.jsonPath().getString("httpStatus"));
        System.out.println(teacherObjectPojo.getUserId() + " userId nolu öğretmen kaydının silindiği doğrulandı.");
    }


    @Given("Get request ile tum teacherlari al")
    public void getRequestIleTumTeacherlariAl() {


        setup("Conroy", "12345678");


        spec.pathParams("first", "teachers", "second", "getSavedTeacherById", "third", 2);

        //Set the expected data
        teacherObjectPojo = new TeacherObjectPojo(2, "Huseyin01", "Hacı Hüseyin", "Bulat", "1994-02-01", "333-11-5642", "Ankara", "505-305-2425", "MALE", "selam@hotmail.com");
        expectedData = new TeacherPojo(teacherObjectPojo, "Teacher successfully found", "OK");
        System.out.println("expectedData = " + expectedData);

        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();

    }
    @Then("Ayni ogretmen bilgilerine sahip baska bir kayit olmadigi dogrulanir")
    public void ayniOgretmenBilgilerineSahipBaskaBirKayitOlmadigiDogrulanir() {
        assertEquals(1, userIdList.size());
    }



    @Then("Body yi dogrula")
    public void bodyYiDogrula() {

        response.then().statusCode(200).
                body("object.username",equalTo(teacherObjectPojo.getUsername()),
                        "object.name",equalTo(teacherObjectPojo.getName()),
                        "object.surname",equalTo(teacherObjectPojo.getSurname()),
                        "object.birthDay",equalTo(teacherObjectPojo.getBirthDay()),
                        "object.ssn",equalTo(teacherObjectPojo.getSsn()),
                        "object.userId",equalTo(teacherObjectPojo.getUserId()),
                        "object.birthPlace",equalTo(teacherObjectPojo.getBirthPlace()),
                        "object.phoneNumber",equalTo(teacherObjectPojo.getPhoneNumber()),
                        "object.gender",equalTo(teacherObjectPojo.getGender()),
                        "object.email",equalTo(teacherObjectPojo.getEmail()),
                        "message",equalTo(expectedData.getMessage()));






















    }

}