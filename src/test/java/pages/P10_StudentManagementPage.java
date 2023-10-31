package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P10_StudentManagementPage {
    public P10_StudentManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Student Management']") public WebElement StudentManagementBtn;
    @FindBy(id = "advisorTeacherId") public WebElement chooseAdvisorTeacherDrpdwn;
    @FindBy(xpath = "//div//select//option[7]") public WebElement selectDropdownOptionJohnSmith;
    @FindBy(id = "name") public WebElement nameBox;
    @FindBy(id = "surname") public WebElement surnameBox;
    @FindBy(id = "birthPlace") public WebElement birthPlaceBox;
    @FindBy(id = "email") public WebElement emailBox;
    @FindBy(id = "phoneNumber") public WebElement phoneNumberBox;
    @FindBy(xpath = "//input[@value='FEMALE']") public WebElement genderFemale;
    @FindBy(id = "birthDay") public WebElement birthDayBox;
    @FindBy(id = "ssn") public WebElement ssnBox;
    @FindBy(id = "username") public WebElement usernameBox;
    @FindBy(id = "password") public WebElement passwordBox;
    @FindBy(css = ".btn-primary") public WebElement submitBtn;
    @FindBy(xpath = "//div[.='Please select advisor teacher']//div[2]") public WebElement uyariMsgSelectAdvisorTeacher;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[contains(.,'JSON parse error: Cannot coerce empty String (\"\") to `com.project.schoolmanagmen')]")
    public WebElement GenderUyariMasaji;
    @FindBy(id = "fatherName") public WebElement fatherNameBox;
    @FindBy(id = "motherName") public WebElement motherNameBox;
    @FindBy(css = ".Toastify__toast-body") public WebElement emailUyariMsj;
    @FindBy(xpath = "//div[@class='mb-3 pt-4']/div[@class='invalid-feedback']") public WebElement BirthDateRequiredUyariMsj;
    @FindBy(xpath = "//form[1]/div[@class='row']/div[1]//div[.='Required']") public WebElement SNNRequiredUyariMsj;
    @FindBy(xpath = "//form[1]/div[@class='row']/div[2]//div[.='Required']") public WebElement UserNameRequiredUyariMsj;
    @FindBy(xpath = "//form[1]/div[@class='row']/div[3]//div[.='Required']") public WebElement FatherNameRquiredUyariMsj;
    @FindBy(xpath = "//form[1]//div[4]//div[@class='invalid-feedback']") public WebElement MotherNameRequiredUyariMsj;
    @FindBy(xpath = "(//table//tr//th//.)[1]") public WebElement StudentNumbersList;//  bununlada oluyor,  //th[.='Student Number']
    @FindBy(xpath = "//form[1]//div[5]/div[@class='mb-4  form-floating']/div[@class='invalid-feedback']") public WebElement PasswordRequiredUyariMsj;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[11]") public WebElement MinValueForPasswordUyariMsj; ////div[.='Minimum 8 character']
    @FindBy(xpath = "//div[.='Minimum 12 character (XXX-XXX-XXXX)']") public WebElement MinValueForPhoneNumUyariMsj;
    @FindBy(css = ".Toastify__toast-container") public WebElement PhoneNumUyariMsj;
    @FindBy(linkText = "Minimum 11 character (XXX-XX-XXXX)") public WebElement SNNUyariMsj;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']") public WebElement studentSavedSuccessfully;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Please enter valid phone number']")
    public WebElement ValidPhoneNumUyariMsj;
   @FindBy(xpath = "//input[@id='email']") public WebElement emailBox2;
    @FindBy (id = "birthPlace") public WebElement birthPlaceBox2;

}
////div[@class='Toastify__toast-body']/div[.='Please enter valid SSN number'