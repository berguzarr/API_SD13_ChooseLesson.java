package pages;

import freemarker.cache.WebappTemplateLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.Watchable;
import java.util.List;

public class P13_ChooseLessonManagementPage {
    public P13_ChooseLessonManagementPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//A[@role='button'][text()='Lesson Management']")
    public WebElement chooseLesson;
    @FindBy(id = "//BUTTON[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgram;
    @FindBy(className = "//DIV[@class=' css-9jq23d'][text()='Math']")
    public WebElement lessonSech;
    @FindBy(xpath = "//*[text()='Education Term Management']")
    public WebElement eduTrmMngmntsvd;
    @FindBy(xpath = "//SELECT[@id='day']")
    public WebElement daysech;
    @FindBy(xpath = "//INPUT[@id='startTime']")
    public WebElement startTimesech;
    @FindBy(xpath = "//INPUT[@id='stopTime']")
    public WebElement stopTimesech;
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover'])[4]/tbody/tr")
    public  WebElement list;
    @FindBy(id="editButtonId")
    public WebElement noEditBtn;
    @FindBy(id="deleteButtonId")
    public WebElement noDeleteBtn;
    @FindBy(xpath = "(//thead//th[3])[1]") public WebElement teacherBasligi;
    @FindBy(xpath = "(//thead//th[4])[1]") public WebElement dayBasligi;
    @FindBy(xpath = "//thead//th[5]") public WebElement startBasligi;
    @FindBy(xpath = "//thead//th[6]") public WebElement stopBasligi;
    @FindBy(xpath = "(//tbody//tr//td[1]//input)[last()]") public WebElement sonDersCheckBox;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']") public WebElement chooseLessonSubmit;
    @FindBy(xpath = "//div[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']") public WebElement addedLessonUyariMesaji;
    @FindBy(xpath = "(//tbody//tr//td[2]//*[text()='Kafaya Takmama Sanatı'])[1]") public WebElement ayniDers1;
    @FindBy(xpath = "(//tbody//tr//td[2]//*[text()='Kafaya Takmama Sanatı'])[2]") public WebElement ayniDers2;
    @FindBy(xpath = "//button[text()='Menu']") public WebElement studentMenuButton;
    @FindBy(xpath = "//a[text()='Grades and Announcements']") public WebElement gradesAndAnnouncements;
    @FindBy(xpath = "//tbody//td[5]") public WebElement studentNote;
    @FindBy(xpath = "//*[text()='2023-04-20']") public WebElement toplanti;

}
