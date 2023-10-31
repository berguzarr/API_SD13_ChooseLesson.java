package stepdefinitions.dbStepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.uiStepDefinitions.SD07_ViceDeanManagementStepDefinition.adminObjectPojo;
import static stepdefinitions.uiStepDefinitions.SD09_TeacherManagementStepDefinition.teacherObjectPojo;

public class DB_SD07_ViceDeanManagement {

    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("Kayitli Vice Dean UserId bilgisi ile sorgu yapilir")
    public void kayitli_vice_dean_user_id_bilgisi_ile_sorgu_yapilir() throws SQLException {
        int userId = adminObjectPojo.getUserId();
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM vice_dean WHERE id = "+userId+"");

        resultSet.next();
    }
    @Then("Vice Dean bilgilerinin database dogrulamasi yapilir")
    public void vice_dean_bilgilerinin_database_dogrulamasi_yapilir() throws SQLException {
        assertEquals(adminObjectPojo.getPhoneNumber(), resultSet.getString("phone_number"));
    }
}
