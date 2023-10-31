package stepdefinitions.apiStepDefinitions;


import com.google.gson.Gson;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.*;

import java.util.List;
import static base_url.ManagementSchoolBaseUrl.setup;
import static base_url.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.uiStepDefinitions.SD14_ContactGetAllStepDefiniton.contactContentPojo;


public class API_SD14_ContactGetAll {
    Response response;
    ContactResponsePojo expectedData;
    String emailPojo;
    String subjectPojo;
    int numberOfElement;

    @Given("Dean kayitli mesajlari cagirir_API")
    public void deanKayitliMesajlariCagirir_Api() {
        setup("D.Hababam", "1234Ss+*");

        String name= contactContentPojo.getName();
        String subject= contactContentPojo.getSubject();
        System.out.println(subject);
        // http://164.92.252.42:8080/contactMessages/getAll?page=0&size=1000&sort=date&type=desc
        spec.pathParams("first", "contactMessages", "second", "getAll").queryParams("page",0, "size", 1000, "sort", "date", "type", "desc");
        response = given(spec).get("{first}/{second}");
        contactContentPojo.setResponse(response);

        JsonPath jsonPath = contactContentPojo.getResponse().jsonPath();
        numberOfElement= contactContentPojo.getResponse().jsonPath().getInt("numberOfElements");
        System.out.println("numberOfElement = " + numberOfElement);

    }

    @And("Dean Kayitli butun mesajlarin geldigini dogrular_API")
    public void deanKayitliButunMesajlarinGeldiginiDogrular_API() {
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(contactContentPojo.getToplamMesajSayisi(), numberOfElement);
    }

    @Given("Kayitli contact mesajlari Email ile cagirir_API")
    public void kayitliContactMesajlariEmailIleCagirir_API() {
        String name= contactContentPojo.getName();
        System.out.println("name = " + name);
//        // http://164.92.252.42:8080/contactMessages/getAll?page=0&size=1000&sort=date&type=desc
//        spec.pathParams("first", "contactMessages", "second", "getAll").queryParams("page",0, "size", 1000, "sort", "date", "type", "desc");
//        response = given(spec).get("{first}/{second}");

        JsonPath jsonPath = contactContentPojo.getResponse().jsonPath();
        List<Integer> emailList = contactContentPojo.getResponse().jsonPath().getList("content.findAll{it.name=='"+name+"'}.email");
        System.out.println(emailList);

        String email = String.valueOf(emailList.get(0));
        System.out.println(email);
        contactContentPojo.setEmail(email);
        emailPojo=contactContentPojo.getEmail();
    }

    @And("Contact mesajlar icinde son gonderilenin Email i alinir_API")
    public void contactMesajlarIcindeSonGonderileninEmailIAlinir_API() {
        // http://164.92.252.42:8080/contactMessages/searchByEmail?email=77414%40hababam.com&page=0&size=1000&sort=date&type=desc
        spec.pathParams("first", "contactMessages", "second", "searchByEmail").queryParams("email", emailPojo);
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
    }

    @And("Contact Mesaj bilgileri dogrulanir_API")
    public void contactMesajBilgileriDogrulanir_API() {
        String emailSorgu= contactContentPojo.getEmail();
        JsonPath jsonPath = contactContentPojo.getResponse().jsonPath();
        List<Integer> name = jsonPath.getList("content.findAll{it.email=='"+emailSorgu+"'}.name");
        String actualName = String.valueOf(name.get(0));
        List<Integer> email = jsonPath.getList("content.findAll{it.email=='"+emailSorgu+"'}.email");
        String actualEmail = String.valueOf(email.get(0));
        List<Integer> subject = jsonPath.getList("content.findAll{it.email=='"+emailSorgu+"'}.subject");
        String actualSubject = String.valueOf(subject.get(0));
        List<Integer> message = jsonPath.getList("content.findAll{it.email=='"+emailSorgu+"'}.message");
        String actualMessage = String.valueOf(message.get(0));

        assertEquals(200,response.statusCode());
        assertEquals(contactContentPojo.getName(), actualName);
        assertEquals(contactContentPojo.getEmail(), actualEmail);
        assertEquals(contactContentPojo.getSubject(), actualSubject);
        assertEquals(contactContentPojo.getMessage(), actualMessage);


    }

//    @And("Contact Mesaj bilgileri dogrulanir_API")
//    public void contactMesajBilgileriDogrulanir_API() {
//        contactContentPojo =new ContactContentPojo(contactContentPojo.getDate(),
//                                                    contactContentPojo.getEmail(),
//                                                    contactContentPojo.getMessage(),
//                                                    contactContentPojo.getName(),
//                                                    contactContentPojo.getSubject());
//
//        expectedData = new ContactResponsePojo(contactContentPojo, 1, 1);
///*
// String jsonString = "{\"employees\":[{\"name\":\"Raja Ramesh\", \"technology\":\"Java\"}]}";
//      Gson gson = new Gson();
//      Software software = gson.fromJson(jsonString, Software.class);
//      System.out.println(software);
// */
//
//        ContactResponsePojo actualDataPojoGson = new Gson().fromJson(response.asString(), ContactResponsePojo.class);
//        assertEquals(200, response.statusCode());
//        assertEquals(contactContentPojo.getName(), actualDataPojoGson.getContent().getName());
//        assertEquals(contactContentPojo.getEmail(), actualDataPojoGson.getContent().getEmail());
//        assertEquals(contactContentPojo.getSubject(), actualDataPojoGson.getContent().getSubject());
//        assertEquals(contactContentPojo.getMessage(), actualDataPojoGson.getContent().getMessage());
//
//        assertEquals(expectedData.getNumberOfElements(), actualDataPojoGson.getNumberOfElements());
//        assertEquals(expectedData.getTotalPages(), actualDataPojoGson.getTotalPages());
//    }

