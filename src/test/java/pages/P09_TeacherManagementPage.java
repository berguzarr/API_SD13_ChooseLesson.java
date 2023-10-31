package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class P09_TeacherManagementPage {
    public P09_TeacherManagementPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = ".css-b62m3t-container") public WebElement chooseLessonMenu;
    @FindBy (xpath = "(//div[@class=' css-1p3m7a8-multiValue'])[1]") public WebElement lesson1;
    @FindBy (xpath = "(//div[@class=' css-1p3m7a8-multiValue'])[2]") public WebElement lesson2;
    @FindBy (id = "name") public WebElement nameBox;
    @FindBy (id = "surname") public WebElement surnameBox;
    @FindBy (id = "birthPlace") public WebElement birthPlaceBox;
    @FindBy (id = "email") public WebElement emailBox;
    @FindBy (id = "phoneNumber") public WebElement phoneNumberBox;
    @FindBy (xpath = "//input[@value='MALE']") public WebElement genderMale;
    @FindBy (xpath = "//input[@value='FEMALE']") public WebElement genderFemale;
    @FindBy (id = "birthDay") public WebElement birthDayBox;
    @FindBy (id = "ssn") public WebElement ssnBox;
    @FindBy (id = "username") public WebElement usernameBox;
    @FindBy (id = "password") public WebElement passwordBox;
    @FindBy (css = ".btn-primary") public WebElement submitButton;
    @FindBy (xpath = "//*[@class=' Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']") public WebElement kayitHatasiMesaji;
    @FindBy (xpath = "//div[@class='mx-auto mt-1 ms-4 mb-1 col']//button[@class='fw-semibold btn btn-primary btn-lg']") public WebElement submitButton2;
    @FindBy (xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']") public WebElement kayitHatasiMesaji2;
    @FindBy (xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']") public WebElement kayitBasariliMesaji;
    @FindBy (xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']") public List<WebElement> kayitBasariliMesajiList;
    @FindBy(xpath = "//*[text()='Required']") public WebElement requiredMesaji;
    @FindBy(id = "react-select-3-listbox") public List<WebElement> lessonListesi;
    @FindBy (xpath = "(//*[@class='mb-4  form-floating'])[1]") public WebElement nameField;
    @FindBy (xpath = "(//*[@class='mb-4  form-floating'])[2]") public WebElement surnameField;
    @FindBy (xpath = "(//*[@class='mb-4  form-floating'])[3]") public WebElement birthPlaceField;
    @FindBy (xpath = "(//*[@class='mb-4  form-floating'])[4]") public WebElement emailField;
    @FindBy (xpath = "(//*[@class='mb-4  form-floating'])[5]") public WebElement phoneField;
    @FindBy (xpath = "(//*[@class='mb-4  form-floating'])[6]") public WebElement ssnField;
    @FindBy (xpath = "(//*[@class='mb-4  form-floating'])[7]") public WebElement userNameField;
    @FindBy (xpath = "(//*[@class='mb-4  form-floating'])[8]") public WebElement passwordField;
    @FindBy (xpath = "//*[@class='text-center pt-4 col-md-auto']") public WebElement genderField;
    @FindBy (id = "isAdvisorTeacher") public WebElement isAdvisorTeacherBox;


    @FindBy(xpath = "(//*[@class=' css-qbdosj-Input'])[2]") public WebElement editchooselessonsvd;
    @FindBy (xpath = "(//div[@class=' css-1p3m7a8-multiValue'])[1]") public WebElement lessonsvd;
    @FindBy (xpath = "(//*[@class='css-tj5bde-Svg'])[2]") public WebElement editchooselesson1;
@FindBy(xpath = "//table//tr//th[1]") public WebElement name_surnameSvd;
@FindBy(xpath = "//table//tr//th[2]") public WebElement phoneNumberSvd;
@FindBy(xpath = "//table//tr//th[3]") public WebElement ssnSvd;
@FindBy(xpath = "//table//tr//th[4]") public WebElement user_nameSvd;
@FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]") public WebElement editButtonSvd;
@FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]") public WebElement editSubmitButtonSvd;
@FindBy(xpath = "(//input[@id='name'])[2]") public WebElement editNameBoxSvd;

@FindBy(xpath = "(//input[@id='isAdvisorTeacher'])[2]") public WebElement editIsAdvisorButtonSvd;
@FindBy(xpath = "(//input[@name='gender'])[3]") public WebElement editFameleButtonSvd;
@FindBy(xpath = "(//input[@name='gender'])[4]") public WebElement editMaleButtonSvd;
@FindBy(xpath = "(//input[@id='password'])[2]") public WebElement editPasswordButtonSvd;
@FindBy(xpath = "(//input[@id='surname'])[2]") public WebElement editSurnameBoxSvd;
@FindBy(xpath = "(//input[@id='birthPlace'])[2]") public  WebElement editBirthPlaceBoxSvd;
@FindBy(xpath = "(//input[@id='email'])[2]") public  WebElement editEmailBoxSvd;
@FindBy(xpath = "(//input[@id='phoneNumber'])[2]") public  WebElement editPhoneNumberBoxSvd;
@FindBy(xpath = "(//input[@id='ssn'])[2]") public  WebElement editSsnBoxSvd;
@FindBy(xpath = "(//input[@id='birthDay'])[2]") public  WebElement editDateOfBirthBoxSvd;
@FindBy(xpath = "(//input[@id='username'])[2]") public  WebElement editUserNameBoxSvd;

}

