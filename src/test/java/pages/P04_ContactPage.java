package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P04_ContactPage {
    public P04_ContactPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Contact']") public WebElement contactBox;
    @FindBy(xpath = "(//*[@class='form-control'])[1]") public WebElement yournameBox;
    @FindBy(id = "email") public WebElement yourMailBox;
    @FindBy(id = "subject") public WebElement subjectBox;
    @FindBy(id = "message") public WebElement messageBox;
    @FindBy(xpath = "//*[text()='Send Message']") public WebElement senMessageBtt;
    @FindBy(xpath = "//*[text()='Contact Message Created Successfully']") public WebElement basarliMesaj;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']") public WebElement bosMailHataMesaj;
    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']") public WebElement invalidMailHataMesaj;
    @FindBy(xpath = "//*[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']") public WebElement tekrarMailHataMesaj;

}
