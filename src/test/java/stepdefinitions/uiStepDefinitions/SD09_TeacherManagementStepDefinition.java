package stepdefinitions.uiStepDefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.P09_TeacherManagementPage;
import pojos.StudentObjectPojo;
import pojos.TeacherObjectPojo;
import utilities.Driver;
import utilities.ReusableMethods;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static stepdefinitions.uiStepDefinitions.SD02_RegisterStepDefinition.registerObjectPojo;

public class SD09_TeacherManagementStepDefinition {
    P09_TeacherManagementPage teacherManagementPage;
    public static TeacherObjectPojo teacherObjectPojo = new TeacherObjectPojo();
    public static StudentObjectPojo studentObjectPojo =new StudentObjectPojo();

    Faker faker = new Faker();


//GürkayBirinci - 20.Satır
    @When("Choose Lesson menusune tiklar")
    public void choose_lesson_menusune_tiklar() {
        teacherManagementPage = new P09_TeacherManagementPage();
        teacherManagementPage.chooseLessonMenu.click();
        ReusableMethods.waitFor(7);
    }
    @When("Choose Lesson menusunden bir ders secer")
    public void choose_lesson_menusunden_bir_ders_secer() {
        teacherManagementPage = new P09_TeacherManagementPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
        ReusableMethods.waitFor(1);
    }
    @Then("Secilen dersin menude gorundugunu dogrular")
    public void secilen_dersin_menude_gorundugunu_dogrular() {
        teacherManagementPage = new P09_TeacherManagementPage();
        Assert.assertTrue(teacherManagementPage.lesson1.isDisplayed());
    }
    @Then("Secilen derslerin menude gorundugunu dogrular")
    public void secilenDerslerinMenudeGorundugunuDogrular() {
        teacherManagementPage = new P09_TeacherManagementPage();
        Assert.assertTrue(teacherManagementPage.lesson1.isDisplayed());
        Assert.assertTrue(teacherManagementPage.lesson2.isDisplayed());
    }
    @And("Name kutusuna {string} girer")
    public void nameKutusunaGirer(String str) {
        teacherManagementPage = new P09_TeacherManagementPage();
        String name = faker.name().firstName();

        if (str.equals("bir isim")){
            teacherManagementPage.nameBox.sendKeys(name);
            teacherObjectPojo.setName(name);
            studentObjectPojo.setName(name);
            registerObjectPojo.setName(name);
        }else{
            teacherManagementPage.nameBox.sendKeys(str);
            teacherObjectPojo.setName(str);
            studentObjectPojo.setName(str);
            registerObjectPojo.setName(str);
        }
    }
    @And("Surname kutusuna {string} girer")
    public void surnameKutusunaGirer(String str) {
        teacherManagementPage = new P09_TeacherManagementPage();
        String surname = faker.name().lastName();

        if (str.equals("bir soyisim")){
            teacherManagementPage.surnameBox.sendKeys(surname);
            teacherObjectPojo.setSurname(surname);
            studentObjectPojo.setSurname(surname);
            registerObjectPojo.setSurname(surname);
        }else{
            teacherManagementPage.surnameBox.sendKeys(str);
            teacherObjectPojo.setSurname(str);
            studentObjectPojo.setSurname(str);
            registerObjectPojo.setSurname(str);

        }
    }
    @And("Birth Place {string} girer")
    public void birthPlaceGirer(String str) {
        teacherManagementPage = new P09_TeacherManagementPage();
        String birthPlace = faker.lorem().word();

        if (str.equals("bir yer ismi")){
            teacherManagementPage.birthPlaceBox.sendKeys(birthPlace);
            teacherObjectPojo.setBirthPlace(birthPlace);
            studentObjectPojo.setBirthPlace(birthPlace);
            registerObjectPojo.setBirthPlace(birthPlace);
        }else{
            teacherManagementPage.birthPlaceBox.sendKeys(str);
            teacherObjectPojo.setBirthPlace(str);
            studentObjectPojo.setBirthPlace(str);
            registerObjectPojo.setBirthPlace(str);
        }
    }

