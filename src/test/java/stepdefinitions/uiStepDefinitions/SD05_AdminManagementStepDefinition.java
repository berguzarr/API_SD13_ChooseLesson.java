package stepdefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import pages.P05_AdminManagementPage;
import pages.P09_TeacherManagementPage;
import pojos.AdminPojo;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SD05_AdminManagementStepDefinition {


//Nurullah Taşkan - 20.Satır

    P05_AdminManagementPage adminManagementPage=new P05_AdminManagementPage();
    P09_TeacherManagementPage teacherManagementPage=new P09_TeacherManagementPage();
    Faker faker=new Faker();
    public static AdminPojo adminPojo=new AdminPojo();
    @And("Name kutusuna {string} girilir")
    public void nameKutusunaGirilir(String isim) {
        adminManagementPage=new P05_AdminManagementPage();
        if (isim.equals("isim")) {
            while (true) {
                String name = faker.name().firstName();
                if (name.length() >= 2) {
                    adminManagementPage.nameBox.sendKeys(name);
                    adminPojo.setName(name);
                    break;
                }
            }
        }
        else
        {
            adminManagementPage.nameBox.sendKeys(isim);
            adminPojo.setName(isim);
        }
    }

    @When("Surname kutusuna {string} girilir")
    public void surname_kutusuna_valid_deger_girilir(String soyisim) {
        adminManagementPage=new P05_AdminManagementPage();
        if(soyisim.equals("soyisim")){
            while (true) {
                String surname=faker.name().lastName();
                if (surname.length() >= 2) {
                    adminManagementPage.surnameBox.sendKeys(surname);
                    adminPojo.setSurname(surname);
                    break;
                }
            }
        }else {
            adminManagementPage.surnameBox.sendKeys(soyisim);
            adminPojo.setSurname(soyisim);
        }
    }
    @When("Birth Place kutusuna {string} girilir")
    public void birth_place_kutusuna_valid_deger_girilir(String dogumYeri) {
        adminManagementPage=new P05_AdminManagementPage();
        if(dogumYeri.equals("dogum yeri")){
            while (true) {
                String birthPlace=faker.address().country().replaceAll("\\W","");
                if (birthPlace.length() >= 2) {
                    adminManagementPage.birthPlaceBox.sendKeys(birthPlace);
                    adminPojo.setBirthPlace(birthPlace);
                    break;
                }
            }
        }else {
            adminManagementPage.birthPlaceBox.sendKeys(dogumYeri);
            adminPojo.setBirthPlace(dogumYeri);
        }
    }
    @When("Username kutusuna {string} girilir")
    public void username_kutusuna_valid_deger_girilir(String kullaniciAdi) {
        adminManagementPage=new P05_AdminManagementPage();
        if(kullaniciAdi.equals("kullanici adi")){
            while (true) {
                String username=faker.name().username().replaceAll("\\W","");
                if(username.length()>=4){
                    adminManagementPage.usernameBox.sendKeys(username);
                    adminPojo.setUsername(username);
                    break;
                }
            }
        }else {
            adminManagementPage.usernameBox.sendKeys(kullaniciAdi);
            adminPojo.setUsername(kullaniciAdi);
        }
    }

    @When("Password kutusuna {string} girilir")
    public void password_kutusuna_valid_deger_girilir(String sifre) {
        if(sifre.equals("sifre")){
            adminManagementPage.passwordBox.sendKeys(faker.internet().password(8,11));
        }else {
            adminManagementPage.passwordBox.sendKeys(sifre);
        }
        ReusableMethods.waitFor(1);
    }
    @When("Phone kutusuna {string} girilir")
    public void phone_kutusuna_valid_deger_girilir(String telNo) {
        adminManagementPage=new P05_AdminManagementPage();
        String phoneNumber = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");
        if(telNo.equals("tel no")){
            adminManagementPage.phoneNumberBox.sendKeys(phoneNumber);
            adminPojo.setPhoneNumber(phoneNumber);
        }else {
            adminManagementPage.phoneNumberBox.sendKeys(telNo);
            adminPojo.setPhoneNumber(telNo);
        }
    }
    @When("SSN kutusuna {string} girilir")
    public void ssn_kutusuna_valid_deger_girilir(String kimlikNo) {
        adminManagementPage=new P05_AdminManagementPage();
        String ssn = faker.regexify("[0-8]{3}-[0-9]{2}-[0-9]{4}");
        if(kimlikNo.equals("kimlik no")){
            adminManagementPage.ssnBox.sendKeys(ssn);
            adminPojo.setSsn(ssn);
        }else {
            adminManagementPage.ssnBox.sendKeys(kimlikNo);
            adminPojo.setSsn(kimlikNo);
        }
    }
    @When("Date Of Birth kutusuna {string} girilir")
    public void date_of_birth_kutusuna_valid_deger_girilir(String dogumTarihi) {
        adminManagementPage=new P05_AdminManagementPage();
        if(dogumTarihi.equals("dogum tarihi")){
            Date date=faker.date().past(365*100, TimeUnit.DAYS);
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
            String birtDay=simpleDateFormat.format(date);
            adminManagementPage.dateOfBirthBox.sendKeys(birtDay);

            SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("yyyy-MM-dd");
            String formatDate=simpleDateFormat1.format(date);
            adminPojo.setBirthDay(formatDate);
        }
        else {
            adminManagementPage.dateOfBirthBox.sendKeys(dogumTarihi);
            adminPojo.setBirthDay(dogumTarihi);
        }
    }
    @When("Gender seçilir")
    public void gender_seçilir() {
        adminManagementPage.maleButton.click();
    }

    @When("Submit butonuna tiklanir")
    public void submit_butonuna_tiklanir() {
       adminManagementPage.submitButtonNt.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Admin Saved pop-up mesajinin gorunur oldugu dogrulanmalidir")
    public void admin_saved_pop_up_mesajinin_gorunur_oldugu_dogrulanmalidir() {
        assertEquals("Admin Saved",adminManagementPage.adminSavedPopUp.getText());
        System.out.println("adminManagementPage.adminSavedPopUp.getText() = " + adminManagementPage.adminSavedPopUp.getText());
    }
    @And("Name kutusuna tiklanir")
    public void nameKutusunaTiklanir() {
        adminManagementPage.nameBox.click();
    }
    @Then("Name kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir")
    public void nameKutusununAltindaRequiredYazisininGorunurOlduguDogrulanmalidir() {
        assertTrue(adminManagementPage.nameRequired.isDisplayed());
    }
    @Then("Kayit isleminin gerceklesmedigi dogrulanir")
    public void kayitIslemininGerceklesmedigiDogrulanir() {
        assertFalse(adminManagementPage.adminSavedPopUp.getText().contains("Saved"));
        //System.out.println(adminManagementPage.adminSavedPopUp.getText());
    }
    @And("Surname kutusuna tiklanir")
    public void surnameKutusunaTiklanir() {
        adminManagementPage.surnameBox.click();
    }
    @Then("Surname kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir")
    public void surnameKutusununAltindaRequiredYazisininGorunurOlduguDogrulanmalidir() {
        assertTrue(adminManagementPage.surnameRequired.isDisplayed());
    }

    @And("Birth Place kutusuna tiklanir")
    public void birthPlaceKutusunaTiklanir() {
        adminManagementPage.birthPlaceBox.click();
    }

    @Then("Birth Place kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir")
    public void birthPlaceKutusununAltindaRequiredYazisininGorunurOlduguDogrulanmalidir() {
        assertTrue(adminManagementPage.birtPlaceRequired.isDisplayed());
    }
    @And("Username kutusuna tiklanir")
    public void usernameKutusunaTiklanir() {
        adminManagementPage.usernameBox.click();
    }
    @Then("Username kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir")
    public void usernameKutusununAltindaRequiredYazisininGorunurOlduguDogrulanmalidir() {
        assertTrue(adminManagementPage.usernameRequired.isDisplayed());
    }
    @And("Password kutusuna tiklanir")
    public void passwordKutusunaTiklanir() {
        adminManagementPage.passwordBox.click();
    }
    @Then("Password kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir")
    public void passwordKutusununAltindaRequiredYazisininGorunurOlduguDogrulanmalidir() {
        ReusableMethods.waitFor(1);
        assertTrue(adminManagementPage.passwordRequired.isDisplayed());
    }
    @And("Phone kutusuna tiklanir")
    public void phoneKutusunaTiklanir() {
        adminManagementPage.phoneNumberBox.click();
    }
    @Then("Phone kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir")
    public void phoneKutusununAltindaRequiredYazisininGorunurOlduguDogrulanmalidir() {
        assertTrue(adminManagementPage.phoneRequired.isDisplayed());
    }
    @And("SSN kutusuna tiklanir")
    public void ssnKutusunaTiklanir() {
        adminManagementPage.ssnBox.click();
    }
    @Then("SSN kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir")
    public void ssnKutusununAltindaRequiredYazisininGorunurOlduguDogrulanmalidir() {
        assertTrue(adminManagementPage.ssnRequired.isDisplayed());
    }
    @Then("Kayit islemi olmadigi dogrulanir")
    public void kayitIslemiOlmadigiDogrulanir() {
        assertTrue(adminManagementPage.adminSavedPopUp.isDisplayed());
    }

    @And("Female butonuna tiklanir")
    public void femaleButonunaTiklanir() {
        adminManagementPage.femaleButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("Male butonuna tiklanir")
    public void maleButonunaTiklanir() {
        adminManagementPage.maleButton.click();
    }

    @Then("Female butonunun secili olmadigi dogrulanir")
    public void femaleButonununSeciliOlmadigiDogrulanir() {
        assertFalse(adminManagementPage.femaleButton.isSelected());
    }

    @And("Date Of Birth kutusuna tiklanir")
    public void dateOfBirthKutusunaTiklanir() {
        adminManagementPage.dateOfBirthBox.click();
    }

    @Then("Date Of Birth kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir")
    public void dateOfBirthKutusununAltindaRequiredYazisininGorunurOlduguDogrulanmalidir() {
        assertTrue(adminManagementPage.dateOfBirthRequired.isDisplayed());
    }

    @Then("Gender alani altinda Required yazisinin olmadigi dogrulanir")
    public void genderAlaniAltindaRequiredYazisininOlmadigiDogrulanir() {
        assertTrue(teacherManagementPage.genderField.getText().contains(teacherManagementPage.requiredMesaji.getText()));
    }


    //Nurullah Taşkan - 120.Satır


}
