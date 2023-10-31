package stepdefinitions.dbStepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.uiStepDefinitions.SD08_LessonManagementStepDefinition.lessonPojo;



public class DB_SD08_LessonManagement {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Given("Kayitli ders programi id sorgulamasi yapilir")
    public void kayitli_ders_programi_id_sorgulamasi_yapilir() throws SQLException {

        // int userId = getUserId();
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT*FROM lesson_program WHERE id=1596");

        resultSet.next();
    }


    @Then("Database dogrulamasi yapilir")
    public void database_dogrulamasi_yapilir() throws SQLException {

        assertEquals(1596,resultSet.getInt("id"));
        assertEquals("MONDAY",resultSet.getString("day"));
        assertEquals("12:00:00",resultSet.getString("start_time"));
        assertEquals("14:00:00",resultSet.getString("stop_time"));
        assertEquals(5,resultSet.getInt("education_term_id"));

        connection.close();
        statement.close();
        resultSet.close();



    }

    @Given("Kayitli dersin LessonId bilgisi ile sorgu yapilir")
    public void kayitli_dersin_LessonId_bilgisi_ile_sorgu_yapilir() throws SQLException {
        int lessonId = lessonPojo.getLessonId();
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM lesson WHERE lesson_id = "+ lessonId+"");

        resultSet.next();
    }
    @Then("Lesson bilgileri ile database dogrulamasi yapilir")
    public void lesson_bilgileri_ile_database_dogrulamasi_yapilir() throws SQLException {
        assertEquals(lessonPojo.getLessonName(), resultSet.getString("lesson_name"));
        assertEquals(lessonPojo.isCompulsory(), resultSet.getBoolean("is_compulsory"));
        assertEquals(lessonPojo.getCreditScore(), resultSet.getString("credit_score"));

        connection.close();
        statement.close();
        resultSet.close();

    }

}