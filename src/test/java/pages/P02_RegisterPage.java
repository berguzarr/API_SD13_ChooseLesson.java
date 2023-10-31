package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P02_RegisterPage {
    public P02_RegisterPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="phoneNumber")public WebElement phoneNumberBox;
    @FindBy(xpath = "//*[@value='FEMALE']")public WebElement femaleButon;
    @FindBy(id = "birthDay")public WebElement birthDayBox;
    @FindBy(id = "ssn")public WebElement ssnBox;
    @FindBy(id = "username")public WebElement usernameBox;
    @FindBy(id = "password")public WebElement passwordBox;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")public WebElement registerButon;
    @FindBy(xpath = "//*[@ class='card-img-top p-4 pb-6']")public  WebElement guestRegister;
    @FindBy(xpath = "//*[text()='Required']")public  WebElement phoneRequired;
    @FindBy(xpath = "//*[text()='Please enter valid phone number']")public  WebElement validPhoneUyari;
    @FindBy(xpath = "//*[text()='Required']")public  WebElement validDateBirthUyari;
    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")public  WebElement ileriTarihUyari;
    @FindBy(xpath = "//*[text()='Required']")public  WebElement ssnRequired;
    @FindBy(xpath = "//* [@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")public  WebElement ssnInvalidUyari;
    @FindBy(xpath = "//*[text()='Required']")public WebElement usernameRequired;
    @FindBy(xpath = "//*[text()='Required']")public WebElement passwordRequired;
    @FindBy(xpath = "//*[text()='Minimum 8 character']")public WebElement passwordMin8;
    @FindBy(xpath = "//*[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']")public WebElement kayitliUsernameMesaj;
    @FindBy(xpath = "//*[text()='Error: User with ssn 123-55-4455 already register']")public WebElement kayitliSsnMesaj;
    @FindBy(xpath = "//*[text()='Error: User with phone number 543-233-4556 already register']")public WebElement kayitliTelMesaj;

}
