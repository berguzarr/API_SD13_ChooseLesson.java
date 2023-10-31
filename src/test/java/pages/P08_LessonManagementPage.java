package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class P08_LessonManagementPage {
    public P08_LessonManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Lesson Management']") public WebElement lessonManagementButtonEs;
    @FindBy(id = "controlled-tab-example-tab-lessonsList") public WebElement lessonsSekmeTiklaEs;
    @FindBy(id = "creditScore") public WebElement creditScoreEs;
    @FindBy(id = "lessonName") public WebElement lessonsNameEs;
    @FindBy(id = "compulsory") public WebElement compulsoryEs;
    @FindBy(xpath = "//th[.='Lesson Name']") public WebElement lessonNameBaslikEs;
    @FindBy(xpath = "//th[.='Compulsory']") public WebElement compulsoryBaslikEs;
    @FindBy(xpath = "//th[.='Credit Score']") public WebElement creditScoreBaslikEs;
    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonsList']//a[.='»Last']") public WebElement ensonSayfayaGitButonEs;
    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[2]/tbody/tr") public List<WebElement> lessonSekmesiTRListEs;
    @FindBy(xpath = "//*[@class='fa-solid fa-trash']") public List<WebElement> deleteLessonButtonEs;
    @FindBy(xpath = "//*[text()='Edit']") public WebElement editLessonButtonEs;
    @FindBy  (xpath = "//div[@class='Toastify__toast-body']/div[contains(.,'JSON parse error: Cannot deserialize value of type `int`')]") public WebElement creditScoreKayitHatasiMesajiEs;
    @FindBy (xpath = "//div[@class='Toastify__toast-body']/div[.='Lesson Created']") public WebElement kayitBasariliMesajiEs;
    @FindBy (xpath = "//div[@class='mb-4 form-floating']/div[@class='invalid-feedback']") public WebElement requiredHatasiMesajiLessonEs;
    @FindBy (xpath = "//div[@class='mb-4  form-floating']/div[@class='invalid-feedback']") public WebElement requiredHatasiMesajiCreditScoreEs;
    @FindBy (xpath = "//div[@class='Toastify__toast-body']/div[.='Lesson Deleted']") public WebElement dersSilindiMesajiEs;
    @FindBy(id = "controlled-tab-example-tab-lessonsList") public WebElement lessonsSekmeTikla;
    @FindBy(id = "creditScore") public WebElement creditScore;
    @FindBy(xpath = "//div[@class='mx-auto mt-1 ms-4 mb-1 col']//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit;
    //    @FindBy(xpath = "//th[.='Lesson Name']") public WebElement lessonListAlanindakiLessonName;
//    @FindBy(xpath = "//th[.='Compulsory']") public WebElement lessonListAlanindakiCompulsory;
//    @FindBy(xpath = "//th[.='Credit Score']") public WebElement lessonListAlanindakiCreditScore;
    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonsList']//span[.='»']") public WebElement lessonEnsonSayfayaGitButon;
    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']") public WebElement lessonsSekmeTikla2;
    @FindBy(id = "lessonName") public WebElement lessonsName;
    @FindBy(id = "compulsory") public WebElement compulsory;
    @FindBy(xpath = "//th[.='Lesson Name']") public WebElement lessonNameBaslik;
    @FindBy(xpath = "//th[.='Compulsory']") public WebElement compulsoryBaslik;
    @FindBy(xpath = "//th[.='Credit Score']") public WebElement creditScoreBaslik;
    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonsList']//a[.='»Last']") public WebElement ensonSayfayaGitButon;
    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[2]/tbody/tr") public List<WebElement> lessonSekmesiTRList;
    @FindBy(xpath = "//*[@class='fa-solid fa-trash']") public List<WebElement> deleteLessonButton;
    @FindBy(xpath = "//div[@class='mx-auto mt-1 ms-4 mb-1 col']//button[@class='fw-semibold btn btn-primary btn-lg']") public WebElement submit2;
    @FindBy (xpath = "//div[@class='Toastify__toast-body']/div[.='Error: Lesson with lesson name , already register']") public WebElement lessonNameKayitHatasiMesaji;
    @FindBy(xpath = "//*[text()='Edit']") public WebElement editLessonButton;
    @FindBy  (xpath = "//div[@class='Toastify__toast-body']/div[contains(.,'JSON parse error: Cannot deserialize value of type `int`')]") public WebElement creditScoreKayitHatasiMesaji;
    @FindBy (xpath = "//div[@class='Toastify__toast-body']/div[.='Lesson Created']") public WebElement kayitBasariliMesaji;
    @FindBy (xpath = "//div[@class='mb-4 form-floating']/div[@class='invalid-feedback']") public WebElement requiredHatasiMesajiLesson;
    @FindBy (xpath = "//div[@class='mb-4  form-floating']/div[@class='invalid-feedback']") public WebElement requiredHatasiMesajiCreditScore;
    @FindBy (xpath = "//div[@class='Toastify__toast-body']/div[.='Lesson Deleted']") public WebElement dersSilindiMesaji;

//@FindBy(xpath = "//A[@role='button'][text()='Lesson Management']") public WebElement chooseLesson;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']") public WebElement loginButon;
    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-educationTerm']") public WebElement lessontermAb;
    @FindBy(xpath ="//*[@id='controlled-tab-example-tab-lessonProgram']") public WebElement lessonProgramAb;
    @FindBy(xpath = "//DIV[@class=' css-9jq23d'][text()='Math']") public WebElement lessonsechAb;
    @FindBy(xpath = "//*[text()='Education Term Management']") public WebElement termsechAb;
    @FindBy(xpath = "//SELECT[@id='day']") public WebElement dayclickAb;
    @FindBy(xpath = "//INPUT[@id='startTime']") public WebElement startTimeAb;
    @FindBy(xpath = "//INPUT[@id='stopTime']") public WebElement stopTimeAb;
    @FindBy(xpath = "//DIV[@class=' css-9jq23d'][text()='Math']") public WebElement lessonsech2Ab;
    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-educationTerm']") public WebElement lessonterm;
//    @FindBy(className = "//DIV[@class=' css-9jq23d'][text()='Math']") public WebElement lessonsech;
    @FindBy(xpath = "//*[@text= '.Toastify__toast-body']") public WebElement lessoncreated;
    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']") public WebElement registerdone;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']") public WebElement lessonsSekmesvd;


    @FindBy(xpath = "//div[@class=' mb-3 mt-4 col']/button[@class='fw-semibold btn btn-primary btn-lg']") public WebElement submitsvd;
    @FindBy(id = "lessonName") public WebElement lessonNamaesvd;
    @FindBy(id = "compulsory") public WebElement compulsorysvd;
    @FindBy(id = "creditScore") public WebElement creditScoresvd;
    @FindBy(xpath = "//div[@class='mx-auto mt-1 ms-4 mb-1 col']//button[@class='fw-semibold btn btn-primary btn-lg']") public WebElement submit1svd;

    @FindBy(xpath="//button[@id='controlled-tab-exa") public WebElement lessonPrgsvd;

    @FindBy (xpath = "//h5[.='Add Lesson Program']") public WebElement addLessonProgramBasliksvd;
    @FindBy(id = "day") public WebElement chooseDayMenusvd;
    @FindBy(id = "educationTermId") public WebElement chooseEducationTermMenusvd;
    @FindBy(id = "startTime") public WebElement startTimeBoxsvd;
    @FindBy(id = "stopTime") public WebElement stopTimeBoxsvd;
    @FindBy(css = ".Toastify__toast-body") public WebElement createdLessonProgramMesajisvd;

    @FindBy(xpath = "//h5[.='Add Lesson']") public WebElement addLessonBasliksvd;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[contains(.,'JSON parse error: Cannot coerce empty String')]") public WebElement chooseLessonHatasiMesajisvd;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[contains(.,'JSON parse error: Cannot deserialize value of type')]") public WebElement chooseDayHatasiMesajisvd;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Please select education term']") public WebElement educationTermHatasiMesajisvd;
    @FindBy(xpath = "//div[.='Required']") public WebElement requiredHatasiMesajisvd;
    @FindBy(xpath = "//h5[.='Lesson Program Assignment']") public WebElement lessonProgramAssignmentBasliksvd;
    @FindBy(id = "teacherId") public WebElement chooseTeacherMenusvd;
    @FindBy(id = "lessonProgramId") public List<WebElement> chooseLessonControlBoxsvd;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Lesson added to Teacher']") public WebElement lessonAddedToTeacherMesajisvd;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Error: Lesson Programs not found']") public WebElement lessonAddedToTeacherHataMesajisvd;
    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[4]") public WebElement lessonProgramAssignmentTablesvd;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Error: Course schedule cannot be selected for the same hour and day']") public WebElement sameHourAndDayHataMesajisvd;

   // @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonsList']") public WebElement lessonsSekmesvd1;
    @FindBy(xpath = "//*[@role='CFV']") public WebElement lessonsSekmesvd1;
    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonProgram']") public WebElement lessonProgramSekmesvd1;


}
