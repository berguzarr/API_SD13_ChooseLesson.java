package stepdefinitions.uiStepDefinitions;

import io.cucumber.java.en.When;
import pages.P03_LoginPage;
import utilities.ReusableMethods;


public class SD03_LoginStepDefinition {
    P03_LoginPage loginPage;

    @When("Username kutusuna {string} girer")
    public void username_i_girer(String string) {
        loginPage = new P03_LoginPage();
        loginPage.usernameBox.sendKeys(string);
    }

    @When("Password kutusuna {string} girer")
    public void password_i_girer(String string) {
        loginPage = new P03_LoginPage();
        loginPage.passwordBox.sendKeys(string);

    }

    @When("Login butonuna tiklar")
    public void login_butonuna_tiklar() {
        loginPage=new P03_LoginPage();
        ReusableMethods.clickElementByJS(loginPage.loginButton);

}







    //Huseyin - 40.Satır















































































    //huseyin - 120.Satır








}