    @And("Email kutusuna {string} girer")
    public void emailKutusunaGirer(String str) {
        teacherManagementPage = new P09_TeacherManagementPage();
        String email = faker.number().numberBetween(10000, 987798900) + "@gmail.com";

        if (str.equals("bir eposta adresi")){
            teacherManagementPage.emailBox.sendKeys(email);
            teacherObjectPojo.setEmail(email);
            studentObjectPojo.setEmail(email);
        }else{
            teacherManagementPage.emailBox.sendKeys(str);
            teacherObjectPojo.setEmail(str);
            studentObjectPojo.setEmail(str);
        }
    }
    @And("Phone kutusuna {string} girer")
    public void phoneKutusunaGirer(String str) {
        teacherManagementPage = new P09_TeacherManagementPage();
        String phoneNumber = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");

        if (str.equals("bir telefon numarasi")){
            teacherManagementPage.phoneNumberBox.sendKeys(phoneNumber);
            teacherObjectPojo.setPhoneNumber(phoneNumber);
            studentObjectPojo.setPhoneNumber(phoneNumber);
            registerObjectPojo.setPhoneNumber(phoneNumber);

        }else{
            teacherManagementPage.phoneNumberBox.sendKeys(str);
            teacherObjectPojo.setPhoneNumber(str);
            studentObjectPojo.setPhoneNumber(str);
            registerObjectPojo.setPhoneNumber(str);

        }
    }
    @And("Gender bolumunden {string} secenegini secer")
    public void genderBolumundenSeceneginiSecer(String str) {
        teacherManagementPage = new P09_TeacherManagementPage();
        String gender = "";

        if (str.equalsIgnoreCase("FEMALE")){
            gender = "FEMALE";
            teacherObjectPojo.setGender(gender);
            studentObjectPojo.setGender(gender);

            teacherManagementPage.genderFemale.click();
        } else if (str.equalsIgnoreCase("MALE")) {
            gender = "MALE";
            teacherManagementPage.genderMale.click();
            teacherObjectPojo.setGender(gender);
            studentObjectPojo.setGender(gender);

        } else {
            System.out.println("Hatalı veri girdiniz.");
        }

    }
    @When("Date Of Birth bolumune bir tarih girer")
    public void date_of_birth_bolumune_bir_tarih_girer() {
        teacherManagementPage = new P09_TeacherManagementPage();
        Date birthDay = faker.date().past(365*40, TimeUnit.DAYS);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(birthDay);
        teacherManagementPage.birthDayBox.sendKeys(formattedDate);

        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate2 = formatter2.format(birthDay);
        teacherObjectPojo.setBirthDay(formattedDate2);
        studentObjectPojo.setBirthDay(formattedDate2);
        registerObjectPojo.setBirthDay(formattedDate2);
    }
    @When("Ssn kutusuna bir numara girer")
    public void ssn_kutusuna_bir_numara_girer() {
        teacherManagementPage = new P09_TeacherManagementPage();
        String ssn = faker.regexify("[0-5]{3}-[0-9]{2}-[0-9]{4}");
        teacherManagementPage.ssnBox.sendKeys(ssn);
        teacherObjectPojo.setSsn(ssn);
        studentObjectPojo.setSsn(ssn);
        registerObjectPojo.setSsn(ssn);
    }
    @And("User Name kutusuna {string} girer")
    public void userNameKutusunaGirer(String str) {
        teacherManagementPage = new P09_TeacherManagementPage();
        String userName = faker.letterify("??????");

        if (str.equals("bir kullanici adi")){
            teacherManagementPage.usernameBox.sendKeys(userName);
            teacherObjectPojo.setUsername(userName);
            studentObjectPojo.setUsername(userName);
            registerObjectPojo.setUsername(userName);

        }else{
            teacherManagementPage.usernameBox.sendKeys(str);
            teacherObjectPojo.setUsername(str);
            studentObjectPojo.setUsername(str);
            registerObjectPojo.setUsername(str);

        }
    }
    @When("Password kutusuna bir sifre girer")
    public void password_kutusuna_bir_sifre_girer() {
        teacherManagementPage = new P09_TeacherManagementPage();
        teacherManagementPage.passwordBox.sendKeys(faker.internet().password(8, 10));
    }
    @When("Submit butonuna tiklar")
    public void submit_butonuna_tiklar() {
        teacherManagementPage = new P09_TeacherManagementPage();
        teacherManagementPage.submitButton.click();
    }
    @Then("Kayit isleminin gerceklesmedigini dogrular")
    public void kayit_isleminin_gerceklesmedigini_dogrular() {
        teacherManagementPage = new P09_TeacherManagementPage();
        Assert.assertFalse(ReusableMethods.waitForVisibility(teacherManagementPage.kayitBasariliMesaji, 5).isDisplayed());
    }
    @And("Kayit isleminin gerceklestigini dogrular")
    public void kayitIslemininGerceklestiginiDogrular() {
        teacherManagementPage = new P09_TeacherManagementPage();
        Assert.assertTrue(ReusableMethods.waitForVisibility(teacherManagementPage.kayitBasariliMesaji, 5).isDisplayed());
    }
    @Then("{string} bolumunun zorunlu alan oldugu mesajinin gorundugunu dogrular")
    public void bolumununZorunluAlanOlduguMesajininGorundugunuDogrular(String str) {
        teacherManagementPage = new P09_TeacherManagementPage();
        switch (str){
            case "Choose Lesson":
                Assert.assertTrue(teacherManagementPage.chooseLessonMenu.getText().contains(teacherManagementPage.requiredMesaji.getText()));
                break;
            case "Name":
                Assert.assertTrue(teacherManagementPage.nameField.getText().contains(teacherManagementPage.requiredMesaji.getText()));
                break;
            case "Surname":
                Assert.assertTrue(teacherManagementPage.surnameField.getText().contains(teacherManagementPage.requiredMesaji.getText()));
                break;
            case "Birth Place":
                Assert.assertTrue(teacherManagementPage.birthPlaceField.getText().contains(teacherManagementPage.requiredMesaji.getText()));
                break;
            case "Email":
                Assert.assertTrue(teacherManagementPage.emailField.getText().contains(teacherManagementPage.requiredMesaji.getText()));
                break;
            case "Phone":
                Assert.assertTrue(teacherManagementPage.phoneField.getText().contains(teacherManagementPage.requiredMesaji.getText()));
                break;
            case "Gender":
                Assert.assertTrue(teacherManagementPage.genderField.getText().contains(teacherManagementPage.requiredMesaji.getText()));
                break;
            case "Date Of Birth":
                Assert.assertTrue(teacherManagementPage.birthPlaceField.getText().contains(teacherManagementPage.requiredMesaji.getText()));
                break;
            case "Ssn":
                Assert.assertTrue(teacherManagementPage.ssnField.getText().contains(teacherManagementPage.requiredMesaji.getText()));
                break;
            case "User Name":
                Assert.assertTrue(teacherManagementPage.userNameField.getText().contains(teacherManagementPage.requiredMesaji.getText()));
                break;
            case "Password":
                Assert.assertTrue(teacherManagementPage.passwordField.getText().contains(teacherManagementPage.requiredMesaji.getText()));
                break;
            default:
                System.out.println("Hatalı veri giriniz.");
        }
    }
    
