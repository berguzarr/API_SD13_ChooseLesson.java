package stepdefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.P04_ContactPage;
import pojos.ContactObjectPojo;
import utilities.ReusableMethods;




public class SD04_ContactStepDefinition {
    P04_ContactPage contactPage;
    public static ContactObjectPojo contactObjectPojo = new ContactObjectPojo();
    Faker faker = new Faker();
    String ayniMail = faker.internet().emailAddress();
    String email = faker.number().numberBetween(10000, 987798900) + "@gmail.com";

//Zeliha Balı - 20.Satır

    @Given("Kullanici contact menusun e tiklar")
    public void kullanici_contact_menusun_e_tiklar() {

        contactPage.contactBox.click();
    }

    @When("Kullanici Your name kutusuna {string} girer")
    public void kullanici_your_name_kutusuna_girer(String str) {
        contactPage = new P04_ContactPage();
        String name = faker.name().firstName();
        if (str.equals("bir name")) {
            contactPage.yournameBox.sendKeys(name);
            contactObjectPojo.setName(name);
        } else {
            contactPage.yournameBox.sendKeys(str);
            contactObjectPojo.setName(str);
        }
    }

    @When("Kullanici Your Mail kutusuna {string} girer")
    public void kullanici_your_mail_kutusuna_girer(String str) {
        contactPage = new P04_ContactPage();

        if (str.equals("bir mail")) {
            //contactPage.yourMailBox.sendKeys(faker.internet().emailAddress());
            contactPage.yourMailBox.sendKeys(email);
            contactObjectPojo.setEmail(email);
        } else {
            contactPage.yourMailBox.sendKeys(str);
            contactObjectPojo.setEmail(email);
            ReusableMethods.waitFor(5);
        }

    }

    @When("Kullanici Subject kutusuna {string} girer")
    public void kullanici_subject_kutusuna_girer(String str) {
        contactPage = new P04_ContactPage();
        if (str.equals("bir subject")) {
            contactPage.subjectBox.sendKeys("Ders Programı Güncellemesi");
            contactObjectPojo.setSubject("Ders Programı Güncellemesi");
        } else {
            contactPage.subjectBox.sendKeys(str);
        }
    }

    @When("Kullanici Message kutusuna {string} girer")
    public void kullanici_message_kutusuna_girer(String str) {
        contactPage = new P04_ContactPage();
        if (str.equals("bir mesaj")) {
            contactPage.messageBox.sendKeys("Güncelenen ders programı ders çakışmasına sebep olmaktadır. Bu yüzden sorun yaşamaktayım. Teşekkürler");
            contactObjectPojo.setMessage("Güncelenen ders programı ders çakışmasına sebep olmaktadır. Bu yüzden sorun yaşamaktayım. Teşekkürler");
        } else {
            contactPage.messageBox.sendKeys(str);
        }
    }

    @When("Kullanici Send Message butonuna tiklar")
    public void kullanici_send_message_butonuna_tiklar() {
        contactPage = new P04_ContactPage();
        contactPage.senMessageBtt.click();
    }

    @Then("Contact Message Created Successfully mesajinin gorunur oldugu dogrulanir")
    public void contact_message_created_successfully_mesajinin_gorunur_oldugu_dogrulanir() {
        contactPage = new P04_ContactPage();
        Assert.assertTrue(ReusableMethods.waitForVisibility(contactPage.basarliMesaj, 5).isDisplayed());
    }

    @Then("Kullanici mesaj gonderememeli")
    public void kullanici_mesaj_gonderememeli() {
        Assert.assertFalse(ReusableMethods.waitForVisibility(contactPage.basarliMesaj, 10).isDisplayed());
    }

    @Then("Kullanici hata mesajı aldigini dogrular")
    public void kullanici_hata_mesaji_aldigini_dogrular() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(contactPage.bosMailHataMesaj, 5).isDisplayed());
    }

    @Then("Kullanici Please enter valid email hata mesaji aldigini dogrular")
    public void kullanici_please_enter_valid_email_hata_mesaji_aldigini_dogrular() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(contactPage.invalidMailHataMesaj, 5).isDisplayed());
    }

    @Then("Kullanici aynı mail ile mesaj göndermeli")
    public void kullanici_aynı_mail_ile_mesaj_göndermeli() {
    }

    @When("Kullanici Your Mail kutusuna ikinci kez ayni maili girer")
    public void kullanici_your_mail_kutusuna_ikinci_kez_ayni_maili_girer() {
        contactPage.yourMailBox.sendKeys(ayniMail);

    }




//Zeliha Balı - 120.Satır


}
