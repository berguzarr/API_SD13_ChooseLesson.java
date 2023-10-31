package stepdefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import pages.P10_StudentManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepdefinitions.uiStepDefinitions.SD09_TeacherManagementStepDefinition.studentObjectPojo;





//Meryem Bor - 20.Satır
public class SD10_StudentManagementStepDefinition {
    P10_StudentManagementPage studentManagementPage;

    Faker faker = new Faker();

    @When("Student Management Butonuna tiklar")
    public void student_management_butonuna_tiklar() {
        studentManagementPage = new P10_StudentManagementPage();
        studentManagementPage.StudentManagementBtn.click();
    }

    @When("Ogernci icin Choose Advisor Teacher secer")
    public void ogernci_icin_choose_advisor_teacher_secer() {
        ReusableMethods.waitFor(5);
        studentManagementPage = new P10_StudentManagementPage();
        studentManagementPage.chooseAdvisorTeacherDrpdwn.click();
    }

    @When("Choose Advisor Teacher menusunden bir ogretmen secer")
    public void choose_advisor_teacher_menusunden_bir_ogretmen_secer() {
        ReusableMethods.waitFor(5);
        studentManagementPage = new P10_StudentManagementPage();
        studentManagementPage.selectDropdownOptionJohnSmith.click();
    }

    @When("Gender bolumunden Femail secenegini secer")
    public void gender_bolumunden_femail_secenegini_secer() {
        ReusableMethods.waitFor(2);
        studentManagementPage = new P10_StudentManagementPage();
        studentManagementPage.genderFemale.click();
    }


    @When("Ogrenci icin Choose Advisor Teacher secemez")
    public void ogrenci_icin_choose_advisor_teacher_secemez() {
    }

    @Then("{string} uyari mesajini gordugunu dogrular")
    public void uyari_mesajini_gordugunu_dogrular(String string) {
        studentManagementPage = new P10_StudentManagementPage();
        class Utils {
            public void scrollIntoViewJS(WebElement element) {
                JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
                jsexecutor.executeScript("arguments[0].scrollIntoView(true);", studentManagementPage.uyariMsgSelectAdvisorTeacher.getText().contains("Please select advisor teacher"));
            }
        }
    }

    @Then("ismin alanini bos birakir")
    public void ismin_alanina_tiklar_ve_bos_birakir() {
        Assert.assertTrue(studentManagementPage.nameBox.getText().isEmpty());
    }

    @When("Surname alanini bos birakir")
    public void surname_alanini_bos_birakir() {
        Assert.assertTrue(studentManagementPage.surnameBox.getText().isEmpty());
    }

    @When("Birth Place alanini bos birakir")
    public void birth_place_alanini_bos_birakir() {
        Assert.assertTrue(studentManagementPage.birthPlaceBox.getText().isEmpty());

    }

    @When("e-mail alanini bos birakir")
    public void e_mail_alanini_bos_birakir() {
        Assert.assertTrue(studentManagementPage.emailBox.getText().isEmpty());
    }

    @Then("Kullanici\"Please enter valid email\" masajini gordugunu dogrular")
    public void kullanici_please_enter_valid_email_masajini_gordugunu_dogrular() {
        studentManagementPage = new P10_StudentManagementPage();
        class Utils {
            public void scrollIntoViewJS(WebElement element) {
                JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
                jsexecutor.executeScript("arguments[0].scrollIntoView(true);", studentManagementPage.emailUyariMsj.getText().contains("Please enter valid email"));
                Assert.assertTrue(studentManagementPage.emailUyariMsj.isDisplayed());
                ReusableMethods.wait(15);
                System.out.println("acctual warning massge = " + studentManagementPage.emailUyariMsj.getText());
            }
        }
    }


    @When("{string} alanini bos birakir")
    public void alanini_bos_birakir(String string) {
        Assert.assertTrue(studentManagementPage.phoneNumberBox.getText().isEmpty());
    }

    @But("Gender bolumunden bir cinsiyet secmez")
    public void genderBolumundenBirCinsiyetSecmez() {
    }