    @Then("Ayni isimde birden fazla ders olmadigini dogrular")
    public void ayniIsimdeBirdenFazlaDersOlmadiginiDogrular() {
        teacherManagementPage = new P09_TeacherManagementPage();
        List<String> dersListesi = Arrays.asList(teacherManagementPage.lessonListesi.get(0).getText().split("\n"));
        Set<String> dersSeti = new HashSet<>(dersListesi);
        Assert.assertEquals(dersSeti.size(), dersListesi.size());
    }
    @And("Is Advisor Teacher kutusuna tiklar")
    public void ısAdvisorTeacherKutusunaTiklar() {
        teacherManagementPage = new P09_TeacherManagementPage();
        teacherManagementPage.isAdvisorTeacherBox.click();
    }
    @Then("Is Advisor Teacher kutusunun secili oldugunu dogrular")
    public void ısAdvisorTeacherKutusununSeciliOldugunuDogrular() {
        teacherManagementPage = new P09_TeacherManagementPage();
        Assert.assertTrue(teacherManagementPage.isAdvisorTeacherBox.isSelected());
    }
    @Then("Is Advisor Teacher kutusunun secili olmadigini dogrular")
    public void ısAdvisorTeacherKutusununSeciliOlmadiginiDogrular() {
        teacherManagementPage = new P09_TeacherManagementPage();
        Assert.assertFalse(teacherManagementPage.isAdvisorTeacherBox.isSelected());
    }
    @Then("Gender bolumundeki {string} kutusunun secili oldugunu dogrular")
    public void genderBolumundekiKutusununSeciliOldugunuDogrular(String str) {
        teacherManagementPage = new P09_TeacherManagementPage();
        if (str.equalsIgnoreCase("Female")){
            Assert.assertTrue(teacherManagementPage.genderFemale.isSelected());
        } else if (str.equalsIgnoreCase("Male")) {
            Assert.assertTrue(teacherManagementPage.genderMale.isSelected());
        }else {
            System.out.println("Hatalı veri girdiniz.");
        }
    }
    @Then("Gender bolumundeki {string} kutusunun secili olmadigini dogrular")
    public void genderBolumundekiKutusununSeciliOlmadiginiDogrular(String str) {
        teacherManagementPage = new P09_TeacherManagementPage();
        if (str.equalsIgnoreCase("Female")){
            Assert.assertFalse(teacherManagementPage.genderFemale.isSelected());
        } else if (str.equalsIgnoreCase("Male")) {
            Assert.assertFalse(teacherManagementPage.genderMale.isSelected());
        }else {
            System.out.println("Hatalı veri girdiniz.");
        }
    }
    @And("Date Of Birth bolumune bugunden ileri bir tarih girer")
    public void dateOfBirthBolumuneBugundenIleriBirTarihGirer() {
        teacherManagementPage = new P09_TeacherManagementPage();
        Date date = faker.date().future(365*40, TimeUnit.DAYS);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(date);
        teacherManagementPage.birthDayBox.sendKeys(formattedDate);
        registerObjectPojo.setBirthDay(formattedDate);
    }
    @And("Ssn kutusuna gecersiz bir numara girer")
    public void ssnKutusunaGecersizBirNumaraGirer() {
        teacherManagementPage = new P09_TeacherManagementPage();
        teacherManagementPage.ssnBox.sendKeys("10101001001");
    }
    @And("Password kutusuna yedi karakterli bir sifre girer")
    public void passwordKutusunaYediKarakterliBirSifreGirer() {
        teacherManagementPage = new P09_TeacherManagementPage();
        teacherManagementPage.passwordBox.sendKeys(faker.internet().password(6, 7));
    }
    @Then("Kayit isleminin sadece bir kez gerceklestigini dogrular")
    public void kayitIslemininSadeceBirKezGerceklestiginiDogrular() {
        teacherManagementPage = new P09_TeacherManagementPage();
        ReusableMethods.waitFor(2);
        List<WebElement> list = teacherManagementPage.kayitBasariliMesajiList;
        Assert.assertEquals(1, list.size());
    }
    @And("Submit butonuna uc kez tiklar")
    public void submitButonunaIkiKezTiklar() {
        teacherManagementPage = new P09_TeacherManagementPage();
        teacherManagementPage.submitButton.click();
        teacherManagementPage.submitButton.click();
        teacherManagementPage.submitButton.click();
    }


    






