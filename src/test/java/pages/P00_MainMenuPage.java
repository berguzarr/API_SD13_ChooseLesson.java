package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P00_MainMenuPage {
    public P00_MainMenuPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//button[text()='Menu']") public WebElement menuButton;
@FindBy(xpath = "//a[text()='Admin Management']") public WebElement adminManagementButton;
@FindBy(xpath = "//a[text()='Dean Management']") public WebElement deanManagementButton;
@FindBy(xpath = "//a[text()='Vice Dean Management']") public WebElement viceDeanManagementButton;
@FindBy(xpath = "//a[text()='Lesson Management']") public WebElement lessonManagementButton;
@FindBy(xpath = "//a[text()='Teacher Management']") public WebElement teacherManagementButton;
@FindBy(xpath = "//a[text()='Student Management']") public WebElement studentManagementButton;
@FindBy(xpath = "//a[text()='Student Info Management']") public WebElement studentInfoManagementButton;
@FindBy(xpath = "//a[text()='Meet Management']") public WebElement meetManagementButton;
@FindBy(xpath = "//a[text()='Choose Lesson']") public WebElement chooseLessonButton;
@FindBy(xpath = "//a[text()='Contact Get All']") public WebElement contactGetAllButton;
@FindBy(xpath = "//a[text()='Guest User']") public WebElement guestUserButton;
@FindBy(xpath = "//a[text()='Logout']") public WebElement logoutButton;
@FindBy(xpath = "//div[@class='offcanvas offcanvas-start show']/div[@class='offcanvas-body']") public WebElement mainMenueBodyForStudent;
}
