package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P01_HomePage {
    public P01_HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@href='/login']") public WebElement loginLink;
    @FindBy(xpath = "//*[@class='header_link me-2']") public WebElement registerLink; //zeliha
    @FindBy(css =".btn") public WebElement logInButton;

}


