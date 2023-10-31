package stepdefinitions.apiStepDefinitions;

import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.StudentObjectPojo;
import java.util.List;
import static base_url.ManagementSchoolBaseUrl.setup;
import static base_url.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.uiStepDefinitions.SD09_TeacherManagementStepDefinition.studentObjectPojo;



public class API_SD10_StudentManagement {
    Response response;
    JsonPath jsonPath;
    StudentObjectPojo expectedData;
    int idPojo;

    @Given("Kayitli Ogrencinin Id bilgisi alinir_API")
    public void kayitli_ogrencinin_id_bilgisi_alinir_api() {
        setup("meryem25", "12345678");

        String email = studentObjectPojo.getEmail();
        System.out.println(email);

        spec.pathParams("first", "students", "second", "getAll");
        response = given(spec).get("{first}/{second}");
        JsonPath jsonPath = response.jsonPath();
        List<Integer> idList = jsonPath.getList("findAll{it.email=='" + email + "'}.userId");
        System.out.println(idList);

        int id = idList.get(0);
        studentObjectPojo.setId(id);
        idPojo = studentObjectPojo.getId();
    }

    @And("Kayitli Ogrenci userId ile cagirilir")
    public void kayitli_ogrenci_user_id_ile_cagirilir() {
        spec.pathParams("first", "students", "second", "getStudentById").queryParam("id", idPojo);
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();

    }

    @Then("Ogrenci bilgileri dogrulanir")
    public void ogrenciBilgileriDogrulanir() {
        studentObjectPojo = new StudentObjectPojo(
                studentObjectPojo.getId(),
                studentObjectPojo.getUsername(),
                studentObjectPojo.getSsn(),
                studentObjectPojo.getName(),
                studentObjectPojo.getSurname(),
                studentObjectPojo.getBirthDay(),
                studentObjectPojo.getBirthPlace(),
                studentObjectPojo.getPhoneNumber(),
                studentObjectPojo.getGender(),
                studentObjectPojo.getMotherName(),
                studentObjectPojo.getFatherName(),
                studentObjectPojo.getStudentNumber(),
                studentObjectPojo.getEmail(),
                studentObjectPojo.isActive());


        expectedData = new StudentObjectPojo();
        StudentObjectPojo actualDataPojoGson = new Gson().fromJson(response.asString(), StudentObjectPojo.class);
        assertEquals(200, response.statusCode());
        assertEquals(studentObjectPojo.getUsername(), actualDataPojoGson.getUsername());
        assertEquals(studentObjectPojo.getSsn(), actualDataPojoGson.getSsn());
        assertEquals(studentObjectPojo.getName(), actualDataPojoGson.getName());
        assertEquals(studentObjectPojo.getSurname(), actualDataPojoGson.getSurname());
        assertEquals(studentObjectPojo.getBirthDay(), actualDataPojoGson.getBirthDay());
        assertEquals(studentObjectPojo.getBirthPlace(), actualDataPojoGson.getBirthPlace());
        assertEquals(studentObjectPojo.getPhoneNumber(), actualDataPojoGson.getPhoneNumber());
        assertEquals(studentObjectPojo.getGender(), actualDataPojoGson.getGender());
        assertEquals(studentObjectPojo.getMotherName(), actualDataPojoGson.getMotherName());
        assertEquals(studentObjectPojo.getFatherName(), actualDataPojoGson.getFatherName());
        assertEquals(studentObjectPojo.getEmail(), actualDataPojoGson.getEmail());


    }



    @And("Kayitli ogrenci silinir")
    public void kayitliOgrenciSilinir() {
        spec.pathParams("first", "students", "second", "delete", "third", idPojo);
        response = given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();

        assertEquals(200, response.statusCode());
    }


    @Then("ogrencinin silindigi dogrulanir")
    public void ogrencininSilindigiDogrulanir() {
        assertEquals(200,response.statusCode());
        assertEquals("Student Deleted", response.jsonPath().getString("message"));
        assertEquals("OK", response.jsonPath().getString("httpStatus"));
        System.out.println(studentObjectPojo.getId() + " id nolu ogrenci kaydinin silindigi dogrulanir");
    }
}



