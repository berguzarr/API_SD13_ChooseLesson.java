package stepdefinitions.uiStepDefinitions;

import io.cucumber.java.en.Given;
import pages.P00_MainMenuPage;
import pages.P01_HomePage;


public class SD01_HomeStepDefinition {
    P01_HomePage homePage;
    P00_MainMenuPage mainMenuPage;

    @Given("Kullanici login e tiklar")
    public void kullanici_login_e_tiklar() {
        homePage=new P01_HomePage();
        mainMenuPage=new P00_MainMenuPage();
        if(homePage.loginLink.isDisplayed()) { // Ramazan değiştirdi: Features seviyesinde çalıştırmak için
            homePage.loginLink.click();
        }else{
            mainMenuPage.menuButton.click();
        }
    }

}
