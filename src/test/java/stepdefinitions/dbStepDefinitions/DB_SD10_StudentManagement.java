package stepdefinitions.dbStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.uiStepDefinitions.SD09_TeacherManagementStepDefinition.studentObjectPojo;


public class DB_SD10_StudentManagement {
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("Kayitli ogrencinin UserId bilgisi ile sorgu yapilir")
    public void kayitli_ogrencinin_user_id_bilgisi_ile_sorgu_yapilir() throws SQLException {
        int id= studentObjectPojo.getId();
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM student WHERE id ="+id+"");

        resultSet.next();
    }

    @Then("Ogrenci bilgilerinin database dogrulamasi yapilir")
    public void ogrenci_bilgilerinin_database_dogrulamasi_yapilir() throws SQLException {

        assertEquals (studentObjectPojo.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(studentObjectPojo.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(studentObjectPojo.getGender(), resultSet.getString("gender"));
        assertEquals(studentObjectPojo.getName(), resultSet.getString("name"));
        assertEquals(studentObjectPojo.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(studentObjectPojo.getSsn(), resultSet.getString("ssn"));
        assertEquals(studentObjectPojo.getSurname(), resultSet.getString("surname"));
        assertEquals(studentObjectPojo.getUsername(), resultSet.getString("username"));
        assertEquals(studentObjectPojo.getEmail(), resultSet.getString("email"));
        assertEquals(studentObjectPojo.getFatherName(), resultSet.getString("father_name"));
        assertEquals(studentObjectPojo.getMotherName(),resultSet.getString("mother_name"));

        connection.close();
        statement.close();
        resultSet.close();

    }

}
