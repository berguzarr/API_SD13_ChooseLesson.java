package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P11_StudentInfoManagementPage {
    public P11_StudentInfoManagementPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "h3[bg='primary']") public WebElement txt_StudentInfoManagementHeader_M;
    @FindBy (css = ".m-5 > .fw-bold") public WebElement txt_AddStudentInfoHeader_M;
    @FindBy (css = ".mb-5 > .fw-bold") public WebElement txt_StudentInfoListHeader_M;
    @FindBy (id = "lessonId") public WebElement dd_ChooseLesson_M;
    @FindBy (id = "studentId") public WebElement dd_ChooseStuent_M;
    @FindBy (id = "educationTermId") public WebElement dd_ChooseEducationTerm_M;
    @FindBy (id = "absentee") public WebElement input_Absentee_M;
    @FindBy (id = "midtermExam") public WebElement input_MidtermExam_M;
    @FindBy (id = "finalExam") public WebElement input_FinalExam_M;
    @FindBy (id = "infoNote") public WebElement input_InfoNote;
    @FindBy (xpath = "//*[text()='Submit']") public WebElement btn_Submit_M;
    @FindBy (xpath = "(//div[@class='Toastify__toast-body'])[1]") public WebElement popup_Info_M;
    @FindBy (css = ".invalid-feedback") public WebElement txt_Required_M;
    @FindBy (xpath = "//tbody[1]//tr[1]//i[@class='fa-solid fa-trash']") public WebElement btn_DeleteFirstOption_M;
    @FindBy (xpath = "//th[.='Name Surname']") public WebElement header_NameSurname_M;
    @FindBy (xpath = "//tbody//tr//td[1]") public WebElement txt_NameSurname_M;
    @FindBy (xpath = "//th[.='Lesson Name']") public WebElement header_LessonName_M;
    @FindBy (xpath = "//tbody//tr//td[2]") public WebElement txt_LessonName_M;
    @FindBy (xpath = "//th[.='Absentee']") public WebElement header_Absentee_M;
    @FindBy (xpath = "//tbody//tr//td[3]") public WebElement txt_Absentee_M;
    @FindBy (xpath = "//th[.='Midterm Exam']") public WebElement header_MidtermExam_M;
    @FindBy (xpath = "//tbody//tr//td[4]") public WebElement txt_MidtermExam_M;
    @FindBy (xpath = "//th[.='Final Exam']") public WebElement header_FinalExam_M;
    @FindBy (xpath = "//tbody//tr//td[5]") public WebElement txt_FinalExam_M;
    @FindBy (xpath = "//th[.='Note']") public WebElement header_Note_M;
    @FindBy (xpath = "//th[.='Info Note']") public WebElement header_InfoNote_M;
    @FindBy (xpath = "//tbody//tr//td[7]") public WebElement txt_InfoNote_M;
    @FindBy (xpath = "//th[.='Average']") public WebElement header_Average_M;
    @FindBy (xpath = "(//button[contains(.,'Edit')])[1]") public WebElement btn_EditFirstOption_M;
    @FindBy (css = ".modal-title.h4") public WebElement txt_EditStudentInfoHeader_M;
    @FindBy (css = ".me-4 #lessonId") public WebElement input_EditStudentInfoLesson_M;
    @FindBy (css = ".me-4 #educationTermId") public WebElement input_EditStudentInfoEducationTerm_M;
    @FindBy (css = ".me-4 #midtermExam") public WebElement input_EditStudentInfoMidtermExam_M;
    @FindBy (css = ".me-4 #finalExam") public WebElement input_EditStudentInfoFinalExam_M;
    @FindBy (css = ".me-4 #infoNote") public WebElement input_EditStudentInfoInfoNote_M;
    @FindBy (xpath = "(//*[text()='Submit'])[2]") public WebElement btn_EditStudentInfoSubmit_M;
    @FindBy (css = ".modal-header > .btn-close") public WebElement btn_EditStudentInfoClose_M;


}
