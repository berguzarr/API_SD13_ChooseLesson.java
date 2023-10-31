package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P03_LoginPage {
    public P03_LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(id = "username") public WebElement usernameBox;
@FindBy(id = "password") public WebElement passwordBox;
@FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']") public WebElement loginButton;
}
