package stepdefinitions.dbStepDefinitions;


import io.cucumber.java.en.*;
import utilities.ReusableMethods;

import java.sql.*;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import static stepdefinitions.uiStepDefinitions.SD09_TeacherManagementStepDefinition.teacherObjectPojo;
import static stepdefinitions.uiStepDefinitions.SD14_ContactGetAllStepDefiniton.contactContentPojo;


public class DB_SD14_ContactGetAll {
    ResultSet resultSet;
    Connection connection;
    Statement statement;

    @Given("Dean kayitli tum contact mesajlari cagirir_DB")
    public void deanKayitliTumContactMesajlariCagirir_DB() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT COUNT(*) FROM contact_message;");

        resultSet.next();
    }

    @And("Dean kayitli tum mesajlarin geldigini dogrular_DB")
    public void deanKayitliButunMesajlarinGeldiginiDogrular_DB() throws SQLException {
        String mesajSayisiSQL = resultSet.getString("count");
        String mesajSayisiPojo = String.valueOf(contactContentPojo.getToplamMesajSayisi());
        assertTrue(mesajSayisiSQL.contains(mesajSayisiPojo));

        connection.close();
        statement.close();
        resultSet.close();
    }

    @And("Kayitli mesajin geldigini dogrular_DB")
    public void kayitliMesajinGeldiginiDogrular_DB() throws SQLException {
        assertEquals(contactContentPojo.getSubject(), resultSet.getString("subject"));
        assertEquals(contactContentPojo.getName(), resultSet.getString("name"));
        assertEquals(contactContentPojo.getEmail(), resultSet.getString("email"));
        assertEquals(contactContentPojo.getMessage(), resultSet.getString("message"));
    }


    @Given("Kayitli contact mesajlari Email ile cagirir_DB")
    public void kayitliContactMesajlariEmailIleCagirir_DB() throws SQLException {
        String email = contactContentPojo.getEmail();
        System.out.println("email = " + email);
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        ReusableMethods.waitFor(5);
        resultSet = statement.executeQuery("SELECT * FROM contact_message WHERE email = '" + email + "'");

        resultSet.next();
    }

    @Given("Kayitli contact mesajlari Subject ile cagirir_DB")
    public void kayitliContactMesajlariSubjectIleCagirir_DB() throws SQLException {
        String subject = contactContentPojo.getSubject();
        System.out.println("subject = " + subject);
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        ReusableMethods.waitFor(5);
        resultSet = statement.executeQuery("SELECT * FROM contact_message WHERE subject = '" + subject + "'");

        resultSet.next();
    }
}


