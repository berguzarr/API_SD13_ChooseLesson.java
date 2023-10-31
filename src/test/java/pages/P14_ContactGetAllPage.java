package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class P14_ContactGetAllPage {
    public P14_ContactGetAllPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h5[@class='fw-bold p-3 card-header']") public WebElement contactMessageHeader;
    @FindBy(xpath = "//th[.='Name']") public WebElement nameHeader;
    @FindBy(xpath = "//th[.='Email']") public WebElement emailHeader;
    @FindBy(xpath = "//th[.='Date']") public WebElement dateHeader;
    @FindBy(xpath = "//th[.='Subject']") public WebElement subjectHeader;
    @FindBy(xpath = "//th[.='Message']") public WebElement messageHeader;
    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[1]/thead/tr/th") public List<WebElement> messageHeaderList;
    @FindBy(xpath = "//span[@class='page-link']") public WebElement pageNumber;
    @FindBy(xpath = "//a[.='«First']") public WebElement buttonOfFirstPage;
    @FindBy(xpath = "//a[.='‹Previous']") public WebElement buttonOfPreviousPage;
    @FindBy(xpath = "//span[.='›']") public WebElement buttonOfNextPage;
    @FindBy(xpath = "//a[.='»Last']") public WebElement buttonOfLastPage;
    @FindBy(xpath = "//a[.='nameSiralama']") public WebElement sortByNameButton; // fix sonrası locate düzeltilecek
    @FindBy(xpath = "//a[.='emailSiralama']") public WebElement sortByEmailButton; // fix sonrası locate düzeltilecek
    @FindBy(xpath = "//a[.='dateSiralama']") public WebElement sortByDateButton; // fix sonrası locate düzeltilecek
    @FindBy(xpath = "//a[.='subjectSiralama']") public WebElement sortBySubjectButton; // fix sonrası locate düzeltilecek
    @FindBy(xpath = "//a[.='messageSearchButton']") public WebElement messageSearchButton; // fix sonrası locate düzeltilecek
    @FindBy(xpath = "//a[.='messageDeleteButton']") public WebElement messageDeleteButton; // fix sonrası locate düzeltilecek
    @FindBy(xpath = "//a[.='messageCheckbox']") public WebElement messageCheckbox; // fix sonrası locate düzeltilecek
    @FindBy(xpath = "//a[.='secimButonuOfDateHeader']") public WebElement secimButonuOfDateHeader; // fix sonrası locate düzeltilecek
    @FindBy(xpath = "//a[.='allDelete']") public WebElement allDeleteButton; // fix sonrası locate düzeltilecek
    @FindBy(xpath = "//a[.='meassageForward']") public WebElement forwardMessageButton; // fix sonrası locate düzeltilecek
    @FindBy(xpath = "//div[@class='d-flex justify-content-start ps-5 col']") public WebElement kacinciPage;
    @FindBy(xpath = "//table//tr[last()]//td[1]") public WebElement sonEklenenName;
    @FindBy(xpath = "//table//tr[last()]//td[2]") public WebElement sonEklenenEmail;
    @FindBy(xpath = "//table//tr[last()]//td[3]") public WebElement sonEklenenDate;
    @FindBy(xpath = "//table//tr[last()]//td[4]") public WebElement sonEklenenSubject;
    @FindBy(xpath = "//table//tr[last()]//td[1]") public WebElement tabloNameEnSonHucre;
    @FindBy(xpath = "//table//tr[last()]//td[2]") public WebElement tabloEmailEnSonHucre;
    @FindBy(xpath = "//table//tr[last()]//td[3]") public WebElement tabloDateEnSonHucre;
    @FindBy(xpath = "//table//tr[last()]//td[4]") public WebElement tabloSubjectEnSonHucre;
    @FindBy(xpath = "//table//tr[1]//td[1]") public WebElement tabloNameIlkHucre;
    @FindBy(xpath = "//table//tr[1]//td[2]") public WebElement tabloEmailIlkHucre;
    @FindBy(xpath = "//table//tr[1]//td[3]") public WebElement tabloDateIlkHucre;
    @FindBy(xpath = "//table//tr[1]//td[4]") public WebElement tabloSubjectIlkHucre;
    @FindBy(xpath = "//thead[.='NameEmailDateSubjectMessage']") public WebElement tabloHeaderRow;
    @FindBy(xpath = "//tbody[@class='table-group-divider']/tr") public List<WebElement> messageSayisiList;



    //@FindBy (css = ".css-b62m3t-container") public WebElement chooseLessonMenu;
    //@FindBy(xpath = "//h5[@class='fw-bold p-3 card-header']']") public WebElement getCantactAll;
    //@FindBy (id = "password") public WebElement passwordBox;


}
