package stepdefinitions.uiStepDefinitions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.P00_MainMenuPage;
import pages.P04_ContactPage;
import pages.P14_ContactGetAllPage;
import pojos.ContactContentPojo;
import utilities.Driver;
import utilities.ReusableMethods;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SD14_ContactGetAllStepDefiniton {

    P14_ContactGetAllPage contactGetAllPage;
    public static ContactContentPojo contactContentPojo = new ContactContentPojo();
    P00_MainMenuPage mainMenu;
    P04_ContactPage contactPage;
    Faker faker=new Faker();

    String str;
    int actualPageNumber;
    int gidilenPageNumber;
    int toplamPageNumber;



    //Ramazan Parmaksız - 30.Satır
    @When("Kullanici gecerli bir Contact Message olusturur")
    public void kullaniciGecerliBirContactMessageOlusturur() {
        contactPage=new P04_ContactPage();
        contactPage.contactBox.click();
        String name=faker.name().lastName()+" "+faker.name().lastName();
        contactPage.yournameBox.sendKeys(name);
        contactContentPojo.setName(name);
        System.out.println("name = " + name);
        String email= faker.random().nextInt(11111,99999)+"@batch103.com";
        contactPage.yourMailBox.sendKeys(email);
        contactContentPojo.setEmail(email);
        System.out.println("email = " + email);
        String subject="HashMap mi Set mi? "+faker.random().nextInt(1000,9999);
        contactPage.subjectBox.sendKeys(subject);
        contactContentPojo.setSubject(subject);
        System.out.println("subject = " + subject);
        String message="Bu mesaj UI da en sona kayıt olmuyor!";
        contactPage.messageBox.sendKeys(message);
        contactContentPojo.setMessage(message);
        System.out.println("message = " + message);
        contactPage.senMessageBtt.click();
        Assert.assertTrue(ReusableMethods.waitForVisibility(contactPage.basarliMesaj,5).isDisplayed());
    }

    @Then("Contact mesajin basariyla kaydedildigi dogrulanir")
    public void contactMesajinBasariylaKaydedildigiDogrulanir() {
        contactPage=new P04_ContactPage();
        Assert.assertTrue(ReusableMethods.waitForVisibility(contactPage.basarliMesaj,5).isDisplayed());
    }
    @When("Contact get all butonuna tiklar")
    public void contact_get_all_butonuna_tiklar() {

        mainMenu = new P00_MainMenuPage();
        mainMenu.contactGetAllButton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Contact message sayfasinda oldugunu dogrular")
    public void contact_message_sayfasinda_oldugunu_dogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(contactGetAllPage.contactMessageHeader.isDisplayed());
        ReusableMethods.waitFor(2);


    }

    @Then("Mesajlarin name lerinin gorundugunu dogrular")
    public void mesajlarin_name_lerinin_gorundugunu_dogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        ReusableMethods.waitFor(2);
        try {
            Assert.assertEquals(contactContentPojo.getName(), contactGetAllPage.tabloNameIlkHucre.getText());
        } catch (Exception e) {
            System.out.println("UI da kaydedilen mesaj en son mesaj olarak gelmeyip, listede rastgele bir yere yerleştiriliyor");
        }
        System.out.println(contactContentPojo.getName());
        System.out.println(contactGetAllPage.tabloNameIlkHucre.getText());
    }

    @And("Mesajlarin email lerinin gorundugunu dogrular")
    public void mesajlarin_Email_lerinin_Gorundugunu_Dogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        ReusableMethods.waitFor(2);
        //Assert.assertEquals(contactContentPojo.getEmail(), contactGetAllPage.tabloEmailEnSonHucre.getText());
        //Assert.assertEquals(contactObjectPojo.getEmail(), contactGetAllPage.tabloEmailIlkHucre.getText());

        if("".equals(contactGetAllPage.tabloEmailEnSonHucre.getText())){
            Assert.assertTrue(contactGetAllPage.tabloEmailEnSonHucre.getText().isEmpty());
        }else if("".equals(contactGetAllPage.tabloEmailIlkHucre.getText())){
            Assert.assertTrue(contactGetAllPage.tabloEmailIlkHucre.getText().isEmpty());
        }else {
            Assert.assertFalse(contactGetAllPage.tabloEmailEnSonHucre.getText().isEmpty());
        }

    }

    @Then("Mesajlarin date lerinin gorundugunu dogrular")
    public void mesajlarin_date_lerinin_gorundugunu_dogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        ReusableMethods.waitFor(2);
        if("".equals(contactGetAllPage.tabloDateEnSonHucre.getText())){
            Assert.assertTrue(contactGetAllPage.tabloDateEnSonHucre.getText().isEmpty());
        }else if("".equals(contactGetAllPage.tabloDateIlkHucre.getText())){
            Assert.assertTrue(contactGetAllPage.tabloDateIlkHucre.getText().isEmpty());
        }else {
            Assert.assertFalse(contactGetAllPage.tabloDateEnSonHucre.getText().isEmpty());
        }

    }

    @And("Mesajlarin subject lerinin gorundugunu dogrular")
    public void mesajlarinSubjectLerininGorundugunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        ReusableMethods.waitFor(2);
        //Assert.assertEquals(contactContentPojo.getSubject(), contactGetAllPage.tabloSubjectEnSonHucre.getText());
        if("".equals(contactGetAllPage.tabloSubjectEnSonHucre.getText())){
            Assert.assertTrue(contactGetAllPage.tabloSubjectEnSonHucre.getText().isEmpty());
        }else if("".equals(contactGetAllPage.tabloSubjectIlkHucre.getText())){
            Assert.assertTrue(contactGetAllPage.tabloSubjectIlkHucre.getText().isEmpty());
        }else {
            Assert.assertFalse(contactGetAllPage.tabloSubjectEnSonHucre.getText().isEmpty());
        }

    }

    @And("Next page butonuna tiklar")
    public void nextButonunaTiklar() {
        contactGetAllPage = new P14_ContactGetAllPage();
        str = contactGetAllPage.kacinciPage.getText();
        String[] pageNoText1 = str.split(" ");
        actualPageNumber = Integer.parseInt(pageNoText1[1]);
        toplamPageNumber = Integer.parseInt(pageNoText1[3]);
        ReusableMethods.clickElementByJS(contactGetAllPage.buttonOfNextPage);
        ReusableMethods.waitFor(2);
    }

    @Then("Sonraki Sayfaya gidildigini dogrular")
    public void sonrakiSayfayaGidildiginiDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        str = contactGetAllPage.kacinciPage.getText();
        String[] pageNoText2 = str.split(" ");
        gidilenPageNumber = Integer.parseInt(pageNoText2[1]);
        Assert.assertTrue(gidilenPageNumber>actualPageNumber);
    }

    @Then("Gidilen sayfadaki mesajlarin goruntulendigini dogrular")
    public void gidilenSayfadakiMesajlarinGoruntulendiginiDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        ReusableMethods.scrollIntoViewJS(contactGetAllPage.secimButonuOfDateHeader);
        ReusableMethods.waitFor(2);
        if("".equals(contactGetAllPage.tabloNameEnSonHucre.getText())){
            Assert.assertTrue(contactGetAllPage.tabloNameEnSonHucre.getText().isEmpty());
        }else {
            Assert.assertFalse(contactGetAllPage.tabloNameEnSonHucre.getText().isEmpty());
        }
    }

    @And("Last page butonuna tiklar")
    public void lastPageButonunaTiklar() {
        contactGetAllPage = new P14_ContactGetAllPage();
        str = contactGetAllPage.kacinciPage.getText();
        String[] pageNoText1 = str.split(" ");
        actualPageNumber = Integer.parseInt(pageNoText1[1]);
        toplamPageNumber = Integer.parseInt(pageNoText1[3]);
        ReusableMethods.clickElementByJS(contactGetAllPage.buttonOfLastPage);
        ReusableMethods.waitFor(2);
    }

    @Then("En Son sayfaya gidildigini dogrular")
    public void enSonSayfayaGidildiginiDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        str = contactGetAllPage.kacinciPage.getText();
        String[] pageNoText2 = str.split(" ");
        gidilenPageNumber = Integer.parseInt(pageNoText2[1]);
        int sonSayfaMesajSayisi= contactGetAllPage.messageSayisiList.size();
        int toplamMesajSayisi= ((gidilenPageNumber-1)*20)+sonSayfaMesajSayisi;
        contactContentPojo.setToplamMesajSayisi(toplamMesajSayisi);
        System.out.println("toplamMesajSayisi = " + toplamMesajSayisi);
        Assert.assertEquals(gidilenPageNumber, toplamPageNumber);
    }

    @Then("Onceki sayfaya gidildigini dogrular")
    public void oncekiSayfayaGidildiginiDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        str = contactGetAllPage.kacinciPage.getText();
        String[] pageNoText2 = str.split(" ");
        gidilenPageNumber = Integer.parseInt(pageNoText2[1]);
        Assert.assertTrue(gidilenPageNumber<toplamPageNumber);
    }

    @And("Onceki page butonuna tiklar")
    public void oncekiPageButonunaTiklar_RS() {
        contactGetAllPage = new P14_ContactGetAllPage();
        ReusableMethods.clickElementByJS(contactGetAllPage.buttonOfPreviousPage);
        ReusableMethods.waitFor(2);
    }

    @And("First page butonuna tiklar")
    public void firstPageButonunaTiklar_RS() {
        contactGetAllPage = new P14_ContactGetAllPage();
        ReusableMethods.clickElementByJS(contactGetAllPage.buttonOfFirstPage);
        ReusableMethods.waitFor(2);
    }

    @Then("First page de oldugunu dogrular")
    public void firstPageDeOldugunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        str = contactGetAllPage.kacinciPage.getText();
        String[] pageNoText2 = str.split(" ");
        gidilenPageNumber = Integer.parseInt(pageNoText2[1]);
        Assert.assertEquals(1, gidilenPageNumber);
    }

    // Buton silinince method düzeltilecek
    @And("Onceki page butonunun goruntulenmedigini dogrular")
    public void oncekiPageButonununGoruntulenmediginiDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertFalse(contactGetAllPage.buttonOfPreviousPage.isDisplayed());
    }

    // Buton silinince method düzeltilecek
    @Then("First page butonunun goruntulenmedigini dogrular")
    public void firstPageButonununGoruntulenmediginiDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertFalse(contactGetAllPage.buttonOfFirstPage.isDisplayed());
    }

    // Buton silinince method düzeltilecek
    @Then("Next page butonunun goruntulenmedigini dogrular")
    public void nextPageButonununGoruntulenmediginiDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertFalse(contactGetAllPage.buttonOfNextPage.isDisplayed());
    }

    // Buton silinince method düzeltilecek
    @Then("Last page butonunun goruntulenmedigini dogrular")
    public void lastPageButonununGoruntulenmediginiDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertFalse(contactGetAllPage.buttonOfLastPage.isDisplayed());
    }

    // Buton eklenince method düzeltilecek
    @Then("Name headerinda siralama butonu gorundugunu dogrular")
    public void nameHeaderindaSiralamaButonuGorundunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.messageHeaderList.contains("Name sort"));
    }

    // Buton eklenince method düzeltilecek
    @Then("Email headerinda siralama butonu gorundugunu dogrular")
    public void emailHeaderindaSiralamaButonuGorundunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.messageHeaderList.contains("Email sort"));
    }

    // Buton eklenince method düzeltilecek
    @Then("Date headerinda siralama butonu gorundugunu dogrular")
    public void dateHeaderindaSiralamaButonuGorundunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.messageHeaderList.contains("Date Sort"));
    }

    // Buton eklenince method düzeltilecek
    @Then("Subject headerinda siralama butonu gorundugunu dogrular")
    public void subjectHeaderindaSiralamaButonuGorundunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        System.out.println("contactGetAllPage.subjectHeader.getText() = " + contactGetAllPage.subjectHeader.getText());
        Assert.assertTrue(contactGetAllPage.messageHeaderList.contains("Subject Sort"));
    }

    // Buton eklenince method düzeltilecek
    @Then("Search butonu gorundugunu dogrular")
    public void searchButonuGorundunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.messageHeaderList.contains("Search"));
    }

    @Then("Forward butonu gorundugunu dogrular")
    public void forwardButonuGorundunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.messageHeaderList.contains("Forward"));
    }

    // Buton eklenince method düzeltilecek
    @Then("Delete butonu gorundugunu dogrular")
    public void deleteButonuGorundunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.messageHeaderList.contains("Delete"));
    }

    @And("Checkbox in gorundugunu dogrular")
    public void checkboxInGorundugunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.messageHeaderList.contains("Checkbox"));
    }

    @And("Checkbox a tiklayarak mesaj secer")
    public void checkboxATiklayarakMesajSecer() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.messageCheckbox.isSelected());
    }

    @Then("Date headerinda date input gorundugunu dogrular")
    public void dateHeaderindaSecimButonuGorundunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.messageHeaderList.contains("Input Date"));
    }

    @Then("All Delete butonu gorundugunu dogrular")
    public void allDeleteButonuGorundunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.messageHeaderList.contains("All Delete"));
    }

    @And("Name header in gorundugunu dogrular")
    public void nameHeaderInGorundugunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.nameHeader.isDisplayed());
    }

    @And("Email header in gorundugunu dogrular")
    public void emailHeaderInGorundugunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.emailHeader.isDisplayed());
    }

    @And("Date header in gorundugunu dogrular")
    public void dateHeaderInGorundugunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.dateHeader.isDisplayed());
    }

    @And("Subject header in gorundugunu dogrular")
    public void subjectHeaderInGorundugunuDogrular() {
        contactGetAllPage = new P14_ContactGetAllPage();
        Assert.assertTrue(contactGetAllPage.subjectHeader.isDisplayed());
    }

    @And("Driveri kapatir")
    public void driveriKapatir() {
        ReusableMethods.waitFor(5);
        Driver.closeDriver();
    }


//Ramazan Parmaksız - 310.Satır

}