    @Given("Kayitli contact mesajlari Subject ile cagirir_API")
    public void kayitliContactMesajlariSubjectIleCagirir_API() {
        String name= contactContentPojo.getName();
        System.out.println("name = " + name);

//        // http://164.92.252.42:8080/contactMessages/getAll?page=0&size=1000&sort=date&type=desc
//        spec.pathParams("first", "contactMessages", "second", "getAll").queryParams("page",0, "size", 1000, "sort", "date", "type", "desc");
//        response = given(spec).get("{first}/{second}");

        JsonPath jsonPath = contactContentPojo.getResponse().jsonPath();
        List<Integer> subjectList = contactContentPojo.getResponse().jsonPath().getList("content.findAll{it.name=='"+name+"'}.subject");
        System.out.println(subjectList);

        String subject = String.valueOf(subjectList.get(0));
        contactContentPojo.setSubject(subject);
        System.out.println(subject);
        subjectPojo=contactContentPojo.getSubject();
    }

    @And("Contact mesajlar icinde son gonderilenin Subject i alinir_API")
    public void contactMesajlarIcindeSonGonderileninSubjectIAlinir_API() {
        String name= contactContentPojo.getName();
        System.out.println(name);
//        // http://164.92.252.42:8080/contactMessages/getAll?page=0&size=1000&sort=date&type=desc
//        spec.pathParams("first", "contactMessages", "second", "getAll").queryParams("page",0, "size", 1000, "sort", "date", "type", "desc");
//        response = given(spec).get("{first}/{second}");

        JsonPath jsonPath = contactContentPojo.getResponse().jsonPath();
        List<Integer> subjectList = contactContentPojo.getResponse().jsonPath().getList("content.findAll{it.name=='"+name+"'}.subject");
        System.out.println(subjectList);

        String subject = String.valueOf(subjectList.get(0));
        System.out.println(subject);
        contactContentPojo.setSubject(subject);
        emailPojo=contactContentPojo.getSubject();
    }

    @And("Contact Mesaj bilgileri dogrulanir_Subject_ile_sorgu_API")
    public void contactMesajBilgileriDogrulanir_Subject_ile_sorgu_API() {
        String subjectSorgu= contactContentPojo.getSubject();
        JsonPath jsonPath = contactContentPojo.getResponse().jsonPath();
        List<Integer> name = jsonPath.getList("content.findAll{it.subject=='"+subjectSorgu+"'}.name");
        String actualName = String.valueOf(name.get(0));
        List<Integer> email = jsonPath.getList("content.findAll{it.subject=='"+subjectSorgu+"'}.email");
        String actualEmail = String.valueOf(email.get(0));
        List<Integer> subject = jsonPath.getList("content.findAll{it.subject=='"+subjectSorgu+"'}.subject");
        String actualSubject = String.valueOf(subject.get(0));
        List<Integer> message = jsonPath.getList("content.findAll{it.subject=='"+subjectSorgu+"'}.message");
        String actualMessage = String.valueOf(message.get(0));

        assertEquals(200, contactContentPojo.getResponse().statusCode());
        assertEquals(contactContentPojo.getName(), actualName);
        assertEquals(contactContentPojo.getEmail(), actualEmail);
        assertEquals(contactContentPojo.getSubject(), actualSubject);
        assertEquals(contactContentPojo.getMessage(), actualMessage);


    }



}