    @When("Father Name kutusuna {string} girer")
    public void father_name_kutusuna_girer(String str) {
        studentManagementPage = new P10_StudentManagementPage();
        String fatherName= faker.name().firstName();

        if (str.equals("bir baba adi")) {
            studentManagementPage.fatherNameBox.sendKeys(fatherName);
            studentObjectPojo.setFatherName(fatherName);
        } else {
            studentManagementPage.fatherNameBox.sendKeys(str);
            studentObjectPojo.setName(str);
        }
    }

    @And("Mother Name kutusuna {string} girer")
    public void motherNameKutusunaGirer(String str) {
        studentManagementPage = new P10_StudentManagementPage();
        String motherName= faker.name().firstName();

        if (str.equals("bir anne adi")) {
            studentManagementPage.motherNameBox.sendKeys(motherName);
            studentObjectPojo.setMotherName(motherName);
        } else {
            studentManagementPage.motherNameBox.sendKeys(str);
            studentObjectPojo.setMotherName(str);
        }
    }

    @But("Date of Birth kutusunu bos birakir")
    public void dateOfBirthKutusunuBosBirakir() {
        Assert.assertTrue(studentManagementPage.birthDayBox.getText().isEmpty());
    }

    @Then("Date Of Birth bolumunun altinda {string}  mesajini gorundugunu dogrular")
    public void dateOfBirthBolumununAltindaMesajiniGorundugunuDogrular(String arg0) {
        Assert.assertTrue(studentManagementPage.BirthDateRequiredUyariMsj.getText().contains("Required"));
    }

    @But("SSN kutusunu bos birakir")
    public void ssnKutusunuBosBirakir() {
        Assert.assertTrue(studentManagementPage.ssnBox.getText().isEmpty());
    }

    @Then("SSN bolumunun altinda {string} mesajini gorundugunu dogrular")
    public void ssnBolumununAltindaMesajiniGorundugunuDogrular(String arg0) {
        class Utils {
            public void scrollIntoViewJS(WebElement element) {
                JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
                jsexecutor.executeScript("arguments[0].scrollIntoView(true);", studentManagementPage.SNNRequiredUyariMsj);
            }
        }
    }

    @But("Username kutusunu bos birakir")
    public void usernameKutusunuBosBirakir() {
        Assert.assertTrue(studentManagementPage.usernameBox.getText().isEmpty());

    }

    @Then("Username bolumu altinda {string} mesajini gorundugunu dogrular")
    public void usernameBolumuAltindaMesajiniGorundugunuDogrular(String arg0) {
        Assert.assertTrue(studentManagementPage.UserNameRequiredUyariMsj.getText().contains("Required"));
    }

    @But("Father Name kutusuna Bos birakir")
    public void fatherNameKutusunaBosBirakir() {
        Assert.assertTrue(studentManagementPage.fatherNameBox.getText().isEmpty());

    }

    @Then("Father Name bolumu altinda {string} mesajini gorundugunu dogrular")
    public void fatherNameBolumuAltindaMesajiniGorundugunuDogrular(String arg0) {
        Assert.assertTrue(studentManagementPage.FatherNameRquiredUyariMsj.getText().contains("Required"));
    }

    @But("Mother Name kutusunu bos birakir")
    public void motherNameKutusunuBosBirakir() {
    }

    @Then("Mother Name bolumu altinda {string} mesajini gorundugunu dogrular")
    public void motherNameBolumuAltindaMesajiniGorundugunuDogrular(String arg0) {
        Assert.assertTrue(studentManagementPage.MotherNameRequiredUyariMsj.getText().contains("Required"));
    }


    @But("Kullanici bulundugu sayfada otamatik olarak gelen Student Number goremez")
    public void kullaniciBulunduguSayfadaOtamatikOlarakGelenStudentNumberGoremez() {

    }

    @Then("Student List te  Student Numberlar gorunur")
    public void studentListTeStudentNumberlarGorunur() {
        Assert.assertTrue(studentManagementPage.StudentNumbersList.isDisplayed());
    }

