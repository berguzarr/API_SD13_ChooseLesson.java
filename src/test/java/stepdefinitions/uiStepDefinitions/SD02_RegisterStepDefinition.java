package stepdefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.P01_HomePage;
import pages.P02_RegisterPage;
import pojos.RegisterObjectPojo;
import utilities.ReusableMethods;


public class SD02_RegisterStepDefinition {

    P01_HomePage homePage;
    P02_RegisterPage registerPage;
    Faker faker = new Faker();


    public static RegisterObjectPojo registerObjectPojo = new RegisterObjectPojo();


    //Zeliha Balı - 20.Satır
    @Given("Kullanici register a tiklar")
    public void kullanici_register_a_tiklar() {
        homePage = new P01_HomePage();
        ReusableMethods.clickElementByJS(homePage.registerLink);
    }
    @When("Phone kutusuna invalid deger girer")
    public void phone_kutusuna_invalid_deger_girer() {
        registerPage = new P02_RegisterPage();
        String phoneNumber = faker.regexify("[a-z]{3}-[a-z]{3}-[a-z]{4}");
        registerPage.phoneNumberBox.sendKeys(phoneNumber);
        registerObjectPojo.setPhoneNumber(phoneNumber);

        //registerPage.phoneNumberBox.sendKeys(faker.regexify("[a-z]{3}-[a-z]{3}-[a-z]{4}"));
        //String phoneNumber = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");
        //registerObjectPojo.setPhoneNumber(phoneNumber);
        System.out.println("registerObjectPojo.getPhoneNumber() = " + registerObjectPojo.getPhoneNumber());

    }
    @When("Gender bolumunden bir cinsiyet secer")
    public void gender_bolumunden_bir_cinsiyet_secer() {
        registerPage = new P02_RegisterPage();
        String gender="FEMALE";
        registerPage.femaleButon.click();
        registerObjectPojo.setGender(gender);
        ReusableMethods.waitFor(3);
    }
    @When("User Name kutusuna bir {string} girer")
    public void user_name_kutusuna_bir_girer(String string) {

        registerPage = new P02_RegisterPage();
        String userName = faker.letterify("??????");
        registerPage.usernameBox.sendKeys(userName);

        //String userName = faker.name().username();
       // registerPage.usernameBox.sendKeys(faker.name().username());
        registerObjectPojo.setUsername(userName);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici register butonuna tiklar")
    public void kullanici_register_butonuna_tiklar() {
        registerPage = new P02_RegisterPage();
        registerPage.registerButon.click();
    }

    @When("Kullanici Gender seceneklerini bos birakir")
    public void kullanici_gender_seceneklerini_bos_birakir() {
    }

    @When("Date Of Birth kutusu bos birakilir")
    public void date_of_birth_kutusu_bos_birakilir() {
    }

    @Then("Guest User Registeted Pop-Up mesajinin gorunur oldugu dogrulanir")
    public void guest_user_registeted_pop_up_mesajinin_gorunur_oldugu_dogrulanir() {
        Assert.assertTrue(registerPage.guestRegister.isDisplayed());
    }

    @Then("{string} bolumunun zurunla alan oldugu dogrulanir")
    public void bolumunun_zurunla_alan_oldugu_dogrulanir(String string) {
        Assert.assertTrue(registerPage.phoneRequired.isDisplayed());
    }

    @Then("Please enter valid phone number masajini gordugunu dogrular")
    public void please_enter_valid_phone_number_masajini_gordugunu_dogrular() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(registerPage.validPhoneUyari,5).isDisplayed());

    }

    @Then("{string} bolumunun zorunlu alan oldugu mesajinin gordugunu dogrular")
    public void bolumunun_zorunlu_alan_oldugu_mesajinin_gordugunu_dogrular(String string) {
        Assert.assertTrue(registerPage.validDateBirthUyari.isDisplayed());
    }

    @Then("Pop mesaji gorunur oldugu dogrulanir")
    public void pop_mesaji_gorunur_oldugu_dogrulanir() {
        Assert.assertTrue(registerPage.ileriTarihUyari.isDisplayed());
    }

    @When("Date Of Birth bolumune invalid gecmis bir tarih girer")
    public void date_of_birth_bolumune_invalid_gecmis_bir_tarih_girer() {
        registerPage = new P02_RegisterPage();
        String tarih="01.01.1800";
        registerPage.birthDayBox.sendKeys(tarih);
    }
    @When("Ssn kutusunu bos birakir")
    public void ssn_kutusunu_bos_birakir() {
    }

    @Then("Ssn bolumunun zorunlu alan oldugu mesajinin gordugunu dogrular")
    public void ssn_bolumunun_zorunlu_alan_oldugu_mesajinin_gordugunu_dogrular() {
        registerPage = new P02_RegisterPage();
        Assert.assertTrue(registerPage.ssnRequired.isDisplayed());
    }

    @Then("Please enter valid Ssn number mesajinin gorunur oldugu dogrulanir")
    public void please_enter_valid_ssn_number_mesajinin_gorunur_oldugu_dogrulanir() {
        registerPage = new P02_RegisterPage();
        Assert.assertTrue(registerPage.ssnInvalidUyari.isDisplayed());
    }

    @Then("Username bolumunun zurunla alan oldugu dogrulanir")
    public void username_bolumunun_zurunla_alan_oldugu_dogrulanir() {
        registerPage = new P02_RegisterPage();
        Assert.assertTrue(registerPage.usernameRequired.isDisplayed());
    }

    @Then("Password bolumunun zorunlu alan oldugu mesajinin gordugunu dogrular")
    public void password_bolumunun_zorunlu_alan_oldugu_mesajinin_gordugunu_dogrular() {
        registerPage = new P02_RegisterPage();
        Assert.assertTrue(registerPage.passwordRequired.isDisplayed());
    }
    @Then("Password Minimum {int} character uyarisi gorunur oldugu dogrulanir")
    public void password_minimum_character_uyarisi_gorunur_oldugu_dogrulanir(Integer int1) {
        registerPage = new P02_RegisterPage();
        Assert.assertTrue(registerPage.passwordMin8.isDisplayed());
    }
    @When("Date Of Birth bolumune kayitli tarih girer")
    public void date_of_birth_bolumune_kayitli_tarih_girer() {
        registerPage=new P02_RegisterPage();
        registerPage.birthDayBox.sendKeys("14-12-1998");
    }
    @When("Ssn kutusuna kayitli numara girer")
    public void ssn_kutusuna_kayitli_numara_girer() {
        registerPage=new P02_RegisterPage();
        registerPage.ssnBox.sendKeys("123-55-4455");
    }
    @Then("Kayitli kullanici mesajinin gorunur oldugu dogrulanir")
    public void kayitli_kullanici_mesajinin_gorunur_oldugu_dogrulanir() {
        registerPage=new P02_RegisterPage();
        Assert.assertTrue(ReusableMethods.waitForVisibility(registerPage.kayitliUsernameMesaj,5).isDisplayed());
    }
    @Then("Kayitli Ssn mesajinin gorunur oldugu dogrulanir")
    public void kayitli_ssn_mesajinin_gorunur_oldugu_dogrulanir() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(registerPage.kayitliSsnMesaj,5).isDisplayed());

    }
    @Then("Kayitli telefon numrasi mesajinin gorunur oldugu dogrulanir")
    public void kayitli_telefon_numrasi_mesajinin_gorunur_oldugu_dogrulanir() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(registerPage.kayitliTelMesaj,5).isDisplayed());

    }
    @Then("Kayitli kullaniciyi siler")
    public void kayitli_kullaniciyi_siler() {
        registerPage=new P02_RegisterPage();
        ReusableMethods.cleanByJs(registerPage.usernameBox);
        ReusableMethods.waitFor(5);
    }
    @Then("Kayitli Ssn numarasini siler")
    public void kayitli_ssn_numarasini_siler() {
        registerPage=new P02_RegisterPage();
        ReusableMethods.cleanByJs(registerPage.ssnBox);
        ReusableMethods.waitFor(5);
    }
    @Then("Kullanici register olamamali")
    public void kullaniciRegisterOlamamali() {
        registerPage=new P02_RegisterPage();
        Assert.assertFalse(ReusableMethods.waitForVisibility(registerPage.guestRegister,10).isDisplayed());
    }
    @Then("Kullanici basarili register olamamali")
    public void kullaniciBasariliRegisterOlamamali() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(registerPage.guestRegister,10).isDisplayed());

    }
    @When("Password kutusuna {string}  karaekter girer")
    public void password_kutusuna_karaekter_girer(String string) {
        registerPage=new P02_RegisterPage();
        String pw="        ";
        registerPage.passwordBox.sendKeys(pw);


    }


}



//Zeliha Balı - 120.Satır
