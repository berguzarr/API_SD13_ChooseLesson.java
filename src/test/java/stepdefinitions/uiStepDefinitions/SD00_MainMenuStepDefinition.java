package stepdefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.P00_MainMenuPage;
import utilities.ReusableMethods;


public class SD00_MainMenuStepDefinition {
    P00_MainMenuPage mainMenu;

    @When("Menu butonuna tiklar")
    public void menu_butonuna_tiklar() {
        mainMenu = new P00_MainMenuPage();
        mainMenu.menuButton.click();
    }

    @And("Teacher Management butonuna tiklar")
    public void teacherManagementButonunaTiklar() {
        mainMenu = new P00_MainMenuPage();
        mainMenu.teacherManagementButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("Guest User linkine tiklanir")
    public void guestUserLinkineTiklanir() {
        mainMenu = new P00_MainMenuPage();
        mainMenu.guestUserButton.click();
    }

    @When("Meet Management butonuna tiklar")
    public void meet_management_butonuna_tiklar() {
       mainMenu=new P00_MainMenuPage();
       mainMenu.meetManagementButton.click();

    }
    @And("Dean Management butonuna tiklar")
    public void deanManagementButonunaTiklar() {
        mainMenu=new P00_MainMenuPage();
        mainMenu.deanManagementButton.click();
    }


    @But("Menu Buttonu altinda Student Management Bolumunu Goremez")
    public void menuButtonuAltindaStudentManagementBolumunuGoremez() {
        mainMenu=new P00_MainMenuPage();
        Assert.assertFalse(mainMenu.mainMenueBodyForStudent.getText().contains("Student Management"));
    }
}