    //GürkayBirinci - 350.Satır
    //Sevda Işık - 351.Satır
    public static TeacherObjectPojo teacherObjectPojo1 = new TeacherObjectPojo();
    @And("Teacher List bolumunde daha once olusturulan kayitların Name Surname bilgisinin görülebildigi dogrulanir")
    public void teacherListBolumundeDahaOnceOlusturulanKayitlarınNameSurnameBilgisininGörülebildigiDogrulanir() {
        teacherManagementPage = new P09_TeacherManagementPage();
        assert teacherManagementPage.name_surnameSvd.isDisplayed();
    }

    @And("Teacher List bolumunde daha once olusturulan kayitların Phone Number bilgisinin görülebildigi dogrulanir")
    public void teacherListBolumundeDahaOnceOlusturulanKayitlarınPhoneNumberBilgisininGörülebildigiDogrulanir() {
        teacherManagementPage = new P09_TeacherManagementPage();
        assert teacherManagementPage.phoneNumberSvd.isDisplayed();
    }

    @And("Teacher List bolumunde daha once olusturulan kayitların Ssn bilgisinin görülebildigi dogrulanir")
    public void teacherListBolumundeDahaOnceOlusturulanKayitlarınSsnBilgisininGörülebildigiDogrulanir() {
        teacherManagementPage = new P09_TeacherManagementPage();
        assert teacherManagementPage.ssnSvd.isDisplayed();
    }

