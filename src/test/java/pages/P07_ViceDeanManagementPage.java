package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class P07_ViceDeanManagementPage {
    public P07_ViceDeanManagementPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(id = "name") public WebElement nameBox;
    @FindBy (id = "surname") public WebElement surnameBox;
    @FindBy (id = "birthPlace") public WebElement birthPlaceBox;
    @FindBy (id = "phoneNumber") public WebElement phoneNumberBox;
    @FindBy (css = ".btn-primary") public WebElement submitButton;
    @FindBy (xpath = "(//div[@id='4'])[1]") public WebElement kayitBasariliMesaji;
    @FindBy (xpath = "(//div[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter'])[2]") public WebElement kayitHatasiMesaji;

    @FindBy (xpath = "//*[text()='»']") public WebElement sonEklenenSayfaGecisi;
    @FindBy (xpath = "(//tbody//tr)[last()]//td[3]") public WebElement sonDeanTelefon;
    @FindBy (id = "birthDay") public WebElement birthDayBox;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]") public WebElement dateRequiredMesaji;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]") public WebElement phoneRequiredMesaji;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]") public WebElement ssnRequiredMesaji;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]") public WebElement usernameRequiredMesaji;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]") public WebElement passwordRequiredMesaji;

@FindBy (xpath = "//A[@role='button'][text()='Vice Dean Management']") public WebElement vicedeanManagement;
   // @FindBy(id = "name") public WebElement nameBox;
    //@FindBy (id = "surname") public WebElement surnameBox;
    //@FindBy (id = "birthPlace") public WebElement birthPlaceBox;
    @FindBy (id = "email") public WebElement emailBox;
   // @FindBy (id = "phoneNumber") public WebElement phoneNumberBox;
    @FindBy (xpath = "//input[@value='MALE']") public WebElement genderMale;
    @FindBy (xpath = "//input[@value='FEMALE']") public WebElement genderFemale;
    //FindBy (id = "birthDay") public WebElement birthDayBox;
    @FindBy (id = "ssn") public WebElement ssnBox;
    @FindBy (id = "username") public WebElement usernameBox;
    @FindBy (id = "password") public WebElement passwordBox;
    @FindBy (xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']") public WebElement submitbtn;
   // @FindBy (xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']") public WebElement kayitHatasiMesaji;
    //@FindBy (xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']") public WebElement kayitBasariliMesaji;
   // @FindBy (xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']") public List<WebElement> kayitBasariliMesajiList;

}
