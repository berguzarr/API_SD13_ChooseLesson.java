package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P12_MeetManagementPage {
    public P12_MeetManagementPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


@FindBy(id="react-select-3-input") public WebElement chooseStudent;
@FindBy(xpath = "//div[text()='Select Students02']") public WebElement chooseStudent2;
@FindBy(xpath = "//div[@class=' css-9jq23d']") public WebElement seraJones;
@FindBy(xpath = "//div[@class=' css-9jq23d']") public WebElement veliStudent;
@FindBy(id="date") public WebElement dateOfMeet;
@FindBy(xpath = "(//*[@id='date'])[2]") public WebElement dateOfMeet2;
@FindBy(id="startTime") public WebElement startTime;
@FindBy(id="stopTime") public WebElement stopTime;
@FindBy(id="description") public WebElement description;
@FindBy(xpath = "//button[text()='Submit']") public WebElement submitButton;
@FindBy(xpath = "//div[text()='ileri bir tarih olmalı']") public WebElement gecmisTarihUyari;
@FindBy(xpath = "//div[text()='Error: Choose Student doldurulmalı']") public WebElement chooseStudentUyari;
@FindBy(xpath = "(//div[text()='Error: start time must not be greater than or equal to stop time'])[1]") public WebElement erkenStopTimeUyari;
@FindBy(xpath = "//div[text()='Farklı bir tarih olmalı']") public WebElement ayniTarihveSaatUyari;
@FindBy(xpath = "//div[text()='Farklı bir saat olmalı']") public WebElement ayniSaatUyari;
@FindBy(xpath = "//table//tr[1]//th[text()='Date']") public WebElement meetListDate;
@FindBy(xpath = "//table//tr[1]//th[text()='Start Time']") public WebElement meetListStartTime;
@FindBy(xpath = "//table//tr[1]//th[text()='Stop Time']") public WebElement meetListStopTime;
@FindBy(xpath = "//table//tr[1]//th[text()='Description']") public WebElement meetListDescription;
@FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]") public WebElement editButton;
@FindBy(xpath = "(//button[text()='Submit'])[2]") public WebElement submitButton2;
@FindBy(xpath = "(//button[text()='Submit'])[1]") public WebElement submitButton3;
@FindBy(xpath = "(//*[@class='btn btn-danger'])[1]") public WebElement deleteButton;
@FindBy(xpath = "(//*[text()='Meet deleted successfully '])[1]") public WebElement silindiUyarisi;
@FindBy(xpath = "(//div[text()='Meet Updated Successfully'])[1]") public WebElement guncellendiUyarisi;
@FindBy(xpath = "(//div[text()='Daha once bu saatte toplanti olusturulmus'])[1]") public WebElement ayniSaatUyarisi;

}
