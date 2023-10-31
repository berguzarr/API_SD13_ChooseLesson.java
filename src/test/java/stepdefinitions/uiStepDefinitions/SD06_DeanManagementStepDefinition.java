package stepdefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.P06_DeanManagementPage;
import pojos.DeanObjectPojo;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SD06_DeanManagementStepDefinition {

    P06_DeanManagementPage deanManagementPage;
    public static DeanObjectPojo deanObjectPojo = new DeanObjectPojo();
    Faker faker = new Faker();
    String name;
    //Ali Sıcak - 20.Satır
    @When("DeanName kutusuna {string} girer")
    public void dean_name_kutusuna_girer(String str) {
        deanManagementPage = new P06_DeanManagementPage();
        name = faker.name().firstName();
        if (str.equals("bir isim")) {
            deanManagementPage.name.sendKeys(name);
            deanObjectPojo.setName(name);
        } else {
            deanManagementPage.name.sendKeys(str);
            deanObjectPojo.setName(str);
        }
    }
    @When("DeanSurName kutusuna {string} girer")
    public void dean_sur_name_kutusuna_girer(String str) {
        deanManagementPage = new P06_DeanManagementPage();
        String surname = faker.name().lastName();
        if (str.equals("bir soyisim")) {
            deanManagementPage.surname.sendKeys(surname);
            deanObjectPojo.setSurname(surname);
        } else {
            deanManagementPage.surname.sendKeys(str);
            deanObjectPojo.setSurname(str);
        }
    }
    @When("DeanBirthPlace kutusuna {string} girer")
    public void dean_birth_place_kutusuna_girer(String str) {
        deanManagementPage = new P06_DeanManagementPage();
        String birthPlace = faker.lorem().word();
        if (str.equals("bir yer ismi")) {
            deanManagementPage.birthPlace.sendKeys(birthPlace);
            deanObjectPojo.setBirthPlace(birthPlace);
        } else  {
            deanManagementPage.birthPlace.sendKeys(str);
        deanObjectPojo.setBirthPlace(str);
        ReusableMethods.waitFor(2);
        }

    }
    @When("DeanGender {string} secenegini girer")
    public void dean_gender_secenegini_girer(String str) {
        deanManagementPage = new P06_DeanManagementPage();
        String gender = "";
        if (str.equalsIgnoreCase("FEMALE")) {
            deanManagementPage.genderFemale.click();
            gender = "FEMALE";
            deanObjectPojo.setGender(gender);
        } else if (str.equalsIgnoreCase("MALE")) {
            deanManagementPage.genderMale.click();
            gender = "MALE";
            deanObjectPojo.setGender(gender);
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }
        ReusableMethods.waitFor(2);
    }
    @When("DeanDateOfBirth kutusuna tarih girer")
    public void dean_date_of_birth_kutusuna_girer() {
        deanManagementPage = new P06_DeanManagementPage();
        Date birthDay = faker.date().past(365 * 40, TimeUnit.DAYS);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(birthDay);
        deanManagementPage.birthDay.sendKeys(formattedDate);

        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate2 = formatter2.format(birthDay);
        deanObjectPojo.setBirthDay(formattedDate2);
        ReusableMethods.waitFor(2);
    }
    @When("DeanPhone kutusuna {string} girer")
    public void dean_phone_kutusuna_girer(String str) {
        deanManagementPage = new P06_DeanManagementPage();
        if (str.equals("bir telefon numarasi")) {
            String ListPhoneNo = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");
            deanManagementPage.phoneNumber.sendKeys(ListPhoneNo);
            deanObjectPojo.setPhoneNumber(ListPhoneNo);
        } else {
            deanManagementPage.phoneNumber.sendKeys(str);
            deanObjectPojo.setPhoneNumber(str);
        }
    }
    @When("DeanSSN kutusuna SSNno girer")
    public void dean_ssn_kutusuna_ss_nno_girer() {
        deanManagementPage = new P06_DeanManagementPage();
        String ListSSNNo = faker.regexify("[0-5]{3}-[0-9]{2}-[0-9]{4}");
        deanManagementPage.ssn.sendKeys(ListSSNNo);
        deanObjectPojo.setSsn(ListSSNNo);
        ReusableMethods.waitFor(2);
    }

    @When("DeanUserName kutusuna {string} girer")
    public void dean_user_name_kutusuna_girer(String str) {
        deanManagementPage = new P06_DeanManagementPage();
        String username = faker.random().nextInt(1000,9999)+ "ali";
        if (str.equals("bir kullanici adi")) {
            deanManagementPage.username.sendKeys(username);
            deanObjectPojo.setUsername(username);
        } else {
            deanManagementPage.username.sendKeys(str);
            deanObjectPojo.setUsername(str);
        }
    }

    @When("DeanPassword kutusuna sifre girer")
    public void dean_password_kutusuna_sifre_girer() {
        deanManagementPage = new P06_DeanManagementPage();
        deanManagementPage.deanPassword.sendKeys(faker.internet().password(8, 10));
    }

    @When("DeanSubmit butonuna tiklar")
    public void dean_submit_butonuna_tiklar() {
        deanManagementPage = new P06_DeanManagementPage();
        deanManagementPage.deanSubmit.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Dean kaydi yapildigi dogrulanir")
    public void dean_kaydi_yapildigi_dogrulanir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanSavedPopUp.isDisplayed());
    }

    @When("Dean Name gorundugunu dogrula")
    public void dean_name_gorundugunu_dogrula() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanListName.isDisplayed());
    }

    @When("Dean Gender gorundugunu dogrula")
    public void dean_gender_gorundugunu_dogrula() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanListGender.isDisplayed());
    }

    @When("Dean Phone gorundugunu dogrula")
    public void dean_phone_gorundugunu_dogrula() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanListPhone.isDisplayed());
    }

    @When("Dean SSN gorundugunu dogrula")
    public void dean_ssn_gorundugunu_dogrula() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanListSSN.isDisplayed());
    }

    @Then("Dean UserName gorundugunu dogrula")
    public void dean_user_name_gorundugunu_dogrula() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanListUserName.isDisplayed());
    }

    @Then("DeanName kutusu required uyarisi gorundugu dogrulanir")
    public void dean_name_kutusu_required_uyarisi_gorundugu_dogrulanir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertFalse(deanManagementPage.deanSavedPopUp.isDisplayed());
    }

    @Then("Dean saved uyarisi gorunmedigi dogrulanir")
    public void dean_name_kutusu_required_uyarisi_gorundugu_dogrulanir2() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertFalse(deanManagementPage.deanSavedPopUp.isDisplayed());
    }

    @Then("Dean kaydi yapilmadigi dogrulanir")
    public void dean_kaydi_yapilmadigi_dogrulanir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertFalse(deanManagementPage.deanSavedPopUp.isDisplayed());
    }

    @Then("DeanName kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir")
    public void dean_name_kutusunun_altinda_required_yazisinin_gorunur_oldugu_dogrulanmalidir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanNameRequired.isDisplayed());
    }

    @Then("DeanName kutusu enaziki karakter uyarisi gorunmeli ve dean kaydi yapilmadigi gorunmeli")
    public void dean_name_kutusu_enaziki_karakter_uyarisi_gorunmeli_ve_dean_kaydi_yapilmadigi_gorunmeli() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanNameEnAzIkiKarakterIcermeliPopUp.isDisplayed());
    }

    @Then("DeanName alani karakter icermeli uyarisi gorunmeli")
    public void dean_name_alani_karakter_icermeli_uyarisi_gorunmeli() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.nameKarakterIcermeliPopUp.isDisplayed());
    }

    @Then("DeanSurName kutusu required uyarisi gorundugu dogrulanir")
    public void dean_surname_kutusu_required_uyarisi_gorundugu_dogrulanir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanSurNameRequired.isDisplayed());
    }

    @Then("DeanSurName alani karakter icermeli uyarisi gorunmeli")
    public void dean_sur_name_alani_karakter_icermeli_uyarisi_gorunmeli() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.surNameKarakterIcermeliPopUp.isDisplayed());
    }

    @Then("DeanSurname kutusu enaziki karakter uyarisi gorunmeli ve dean kaydi yapilmadigi gorunmeli")
    public void dean_surname_kutusu_enaziki_karakter_uyarisi_gorunmeli_ve_dean_kaydi_yapilmadigi_gorunmeli() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.surNameEnAzIkiKarakterIcermeliPopUp.isDisplayed());
    }

    @Then("DeanBirthPlace kutusu required uyarisi gorundugu dogrulanir")
    public void dean_birth_place_kutusu_required_uyarisi_gorundugu_dogrulanir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanBirthPlaceBoxRequired.isDisplayed());
    }

    @Then("DeanBirthPlace karakter icermeli uyarisi gorunmeli ve dean kaydi yapilmamalidir")
    public void dean_birth_place_karakter_icermeli_uyarisi_gorunmeli_ve_dean_kaydi_yapilmamalidir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.birthPlaceKarakterIcermeliPopUp.isDisplayed());
    }

    @Then("DeanBirthPlace enaz iki karakter icermeli uyarisi gorunmeli ve dean kaydi yapilmamalidir")
    public void dean_birth_place_enaz_iki_karakter_icermeli_uyarisi_gorunmeli_ve_dean_kaydi_yapilmamalidir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.birthPlaceEnAzIkiKarakterIcermeliPopUp.isDisplayed());
    }

    @Then("GenderOptions required uyarisi gorundugu dogrulanir")
    public void gender_options_required_uyarisi_gorundugu_dogrulanir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanGenderBoxRequired.isDisplayed());
    }

    @When("DeanDateOfBirth kutusuna {string} girer")
    public void dean_date_of_birth_kutusuna_girer(String string) {
        deanManagementPage = new P06_DeanManagementPage();
        deanManagementPage.birthDay.sendKeys("04.05.205634");
    }

    @Then("DeanDateOfBirth kutusu required uyarisi gorundugu dogrulanir")
    public void dean_date_of_birth_kutusu_required_uyarisi_gorundugu_dogrulanir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanDateOfBirthBoxRequired.isDisplayed());
    }

    @Then("DeanPhone kutusu required uyarisi gorundugu dogrulanir")
    public void dean_phone_kutusu_required_uyarisi_gorundugu_dogrulanir() {
        deanManagementPage = new P06_DeanManagementPage();
        ReusableMethods.waitForVisibility(deanManagementPage.deanPhoneNumberBoxRequired, 3);
        Assert.assertTrue(deanManagementPage.deanPhoneNumberBoxRequired.isDisplayed());
    }

    @When("DeanPhone kutusuna invalid {string} girer")
    public void dean_phone_kutusuna_invalid_girer(String str) {
        deanManagementPage = new P06_DeanManagementPage();
        if (str.equals("bir telefon numarasi")) {
            deanManagementPage.phoneNumber.sendKeys(faker.regexify("[0-9]{4}-[0-9]{4}-[0-9]{2}"));
        } else {
            deanManagementPage.phoneNumber.sendKeys(str);
        }
    }

    @When("DeanSSN kutusuna invalid SSNno girer")
    public void dean_ssn_kutusuna_invalid_ss_nno_girer() {
        deanManagementPage = new P06_DeanManagementPage();
        deanManagementPage.ssn.sendKeys(faker.regexify("[0-9]{15}"));
        ReusableMethods.waitFor(2);
    }

    @Then("DeanSSN kutusu required uyarisi gorundugu dogrulanir")
    public void dean_ssn_kutusu_required_uyarisi_gorundugu_dogrulanir() {
        deanManagementPage = new P06_DeanManagementPage();
        ReusableMethods.waitForVisibility(deanManagementPage.deanSSNBoxRequired, 3);
        Assert.assertTrue(deanManagementPage.deanSSNBoxRequired.isDisplayed());
    }

    @Then("DeanUserName kutusu required uyarisi gorundugu dogrulanir")
    public void dean_user_name_kutusu_required_uyarisi_gorundugu_dogrulanir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanUserNameBoxRequired.isDisplayed());
    }

    @When("DeanPassword kutusuna invalid sifre girer")
    public void dean_password_kutusuna_invalid_sifre_girer() {
        deanManagementPage = new P06_DeanManagementPage();
        deanManagementPage.deanPassword.sendKeys(faker.internet().password(5, 7));
    }

    @Then("DeanPassword kutusu required uyarisi gorundugu dogrulanir")
    public void dean_password_kutusu_required_uyarisi_gorundugu_dogrulanir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanPasswordBoxRequired.isDisplayed());
    }

    @When("Dean list gorundugu dogrulanir")
    public void dean_list_gorundugu_dogrulanir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanListisDisplayed.isDisplayed());
    }

    @When("Dean delete butonu gorunmedigi dogrulanir")
    public void dean_delete_butonu_gorunmedigi_dogrulanir() {
        deanManagementPage = new P06_DeanManagementPage();
        ReusableMethods.checkTextContains(deanManagementPage.deanListEdit, "delete");
    }

    @When("Dean list son sayfaya gider")
    public void dean_list_son_sayfaya_gider() {
        deanManagementPage = new P06_DeanManagementPage();
        ReusableMethods.waitFor(1);
        ReusableMethods.clickElementByJS(deanManagementPage.deanListSonSayfa);
        ReusableMethods.waitFor(1);
    }

    @When("Dean list son satırda eklenen deani dogrular")
    public void dean_list_son_satirda_eklenen_deani_dogrular() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.tabloNameEnSonHucre.getText().contains(name));
        //Assert.assertTrue(deanManagementPage.tabloNameEnSonHucre.getText().contains(name));
    }

    @When("Dean list edit butonuna tıklanir")
    public void dean_list_edit_butonuna_tiklanir() {
        deanManagementPage = new P06_DeanManagementPage();
        deanManagementPage.tabloEnSonHucreedit.click();
    }

    @When("DeanList edit butonu tiklar")
    public void dean_list_edit_butonu_tiklar() {
        ReusableMethods.clickElementByJS(deanManagementPage.deanListEdit);
        ReusableMethods.waitFor(2);
    }

    @When("DeanUpdate kutusunu gunceller")
    public void deanupdate_kutusunu_gunceller() {
        deanManagementPage = new P06_DeanManagementPage();
        ReusableMethods.clickElementByJS(deanManagementPage.editDeanName);
        ReusableMethods.cleanByJs(deanManagementPage.editDeanName);
        deanManagementPage.editDeanName.sendKeys("UpdateName");
        deanManagementPage.editDeanSurName.click();
        ReusableMethods.cleanByJs(deanManagementPage.editDeanSurName);
        deanManagementPage.editDeanSurName.sendKeys("UpdateSurName");
        deanManagementPage.editDeanBirthPlace.click();
        ReusableMethods.cleanByJs(deanManagementPage.editDeanBirthPlace);
        deanManagementPage.editDeanBirthPlace.sendKeys("UpdateBirthPlace");
        deanManagementPage.editDeanGender.click();
        deanManagementPage.editDeanBirthDay.click();
        ReusableMethods.cleanByJs(deanManagementPage.editDeanBirthDay);
        deanManagementPage.editDeanBirthDay.sendKeys("01.01.2000");
        deanManagementPage.editDeanPhone.click();
        ReusableMethods.cleanByJs(deanManagementPage.editDeanPhone);
        deanManagementPage.editDeanPhone.sendKeys("905-589-4875");
        deanManagementPage.editDeanUserName.click();
        ReusableMethods.cleanByJs(deanManagementPage.editDeanUserName);
        deanManagementPage.editDeanUserName.sendKeys("paulapaula");
        ReusableMethods.clickElementByJS(deanManagementPage.editDeanPassword);
        deanManagementPage.editDeanPassword.sendKeys("987456321");

    }

    @Then("EditDean butonuna tiklar")
    public void edit_dean_butonuna_tiklar() {
        deanManagementPage = new P06_DeanManagementPage();
        ReusableMethods.clickElementByJS(deanManagementPage.deanListEditButton);
    }

    @Then("EditDeanSubmit butonuna tiklar")
    public void editdeansubmitButonunaTiklar() {
        deanManagementPage = new P06_DeanManagementPage();
        ReusableMethods.clickElementByJS(deanManagementPage.editDeanSubmit);
    }

    @Then("DeanUpdateSuccessfully uyarisi gorundugu dogrlanir")
    public void deanupdatesuccessfullyUyarisiGorunduguDogrlanir() {
        deanManagementPage = new P06_DeanManagementPage();
        Assert.assertTrue(deanManagementPage.deanUpdatedUyari.isDisplayed());
    }

}


//Mehmet Kozak - 220.Satır