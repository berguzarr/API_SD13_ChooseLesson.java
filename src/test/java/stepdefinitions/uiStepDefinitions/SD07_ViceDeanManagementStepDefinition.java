package stepdefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.P07_ViceDeanManagementPage;
import pojos.AdminObjectPojo;
import utilities.ReusableMethods;

public class SD07_ViceDeanManagementStepDefinition { P07_ViceDeanManagementPage viceDeanManagementPage;
    Faker faker = new Faker();
    public static AdminObjectPojo adminObjectPojo=new AdminObjectPojo();







    //Mehmet Kozak - 20.Satır
    @Then("Kayit olmadigini telefonlarin farkli olmasi ile dogrular")
    public void kayitOlmadiginiTelefonlarinFarkliOlmasiIleDogrular() {
        viceDeanManagementPage=new P07_ViceDeanManagementPage();
        ReusableMethods.clickElementByJS(viceDeanManagementPage.sonEklenenSayfaGecisi);
        ReusableMethods.waitFor(2);
        Assert.assertNotEquals(viceDeanManagementPage.phoneNumberBox.getAttribute("value"),viceDeanManagementPage.sonDeanTelefon.getText());

    }
    @Then("Kayit mesaji gorunmemelidir")
    public void kayitMesajiGorunmemelidir() {
        viceDeanManagementPage=new P07_ViceDeanManagementPage();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(viceDeanManagementPage.kayitBasariliMesaji.isDisplayed());
    }

    @And("Date Of Birth bolumune anormal bir tarih {string} girer")
    public void dateOfBirthBolumuneAnormalBirTarihGirer(String str) {
        viceDeanManagementPage=new P07_ViceDeanManagementPage();
        viceDeanManagementPage.birthDayBox.sendKeys(str);
    }

    @Then("Date Of Birth bolumunun altinda {string}  mesajini gorundugunu dogrularKoz")
    public void dateOfBirthBolumununAltindaMesajiniGorundugunuDogrularKoz(String str) {
        viceDeanManagementPage=new P07_ViceDeanManagementPage();
        Assert.assertTrue(viceDeanManagementPage.dateRequiredMesaji.getText().contains(str));
    }

    @Then("Phone bolumunun altinda {string}  mesajini gorundugunu dogrularKoz")
    public void phoneBolumununAltindaMesajiniGorundugunuDogrularKoz(String str) {
        viceDeanManagementPage=new P07_ViceDeanManagementPage();
        Assert.assertTrue(viceDeanManagementPage.phoneRequiredMesaji.getText().contains(str));
    }

    @Then("SSN bolumunun altinda {string} mesajini gorundugunu dogrularKoz")
    public void ssnBolumununAltindaMesajiniGorundugunuDogrularKoz(String str) {
        viceDeanManagementPage=new P07_ViceDeanManagementPage();
        Assert.assertTrue(viceDeanManagementPage.ssnRequiredMesaji.getText().contains(str));
    }

    @Then("Username bolumu altinda {string} mesajini gorundugunu dogrularKoz")
    public void usernameBolumuAltindaMesajiniGorundugunuDogrularKoz(String str) {
        viceDeanManagementPage=new P07_ViceDeanManagementPage();
        Assert.assertTrue(viceDeanManagementPage.usernameRequiredMesaji.getText().contains(str));
    }

    @Then("Password bolumu altinda {string} mesajini gorundugunu dogrularKoz")
    public void passwordBolumuAltindaMesajiniGorundugunuDogrularKoz(String str) {
        viceDeanManagementPage=new P07_ViceDeanManagementPage();
        Assert.assertTrue(viceDeanManagementPage.passwordRequiredMesaji.getText().contains(str));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//Mehmet Kozak - 220.Satır   
//Sevda Işık - - 121.Satır

































































































    
//ABAT - 221.Satır
    @And("Vice Dean Management box tiklar")
    public void viceDeanboxTiklanir(){
    viceDeanManagementPage= new P07_ViceDeanManagementPage();
    viceDeanManagementPage.vicedeanManagement.click();
}
    @Then("Submit buttonuna tiklar")
    public void submit_button_is_clicked() {

        viceDeanManagementPage = new P07_ViceDeanManagementPage();
        ReusableMethods.clickElement(viceDeanManagementPage.submitbtn);
        ReusableMethods.waitFor(2);
    }

    @And("Phone kutusuna {string} girer_Koz")
    public void phoneKutusunaGirer_Koz(String str) {
        viceDeanManagementPage = new P07_ViceDeanManagementPage();
        String phoneNumber = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");

        if (str.equals("bir telefon numarasi")){
            viceDeanManagementPage.phoneNumberBox.sendKeys(phoneNumber);
            adminObjectPojo.setPhoneNumber(phoneNumber);
        }else{
            viceDeanManagementPage.phoneNumberBox.sendKeys(str);
            adminObjectPojo.setPhoneNumber(str);
        }
    }

    @And("Ssn kutusuna bir numara girer_Koz")
    public void ssnKutusunaBirNumaraGirer_Koz() {
        viceDeanManagementPage = new P07_ViceDeanManagementPage();
        String ssn = faker.regexify("[0-5]{3}-[0-9]{2}-[0-9]{4}");
        viceDeanManagementPage.ssnBox.sendKeys(ssn);
        adminObjectPojo.setSsn(ssn);
    }
}






















































































//ABAT - 320.Satır