    @And("Teacher List bolumunde daha once olusturulan kayitların User Name Surname bilgisinin görülebildigi dogrulanir")
    public void teacherListBolumundeDahaOnceOlusturulanKayitlarınUserNameSurnameBilgisininGörülebildigiDogrulanir() {
        teacherManagementPage = new P09_TeacherManagementPage();
        assert teacherManagementPage.user_nameSvd.isDisplayed();
    }

    @And("Edit butonuna tiklar")
    public void editButonunaTiklar() {
        teacherManagementPage = new P09_TeacherManagementPage();
        ReusableMethods.clickElementByJS(teacherManagementPage.editButtonSvd);
        ReusableMethods.waitFor(2);
    }



    @And("Edit Gender bölümünden Female seçeneğini seçilir")
    public void editGenderBölümündenFemaleSeçeneğiniSeçilir() {
        teacherManagementPage = new P09_TeacherManagementPage();
        String gender="";
        teacherManagementPage.editFameleButtonSvd.click();
        teacherObjectPojo.setGender(gender);
        teacherManagementPage.editMaleButtonSvd.click();
        teacherObjectPojo1.setGender(gender);
    }

    @And("Edit Password kutusuna {string} girer")
    public void editPasswordKutusunaGirer(String arg0) {
        teacherManagementPage = new P09_TeacherManagementPage();
        teacherManagementPage.editPasswordButtonSvd.sendKeys(arg0);

    }

    @And("Edit bolumunde yer alan Submit butonuna tiklar")
    public void editBolumundeYerAlanSubmitButonunaTiklar() {
        teacherManagementPage = new P09_TeacherManagementPage();
        teacherManagementPage.editSubmitButtonSvd.click();
    }

    @And("Edit Name kutusuna {string} girer")
    public void editNameKutusunaGirer(String arg0) {
        teacherManagementPage = new P09_TeacherManagementPage();
        String name = faker.name().firstName();
        ReusableMethods.cleanByJs(teacherManagementPage.editNameBoxSvd);
        teacherManagementPage.editNameBoxSvd.sendKeys(arg0);
        teacherObjectPojo1.setName(name);
    }

    @Then("Edit  işleminin gerçeklestigi doğrulanir")
    public void editIşlemininGerçeklestigiDoğrulanir() {
        teacherManagementPage = new P09_TeacherManagementPage();
        Assert.assertTrue(teacherManagementPage.kayitBasariliMesaji.isDisplayed());
    }

    @And("Edit Surname kutusuna {string} girer")
    public void editSurnameKutusunaGirer(String arg0) {
        teacherManagementPage = new P09_TeacherManagementPage();
        String surName = faker.name().firstName();
        ReusableMethods.cleanByJs(teacherManagementPage.editSurnameBoxSvd);
        teacherManagementPage.editSurnameBoxSvd.sendKeys(arg0);
        teacherObjectPojo1.setSurname(surName);
    }

    @And("Edit Birth Place bolumune {string} girer")
    public void editBirthPlaceBolumuneGirer(String arg0) {
        teacherManagementPage = new P09_TeacherManagementPage();
        String birthPlace = faker.address().country();
        ReusableMethods.cleanByJs(teacherManagementPage.editBirthPlaceBoxSvd);
        teacherManagementPage.editBirthPlaceBoxSvd.sendKeys(arg0);
        teacherObjectPojo1.setBirthPlace(birthPlace);
    }

    @And("Email kutusuna yeni email {string} girer")
    public void emailKutusunaYeniEmailGirer(String arg0) {
        teacherManagementPage = new P09_TeacherManagementPage();
        String email = faker.number().numberBetween(10000, 987798900) + "@gmail.com";
        ReusableMethods.cleanByJs(teacherManagementPage.editEmailBoxSvd);
        teacherManagementPage.editEmailBoxSvd.sendKeys(arg0);
        teacherObjectPojo1.setEmail(email);
    }

