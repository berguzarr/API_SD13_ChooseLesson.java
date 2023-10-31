package stepdefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.P12_MeetManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.Keys.TAB;

public class SD12_MeetManagementStepDefiniton {


    //Hüseyin Bulat - 20.Satır
    P12_MeetManagementPage meetManagement;
    public static String expectedDate1;
    public static String expectedDate2;
    public static String expectedDate3;

    @When("Choose Student kutusuna tiklar")
    public void choose_student_kutusuna_tiklar() {
        meetManagement = new P12_MeetManagementPage();
        meetManagement.chooseStudent.click();
        ReusableMethods.waitFor(2);


    }

    @When("Acilan listede ilk secenege tiklar")
    public void acilan_listede_ilk_secenege_tiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(TAB).perform();
        ReusableMethods.waitFor(2);
    }

    @When("Ilk secenegin secildigini dogrular")
    public void ilk_secenegin_secildigini_dogrular() {
        meetManagement = new P12_MeetManagementPage();
        assert meetManagement.seraJones.getText().equals("Sera Jones");
    }

    @Then("Ayni ogrencinin iki defa secilemedigini dogrular")
    public void ayniOgrencininIkiDefaSecilemediginiDogrular() {
        meetManagement = new P12_MeetManagementPage();
        Assert.assertNotEquals("Sera Jones2", meetManagement.veliStudent.getText());
    }

    @And("Date Of Meet bolumune tarih girer")
    public void dateOfMeetBolumuneTarihGirer() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(2);
        Date date = Faker.instance().date().future(365, TimeUnit.DAYS);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        expectedDate2 = sdf.format(date);
        meetManagement.dateOfMeet.sendKeys(expectedDate2);
    }

    @Then("Date Of Meet bolumune tarih girilebildigini dogrular")
    public void dateOfMeetBolumuneTarihGirilebildiginiDogrular() {
        meetManagement = new P12_MeetManagementPage();
        assert meetManagement.dateOfMeet.getAttribute("value").equals("2023-06-15");
    }

    @And("Date Of Meet bolumune gecmis tarih girer")
    public void dateOfMeetBolumuneGecmisTarihGirer() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(2);
        Date date = Faker.instance().date().past(365, TimeUnit.DAYS);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        expectedDate1 = sdf.format(date);
        meetManagement.dateOfMeet.sendKeys(expectedDate1);
    }

    @And("Start Time bolumune saat girer")
    public void startTimeBolumuneSaatGirer() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(2);
        meetManagement.startTime.sendKeys("10:00");
    }

    @And("Stop Time bolumune saat girer")
    public void stopTimeBolumuneSaatGirer() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(2);
        meetManagement.stopTime.sendKeys("11:00");
    }

    @And("Description bolumune deger girer")
    public void descriptionBolumuneDegerGirer() {

        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(2);
        meetManagement.description.sendKeys("tanisma toplantisi");
    }

    @Then("Date Of Meet bolumune gecmis tarih girilemedigini dogrular")
    public void dateOfMeetBolumuneGecmisTarihGirilemediginiDogrular() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(1);
        System.out.println("*****" + meetManagement.gecmisTarihUyari.getText());
        assert meetManagement.gecmisTarihUyari.getText().equals("ileri bir tarih olmalı");
    }

    @And("Start Time bolumune saat girilebildigini dogrular")
    public void startTimeBolumuneSaatGirilebildiginiDogrular() {
        meetManagement = new P12_MeetManagementPage();
        assert meetManagement.startTime.getAttribute("value").equals("10:00");

    }

    @And("Stop Time bolumune saat girilebildigini dogrular")
    public void stopTimeBolumuneSaatGirilebildiginiDogrular() {
        meetManagement = new P12_MeetManagementPage();
        assert meetManagement.stopTime.getAttribute("value").equals("11:00");

    }

    @And("Stop Time bolumune baslangic saatinden daha erken bir saat girer")
    public void stopTimeBolumuneBaslangicSaatindenDahaErkenBirSaatGirer() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(2);
        meetManagement.stopTime.sendKeys("08:00");
    }

    @And("Stop Time in Start Time dan geri olamayacagini dogrular")
    public void stopTimeInStartTimeDanGeriOlamayacaginiDogrular() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(1);
        assert meetManagement.erkenStopTimeUyari.getText().equals("Error: start time must not be greater than or equal to stop time");
    }

    @Then("Description bolumune deger girilebildigini dogrular")
    public void descriptionBolumuneDegerGirilebildiginiDogrular() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(3);
        assert meetManagement.description.getAttribute("value").equals("tanisma toplantisi");
    }

    @Then("Choose Student bolumunun doldurulmadigina dair hata mesaji alindigini dogrular")
    public void chooseStudentBolumununDoldurulmadiginaDairHataMesajiAlindiginiDogrular() {
        meetManagement = new P12_MeetManagementPage();
        assert meetManagement.chooseStudentUyari.getText().equals("Error: Choose Student doldurulmalı");
    }

    @And("Ayni tarih ve ayni saat araliginda baska bir toplanti olusturulamadigina dair hata mesaji alindigini dogrular")
    public void ayniTarihVeAyniSaatAraligindaBaskaBirToplantiOlusturulamadiginaDairHataMesajiAlindiginiDogrular() {
        meetManagement = new P12_MeetManagementPage();
        assert meetManagement.ayniTarihveSaatUyari.getText().equals("Farklı bir tarih olmalı");
    }

    @And("Start Time bolumune yeni saat girer")
    public void startTimeBolumuneYeniSaatGirer() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(2);
        meetManagement.startTime.sendKeys("10:30");
    }

    @And("Stop Time bolumune  yeni saat girer")
    public void stopTimeBolumuneYeniSaatGirer() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(2);
        meetManagement.stopTime.sendKeys("13:00");
    }

    @Then("Ayni tarihte onceki toplantinin surdugu saat araliginda baska bir toplanti olusturulamayacagi yonunde hata mesaji aldigini dogrular")
    public void ayniTarihteoncekiToplantininSurduguSaatAraligindaBaskaBirToplantiOlusturulamayacagiYonundeHataMesajiAlmalidir() {
        meetManagement = new P12_MeetManagementPage();
        Assert.assertTrue(meetManagement.ayniSaatUyari.isDisplayed());
    }

    @Then("Meet List bolumunde Stop Time basliginin goruldugunu dogrular")
    public void meetListBolumundeStopTimeBasligininGoruldugunuDogrular() {
        ReusableMethods.waitFor(1);
        meetManagement = new P12_MeetManagementPage();
        assert meetManagement.meetListStopTime.isDisplayed();
    }

    @Then("Meet List bolumunde Description basliginin goruldugunu dogrular")
    public void meetListBolumundeDescriptionBasligininGoruldugunuDogrular() {
        ReusableMethods.waitFor(1);

        meetManagement = new P12_MeetManagementPage();
        assert meetManagement.meetListDescription.isDisplayed();
    }

    @Then("Meet List bolumunde Date basliginin goruldugunu dogrular")
    public void meetListBolumundeDateBasligininGoruldugunuDogrular() {
        ReusableMethods.waitFor(1);

        meetManagement = new P12_MeetManagementPage();
        assert meetManagement.meetListDate.isDisplayed();
    }

    @Then("Meet List bolumunde Start Time basliginin goruldugunu dogrular")
    public void meetListBolumundeStartTimeBasligininGoruldugunuDogrular() {
        ReusableMethods.waitFor(1);

        meetManagement = new P12_MeetManagementPage();
        assert meetManagement.meetListStartTime.isDisplayed();
    }

    @And("Meet List bolumundeki Edit butonuna tiklar")
    public void meetListBolumundekiEditButonunaTiklar() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.clickElementByJS(meetManagement.editButton);
        ReusableMethods.waitFor(2);

    }

    @And("Date Of Meet bolumundeki tarihi ileri alir")
    public void dateOfMeetBolumundekiTarihiIleriAlir() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(2);
        Date date = Faker.instance().date().future(365, TimeUnit.DAYS);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        expectedDate3 = sdf.format(date);
        meetManagement.dateOfMeet2.sendKeys(expectedDate3);

    }

    @And("Submitiki butonuna tiklar")
    public void submitikiButonunaTiklar() {
        meetManagement = new P12_MeetManagementPage();
        meetManagement.submitButton2.click();
        ReusableMethods.waitFor(1);
    }


    @And("Delete butonuna tiklar")
    public void deleteButonunaTiklar() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.clickElementByJS(meetManagement.deleteButton);
        ReusableMethods.waitFor(2);
    }

    @Then("toplantinin silindigini dogrular")
    public void toplantininSilindiginiDogrular() {
        meetManagement = new P12_MeetManagementPage();
        assert meetManagement.silindiUyarisi.isDisplayed();
    }

    @And("Choose Studentiki kutusuna {string} yazar")
    public void chooseStudentikiKutusunaYazar(String arg0) {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(TAB, TAB, arg0, Keys.ENTER).build().perform();
    }

    @Then("Toplantinin guncellendigini dogrular")
    public void toplantininGuncellendiginiDogrular() {
        meetManagement = new P12_MeetManagementPage();
        assert meetManagement.guncellendiUyarisi.getText().equals("Meet Updated Successfully");
    }

    @And("Start time bolumune ayni tarihteki toplantinin henuz bitmedigi bir saat girer")
    public void startTimeBolumuneAyniTarihtekiToplantininHenuzBitmedigiBirSaatGirer() {
        meetManagement = new P12_MeetManagementPage();
        ReusableMethods.waitFor(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB, TAB, TAB, TAB, TAB, "47").build().perform();
    }

    @Then("Ayni tarihte onceki toplantinin surdugu saat araliginda baska bir toplanti guncellenemeyecegi yonunde hata mesaji aldigini dogrular")
    public void ayniTarihteOncekiToplantininSurduguSaatAraligindaBaskaBirToplantiGuncellenemeyecegiYonundeHataMesajiAldiginiDogrular() {
        meetManagement = new P12_MeetManagementPage();
        Assert.assertTrue(meetManagement.ayniSaatUyarisi.isDisplayed());
    }

    @And("Submitt butonuna tiklar")
    public void submittButonunaTiklar() {
        meetManagement = new P12_MeetManagementPage();
        meetManagement.submitButton3.click();
    }


//Hüseyin Bulat - 120.Satır
}
