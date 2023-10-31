package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class P15_GuestUserPage {
    public P15_GuestUserPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//tbody//tr[1]")
    public WebElement tableRow;
    @FindBy(xpath = "//tbody//tr[1]//td[5]")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement deletedPopUp;
    @FindBy (xpath = "(//span[@aria-hidden='true'])[3]")
    public WebElement next;


}
