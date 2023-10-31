package stepdefinitions.dbStepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import stepdefinitions.apiStepDefinitions.API_SD05_AdminManagement;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.uiStepDefinitions.SD05_AdminManagementStepDefinition.adminPojo;

public class DB_SD05_AdminManagement {

    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("Kayitli admin sorgulamasi yapilir")
    public void kayitli_admin_sorgulamasi_yapilir() throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM admins WHERE id = "+ API_SD05_AdminManagement.id +"");

        resultSet.next();
    }
    @Then("Kayitli admin DB dogrulamasi yapilir")
    public void kayitli_admin_db_dogrulamasi_yapilir() throws SQLException {
        assertEquals(adminPojo.getName(), resultSet.getString("name"));
        assertEquals(adminPojo.getSurname(), resultSet.getString("surname"));
        assertEquals(adminPojo.getId(), resultSet.getInt("id"));
        assertEquals(adminPojo.getUsername(), resultSet.getString("username"));
        assertEquals(adminPojo.getSsn(), resultSet.getString("ssn"));
        assertEquals(adminPojo.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(adminPojo.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(adminPojo.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(adminPojo.getGender(), resultSet.getString("gender"));

        connection.close();
        statement.close();
        resultSet.close();
    }

}