    @And("Edit Phone kutusuna yeni {string} girer")
    public void editPhoneKutusunaYeniGirer(String arg0) {
        teacherManagementPage = new P09_TeacherManagementPage();
        String phoneNumber = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");
        ReusableMethods.cleanByJs(teacherManagementPage.editPhoneNumberBoxSvd);
        teacherManagementPage.editPhoneNumberBoxSvd.sendKeys(arg0);
        teacherObjectPojo1.setPhoneNumber(phoneNumber);
    }

    @And("Edit Ssn kutusuna bir numara girer")
    public void editSsnKutusunaBirNumaraGirer() {
        teacherManagementPage = new P09_TeacherManagementPage();
        String ssn ="";
        ReusableMethods.cleanByJs(teacherManagementPage.editSsnBoxSvd);
        teacherManagementPage.editSsnBoxSvd.sendKeys("123-47-5698");
        teacherObjectPojo1.setSsn(ssn);
    }

    @And("Date Of Birth bolumune yeni bir tarih girer")
    public void dateOfBirthBolumuneYeniBirTarihGirer() {
        teacherManagementPage = new P09_TeacherManagementPage();
        Date birthDay = faker.date().past(365 * 40, TimeUnit.DAYS);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(birthDay);
        ReusableMethods.cleanByJs(teacherManagementPage.editDateOfBirthBoxSvd);
        teacherManagementPage.editDateOfBirthBoxSvd.sendKeys(formattedDate);
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate2 = formatter2.format(birthDay);
        teacherObjectPojo1.setBirthDay(formattedDate2);
    }
    @And("Edit User Name kutusu editlenir")
    public void editUserNameKutusuEditlenir() {
        teacherManagementPage = new P09_TeacherManagementPage();
        String userName = faker.name().username();
        ReusableMethods.cleanByJs(teacherManagementPage.editUserNameBoxSvd);
        teacherManagementPage.editUserNameBoxSvd.sendKeys("edittedUser");
        teacherObjectPojo1.setSurname(userName);
    }

    @And("Edit Password kutusuna yeni sifre olarak {string} girer")
    public void editPasswordKutusunaYeniSifreOlarakGirer(String arg0) {
        teacherManagementPage = new P09_TeacherManagementPage();
        ReusableMethods.cleanByJs(teacherManagementPage.editPasswordButtonSvd);
        teacherManagementPage.editPasswordButtonSvd.sendKeys(arg0);
    }

    @And("Edit Gender bölümünden Male seçeneğini seçilir")
    public void editGenderBölümündenMaleSeçeneğiniSeçilir() {
        teacherManagementPage = new P09_TeacherManagementPage();
        String gender="";
        teacherManagementPage.editMaleButtonSvd.click();
        teacherObjectPojo1.setGender(gender);
    }

    @And("Edit Choose Lesson menusune tiklar")
    public void editChooseLessonMenusuneTiklar() {
        teacherManagementPage = new P09_TeacherManagementPage();
       teacherManagementPage.editchooselesson1.click();
     //  teacherManagementPage.editchooselesson1.sendKeys("JAVA",Keys.ENTER);
        ReusableMethods.waitFor(1);

    }

    @And("Edit Choose Lessons dropdownundan ders secilir")
    public void editChooseLessonsDropdownundanDersSecilir() {
        teacherManagementPage = new P09_TeacherManagementPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
        ReusableMethods.waitFor(1);

    }

    @And("Edit secilen dersin menude oldugunu dogrular")
    public void editSecilenDersinMenudeOldugunuDogrular() {
        teacherManagementPage = new P09_TeacherManagementPage();
        Assert.assertTrue(teacherManagementPage.lessonsvd.isDisplayed());

    }

    @And("Edit IsAdvisor secenegini isaretler")
    public void editIsAdvisorSeceneginiIsaretler() {
        teacherManagementPage = new P09_TeacherManagementPage();
   teacherManagementPage.editIsAdvisorButtonSvd.click();


    }


//Sevda Işık -420.Satır
}
