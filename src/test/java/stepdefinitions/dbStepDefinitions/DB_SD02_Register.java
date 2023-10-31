package stepdefinitions.dbStepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import stepdefinitions.apiStepDefinitions.API_SD02_Register;

import java.sql.*;

import static org.junit.Assert.*;
import static stepdefinitions.uiStepDefinitions.SD02_RegisterStepDefinition.registerObjectPojo;

public class DB_SD02_Register {
    ResultSet resultSet;
    Connection connection;
    Statement statement;


    @Given("Kayitli ogrencinin UserId bilgileri ile sorgu yapilir")
    public void kayitli_ogrencinin_user_ıd_bilgileri_ile_sorgu_yapilir() throws SQLException {
        int id=registerObjectPojo.getId();
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM guest_user WHERE id = " +id+"");
        System.out.println();
        resultSet.next();
    }
    @Then("Ogrenci kaydinin database dogrulamasi yapilir")
    public void ogrenci_kaydinin_database_dogrulamasi_yapilir() throws SQLException {
        assertEquals(registerObjectPojo.getUsername(), resultSet.getString("username"));
        assertEquals(registerObjectPojo.getSsn(), resultSet.getString("ssn"));
        assertEquals(registerObjectPojo.getName(), resultSet.getString("name"));
        assertEquals(registerObjectPojo.getSurname(), resultSet.getString("surname"));
        assertEquals(registerObjectPojo.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(registerObjectPojo.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(registerObjectPojo.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(registerObjectPojo.getGender(), resultSet.getString("gender"));

        connection.close();
        statement.close();
        resultSet.close();

    }
    @Then("Ogrenci bilgilerinin database icinde olmadigi dogrulamasi yapilir")
    public void ogrenci_bilgilerinin_database_icinde_olmadigi_dogrulamasi_yapilir() throws SQLException {
        int id=registerObjectPojo.getId();
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM guest_user WHERE id = " +id+"");
        try {
            assertFalse(resultSet.next());
        } catch (SQLException e) {
            e.printStackTrace();
            fail("Database'de, aranan userId'ye sahip kayıt mevcut olduğu için doğrulama başarısız oldu: " + e.getMessage());
        }
        connection.close();
        statement.close();
        resultSet.close();
        System.out.println("Database doğrulama işlemi tamamlandı");

    }




}
