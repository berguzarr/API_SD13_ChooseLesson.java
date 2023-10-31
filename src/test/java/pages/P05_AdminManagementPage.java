package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P05_AdminManagementPage {
    public P05_AdminManagementPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "name") public WebElement nameBox;
    @FindBy(id = "surname") public WebElement surnameBox;
    @FindBy(id = "birthPlace") public WebElement birthPlaceBox;
    @FindBy(xpath = "//input[@value='FEMALE']") public WebElement femaleButton;
    @FindBy(xpath = "//input[@value='MALE']") public WebElement maleButton;
    @FindBy(id = "birthDay") public WebElement dateOfBirthBox;
    @FindBy(id = "phoneNumber") public WebElement phoneNumberBox;
    @FindBy(id = "ssn") public WebElement ssnBox;
    @FindBy(id = "username") public WebElement usernameBox;
    @FindBy(id = "password") public WebElement passwordBox;
    @FindBys({@FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']"), @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonProgram']//div[@class='mt-5 ms-3 me-3 text-center border border-3 shadow-sm bg-body rounded card border-warning']//button[@class='fw-semibold btn btn-primary btn-lg']")}) public WebElement submitButton;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']") public WebElement adminSavedPopUp;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]") public WebElement nameRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]") public WebElement surnameRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]") public WebElement birtPlaceRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]") public WebElement usernameRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]") public WebElement passwordRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]") public WebElement phoneRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]") public WebElement ssnRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]") public WebElement dateOfBirthRequired;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButtonNt;

}
