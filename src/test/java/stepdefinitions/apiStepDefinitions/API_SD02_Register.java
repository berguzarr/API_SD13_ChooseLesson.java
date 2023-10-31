package stepdefinitions.apiStepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.RegisterObjectPojo;

import java.util.List;
import java.util.Map;

import static base_url.ManagementSchoolBaseUrl.setup;
import static base_url.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.uiStepDefinitions.SD02_RegisterStepDefinition.registerObjectPojo;
import static stepdefinitions.uiStepDefinitions.SD09_TeacherManagementStepDefinition.teacherObjectPojo;


public class API_SD02_Register {
    Response response;
    public int id;
    List<Map> guestData;

    @Given("Kayitli ogrecinin userid bilgisi alinir_Api")
    public void kayitli_ogrecinin_userid_bilgisi_alinir_api() {

        setup("AdminB103", "12345678");
        String username = registerObjectPojo.getUsername();
        System.out.println(username);

        spec.pathParams("first", "guestUser", "second", "getAll").
                queryParam("size", 1000);
        response = given(spec).get("{first}/{second}");


        JsonPath jsonPath = response.jsonPath();
        guestData = jsonPath.getList("content.findAll{it.username=='" + username + "'}");
        System.out.println("guestData = " + guestData);
        List<Integer> idList=jsonPath.getList("content.findAll{it.username=='"+username + "'}.id");
        System.out.println("idList = " + idList);
        id=idList.get(0);
        registerObjectPojo.setId(id);
        registerObjectPojo=new RegisterObjectPojo(idList.get(0),
                registerObjectPojo.getUsername(),
                registerObjectPojo.getSsn(),
                registerObjectPojo.getName(),
                registerObjectPojo.getSurname(),
                registerObjectPojo.getBirthDay(),
                registerObjectPojo.getBirthPlace(),
                registerObjectPojo.getPhoneNumber(),
                registerObjectPojo.getGender());

        System.out.println("guestData = " + registerObjectPojo);
        System.out.println("actualData = " + registerObjectPojo);
    }

    @Then("Ogrenci bilgileri dogrulanir_z")
    public void ogrenci_bilgileri_dogrulanir_z() {

        assertEquals(200,response.statusCode());
        assertEquals(registerObjectPojo.getId(), ((guestData)).get(0).get("id"));
        assertEquals(registerObjectPojo.getUsername(), ((guestData)).get(0).get("username"));
        assertEquals(registerObjectPojo.getSsn(), ((guestData)).get(0).get("ssn"));
        assertEquals(registerObjectPojo.getName(),((guestData)).get(0).get("name"));
        assertEquals(registerObjectPojo.getSurname(), ((guestData)).get(0).get("surname"));
        assertEquals(registerObjectPojo.getBirthDay(), ((guestData)).get(0).get("birthDay"));
        assertEquals(registerObjectPojo.getBirthPlace(), ((guestData)).get(0).get("birthPlace"));
        assertEquals(registerObjectPojo.getPhoneNumber(), ((guestData)).get(0).get("phoneNumber"));
        assertEquals(registerObjectPojo.getGender(), ((guestData)).get(0).get("gender"));

    }
    @Then("Ogrenci Kaydin gerceklesmedigi dogrulanir")
    public void ogrenci_kaydin_gerceklesmedigi_dogrulanir() {
        assertEquals(400,response.statusCode());


    }




}