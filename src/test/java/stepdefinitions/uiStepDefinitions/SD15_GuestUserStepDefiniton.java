package stepdefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import pages.P09_TeacherManagementPage;
import pages.P15_GuestUserPage;
import utilities.ReusableMethods;
import static org.junit.Assert.assertTrue;



public class SD15_GuestUserStepDefiniton {







//Nurullah Taşkan - 20.Satır
    P15_GuestUserPage guestUserPage =new P15_GuestUserPage();
    P09_TeacherManagementPage teacherManagementPage =new P09_TeacherManagementPage();
    Faker faker=new Faker();
    String username=faker.name().username();
    @Then("Guest User deleted succesful Pop-up yazisinin gorunur oldugu dogrulanir")
    public void guestUserDeletedSuccesfulPopUpYazisininGorunurOlduguDogrulanir() {
        assertTrue(guestUserPage.deletedPopUp.isDisplayed());
        System.out.println("guestUserPage.deletedPopUp.getText() = " + guestUserPage.deletedPopUp.getText());

    }
    @And("Ilk satirdaki delete tusuna basilir")
    public void ılkSatirdakiDeleteTusunaBasilir() {
        guestUserPage.deleteButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Ilk satirda kullanici oldugu dogrulanir")
    public void ılkSatirdaKullaniciOlduguDogrulanir() {
        assertTrue(guestUserPage.tableRow.isDisplayed());
        ReusableMethods.waitFor(2);
    }
}


//Nurullah Taşkın - 120.Satır

