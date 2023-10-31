package stepdefinitions.apiStepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.AdminPojo;

import java.util.List;
import java.util.Map;

import static base_url.ManagementSchoolBaseUrl.setup;
import static base_url.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepdefinitions.uiStepDefinitions.SD05_AdminManagementStepDefinition.adminPojo;


public class API_SD05_AdminManagement {
    Response response;
    List<Map<String,Object>> actualData;
    List<Integer> idList;
    public static int id;


    @Given("Kayit olan admin userid si alinir")
    public void kayit_olan_admin_userid_si_alinir() {
        setup("AdminB103","12345678");
        String username=adminPojo.getUsername();

        spec.pathParams("first", "admin", "second", "getAll").
                queryParams("size", 1000, "sort", "id");

        response = given(spec).get("{first}/{second}");
        //response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();

        actualData = jsonPath.getList("content.findAll{it.username=='" + username + "'}");
        System.out.println("actualData.size() = " + actualData.size());
        System.out.println("actualData = " + actualData);
        idList = jsonPath.getList("content.findAll{it.username=='"+username + "'}.id");
        System.out.println("idList = " + idList);
        id=idList.get(0);
        adminPojo= new AdminPojo(id,
                adminPojo.getName(),
                adminPojo.getSurname(),
                adminPojo.getUsername(),
                adminPojo.getPhoneNumber(),
                adminPojo.getSsn(),
                adminPojo.getBirthDay(),
                adminPojo.getBirthPlace(),
                "MALE");

        System.out.println("----------------------------------------------------------------");
        System.out.println("expectedData = " + adminPojo);
        System.out.println("----------------------------------------------------------------");
        System.out.println("actualData = " + actualData);
        System.out.println("----------------------------------------------------------------");

    }
    @Then("Admin kaydinin yapildigi dogrulanir")
    public void admin_kaydinin_yapildigi_dogrulanir() {

        assertEquals(200, response.statusCode());

        assertEquals(adminPojo.getName(), ((actualData)).get(0).get("name"));
        assertEquals(adminPojo.getSurname(), ((actualData)).get(0).get("surname"));
        assertEquals(adminPojo.getId(), ((actualData)).get(0).get("id"));
        assertEquals(adminPojo.getUsername(), ((actualData)).get(0).get("username"));
        assertEquals(adminPojo.getSsn(), ((actualData)).get(0).get("ssn"));
        assertEquals(adminPojo.getBirthDay(), ((actualData)).get(0).get("birthDay"));
        assertEquals(adminPojo.getBirthPlace(), ((actualData)).get(0).get("birthPlace"));
        assertEquals(adminPojo.getPhoneNumber(), ((actualData)).get(0).get("phoneNumber"));
        assertEquals(adminPojo.getGender(), ((actualData)).get(0).get("gender"));
    }

    @Given("Kayitli admin silinir")
    public void kayitli_admin_silinir() {
        spec.pathParams("first", "admin", "second", "delete", "third", id);
        response = given(spec).delete("{first}/{second}/{third}");
        System.out.println("StatusCode = " + response.statusCode());
        System.out.println(id + " id nolu admin bilgileri silindi.");
        response.prettyPrint();
    }


    @Then("Admin kaydinin silindigi dogrulanir")
    public void admin_kaydinin_silindigi_dogrulanir() {
        assertEquals(200, response.statusCode());
        assertTrue(response.asString().contains("Admin deleted Successful"));
        System.out.println(id + " id nolu admin kaydının silindiği doğrulandı.");
    }




    }
