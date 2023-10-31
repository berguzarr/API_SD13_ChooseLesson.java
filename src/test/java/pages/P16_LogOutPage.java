package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P16_LogOutPage {
    public P16_LogOutPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