    @But("kullanici Password alanini bos birakir")
    public void kullaniciPasswordAlaniniBosBirakir() {
        Assert.assertTrue(studentManagementPage.passwordBox.getText().isEmpty());
    }

    @Then("Password bolumu altinda {string} mesajini gorundugunu dogrular")
    public void passwordBolumuAltindaMesajiniGorundugunuDogrular(String arg0) {
        Assert.assertTrue(studentManagementPage.PasswordRequiredUyariMsj.getText().contains("Required"));
    }

    @Then("Password bolumu altinda {string} mesajini gorundugunu dogrularr")
    public void passwordBolumuAltindaMesajiniGorundugunuDogrularr(String arg0) {
        Assert.assertTrue(studentManagementPage.MinValueForPasswordUyariMsj.getText().contains("Minimum 8 character"));
    }

    @Then("Phone bolumu altinda {string} messajini gorur")
    public void phoneBolumuAltindaMessajiniGorur(String arg0) {
        Assert.assertTrue(studentManagementPage.MinValueForPhoneNumUyariMsj.getText().contains("Minimum 12 character (XXX-XXX-XXXX)"));
    }

    @Then("{string} Uyari masajini gordugunu dogrular")
    public void uyariMasajiniGordugunuDogrular(String arg0) {
        class Utils {
            public void scrollIntoViewJS(WebElement element) {
                JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
                jsexecutor.executeScript("arguments[0].scrollIntoView(true);",studentManagementPage.PhoneNumUyariMsj.getText().contains(("Please enter valid phone number")));
                        Assert.assertTrue(studentManagementPage.PhoneNumUyariMsj.isDisplayed());
                        ReusableMethods.wait(15);
    }
        }
    }

    @But("SNN kutusuna {int} karakterden eksik karakter girer")
    public void snnKutusunaKarakterdenEksikKarakterGirer(int arg0) {
        studentManagementPage = new P10_StudentManagementPage();
        studentManagementPage.ssnBox.sendKeys("123456");

    }

    @But("SNN kutusuna {int} karakter girer fakat tire isareti yerine bosluk birakir")
    public void snnKutusunaKarakterGirerFakatTireIsaretiYerineBoslukBirakir(int arg0) {
        studentManagementPage = new P10_StudentManagementPage();
        studentManagementPage.ssnBox.sendKeys("211 34 2497");

    }

    @Then("{string} mesajini gordugunu dogrular")
    public void mesajiniGordugunuDogrular(String arg0) {
        class Utils {
            public void scrollIntoViewJS(WebElement element) {
                JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
                jsexecutor.executeScript("arguments[0].scrollIntoView(true);", studentManagementPage.SNNUyariMsj.getText().contains("Please enter valid SSN number"));
            }
        }
    }

    @But("Kullanici {int} den fazla Karakter girrer")
    public void kullaniciDenFazlaKarakterGirrer(int arg0) {
        studentManagementPage = new P10_StudentManagementPage();
        studentManagementPage.ssnBox.sendKeys("123-23-456789");
    }


    @But("Kullanici rakam yerine harf veya simge veya bosluk girer")
    public void kullaniciRakamYerineHarfVeyaSimgeVeyaBoslukGirer() {
        studentManagementPage = new P10_StudentManagementPage();
        studentManagementPage.ssnBox.sendKeys("abc-ef @g");
    }

    @When("Kullanici Snn Kutusuna valid deger girer, {int} ve {int} sayi arasina tire ekler")
    public void kullaniciSnnKutusunaValidDegerGirerVeSayiArasinaTireEkler(int arg0, int arg1) {
        studentManagementPage = new P10_StudentManagementPage();
        studentManagementPage.ssnBox.sendKeys(faker.regexify("[0-5]{3}-[0-9]{2}-[0-9]{4}"));
    }

