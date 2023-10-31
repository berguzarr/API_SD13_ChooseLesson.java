package stepdefinitions.dbStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.uiStepDefinitions.SD06_DeanManagementStepDefinition.deanObjectPojo;

public class DB_SD06_DeanManagement {
    ResultSet resultSet;
    Connection connection;
    Statement statement;

    @Given("Kayitli deanin userId bilgisi ile sorgu yapilir")
    public void kayitliDeaninUserIdBilgisiIleSorguYapilir() throws SQLException {

        int userId = deanObjectPojo.getUserId();
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM dean WHERE id = " + userId + "");

        resultSet.next();

    }

    @Then("Dean bilgilerinin database dogrulamasi yapilir")
    public void deanBilgilerininDatabaseDogrulamasiYapilir() throws SQLException {

        assertEquals(deanObjectPojo.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(deanObjectPojo.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(deanObjectPojo.getGender(), resultSet.getString("gender"));
        assertEquals(deanObjectPojo.getName(), resultSet.getString("name"));
        assertEquals(deanObjectPojo.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(deanObjectPojo.getSsn(), resultSet.getString("ssn"));
        assertEquals(deanObjectPojo.getSurname(), resultSet.getString("surname"));
        assertEquals(deanObjectPojo.getUsername(), resultSet.getString("username"));

        connection.close();
        statement.close();
        resultSet.close();
    }
}