    @When("Kullnici tekrar bastan baslar")
    public void kullniciTekrarBastanBaslar() {
        studentManagementPage = new P10_StudentManagementPage();
        Actions actions = new Actions(Driver.getDriver());
        Driver.getDriver().get("http://139.59.159.36:3000/student");
        studentManagementPage.ssnBox.sendKeys(Keys.DELETE);

    }

    @Then("kullanici {string} basari mesajini dogrular")
    public void kullaniciBasariMesajiniDogrular(String arg0) {
        class Utils {
            public void scrollIntoViewJS(WebElement element) {
                JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
                jsexecutor.executeScript("arguments[0].scrollIntoView(true);", studentManagementPage.PasswordRequiredUyariMsj.getText().contains("studentSavedSuccessfully"));
                Assert.assertTrue(studentManagementPage.studentSavedSuccessfully.isDisplayed());
                ReusableMethods.wait(15);
            }
        }
    }

    @Then("Password bolumunun zorunlu bir alan oldugu mesajini dogrular")
    public void passwordBolumununZorunluBirAlanOlduguMesajiniDogrular() {
        class Utils {
            public void scrollIntoViewJS(WebElement element) {
                JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
                jsexecutor.executeScript("arguments[0].scrollIntoView(true);", studentManagementPage.PasswordRequiredUyariMsj.getText().contains("Please enter valid SSN number"));
            }
        }
    }

    @Then("Kullanici{string} masajini gorur")
    public void kullaniciMasajiniGorur(String arg0) {
        class Utils {
            public void scrollIntoViewJS(WebElement element) {
                JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
                jsexecutor.executeScript("arguments[0].scrollIntoView(true);", studentManagementPage.ValidPhoneNumUyariMsj.getText().contains("Please enter valid phone number"));
            }
        }
    }

    @And("Submit butonuna click eder")
    public void submitButonunaClickEder() {
        studentManagementPage = new P10_StudentManagementPage();
        studentManagementPage.submitBtn.click();
        ReusableMethods.wait(10);
    }


    @And("Email kutusuna {string} girdi")
    public void emailKutusunaGirdi(String str) {
        studentManagementPage = new P10_StudentManagementPage();
        String email = faker.number().numberBetween(10000, 987798900) + "@gmail.com";

        if (str.equals("bir eposta adresi")) {
            studentManagementPage.emailBox2.sendKeys(email);
            studentObjectPojo.setEmail(email);
        } else {
            studentManagementPage.emailBox.sendKeys(str);
            studentObjectPojo.setName(str);
        }
    }

    @And("Birth Place {string} girdi")
    public void birthPlaceGirdi(String str) {
        studentManagementPage = new P10_StudentManagementPage();
        String birthPlace = faker.country().name().trim();

        if (str.equals("bir yer ismi")) {
            studentManagementPage.birthPlaceBox2.sendKeys(birthPlace);
            studentObjectPojo.setBirthPlace(birthPlace);
        } else {
            studentManagementPage.birthPlaceBox2.sendKeys(str);
            studentObjectPojo.setName(str);
        }

    }


    @And("Phone kutusuna {string} girdi")
    public void phoneKutusunaGirdi(String str) {
        studentManagementPage = new P10_StudentManagementPage();
        String phoneNumber = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");

        if (str.equals("bir telefon numarasi")) {
            studentManagementPage.phoneNumberBox.sendKeys(phoneNumber);
            studentObjectPojo.setPhoneNumber(phoneNumber);
        } else {
            studentManagementPage.phoneNumberBox.sendKeys(str);
            studentObjectPojo.setName(str);
        }
    }


    @And("Father Name kutusuna {string} girdi")
    public void fatherNameKutusunaGirdi(String str) {
            studentManagementPage = new P10_StudentManagementPage();
         String fatherName=str;
        studentManagementPage.fatherNameBox.sendKeys("@1234?//");
        studentObjectPojo.setFatherName(fatherName);

    }

























//Meryem Bor - 180.Satır
//Mehmet Kozak - 181.Satır











































//Mehmet Kozak - 220.Satır



}















