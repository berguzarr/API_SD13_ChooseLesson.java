package stepdefinitions.uiStepDefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.P00_MainMenuPage;
import pages.P08_LessonManagementPage;
import pages.P09_TeacherManagementPage;
import pojos.LessonPojo;
import pojos.LessonProgramObjectPojo;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.Driver;

import java.util.List;
public class SD08_LessonManagementStepDefinition {

    P08_LessonManagementPage lessonManagementPage;
    Faker faker = new Faker();

    public static LessonPojo lessonPojo = new LessonPojo();













    //Esra Birinci - 30.Satır

    @When("Lesson Management butonuna tiklar")
    public void lesson_management_butonuna_tiklar() {
        lessonManagementPage = new P08_LessonManagementPage();
        lessonManagementPage.lessonManagementButtonEs.click();
    }
    @And("Lesson Name alanina {string} girer")
    public void lessonNameAlaninaGirer(String str) {
        lessonManagementPage = new P08_LessonManagementPage();
        String dersIsmi = "";
        if (str.equals("ders adi")) {
            for (int i = 0; i < 10; i++) {
                dersIsmi = faker.book().title();
                if (dersIsmi.length() > 15) {
                    dersIsmi = dersIsmi.substring(0, 15);
                }
            }
            lessonManagementPage.lessonsNameEs.sendKeys(dersIsmi);
            lessonPojo.setLessonName(dersIsmi);
        } else {
            lessonManagementPage.lessonsNameEs.sendKeys(str);
            lessonPojo.setLessonName(dersIsmi);
        }
    }
    @When("Compulsory kontrol kutusuna tiklar")
    public void compulsory_kontrol_kutusuna_tiklar() {
        lessonManagementPage = new P08_LessonManagementPage();
        lessonManagementPage.compulsoryEs.click();
        lessonPojo.setCompulsory(true);
    }

    @Then("Dersin eklendigini dogrular")
    public void dersin_eklendigini_dogrular() {
        lessonManagementPage = new P08_LessonManagementPage();
        Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.kayitBasariliMesajiEs, 3).isDisplayed());
    }
    
    @And("Lessons sekmesine tiklar")
    public void lessonsSekmesineTiklar() {
        lessonManagementPage = new P08_LessonManagementPage();
        lessonManagementPage.lessonsSekmeTiklaEs.click();
    }

    @When("Lessons sayfasindaki Submit butonuna tiklar")
    public void submit_butonuna_tiklar() {
        lessonManagementPage = new P08_LessonManagementPage();
        lessonManagementPage.submit.click();
    }
    
    @Then("Dersin eklenmedigini dogrular")
    public void dersinEklenmediginiDogrular() {
        lessonManagementPage = new P08_LessonManagementPage();

        Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.creditScoreKayitHatasiMesajiEs, 3).isDisplayed());
        //Assert.assertFalse(ReusableMethods.waitForVisibility(lessonManagementPage.kayitBasariliMesaji, 3).isDisplayed());

    }
    
    @Then("Dersin zorunlu alan olduguna dair required mesajini dogrular")
    public void dersinZorunluAlanOldugunaDairRequiredMesajiniDogrular() {
        lessonManagementPage = new P08_LessonManagementPage();
        Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.requiredHatasiMesajiLessonEs, 3).isDisplayed());
        Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.requiredHatasiMesajiCreditScoreEs, 3).isDisplayed());
    }
    
    @Then("Compulsory kutusunun secili oldugunu dogrular")
    public void compulsoryKutusununSeciliOldugunuDogrula() {
        lessonManagementPage = new P08_LessonManagementPage();
        Assert.assertTrue(lessonManagementPage.compulsoryEs.isSelected());
    }
    
    @Then("Compulsory kutusunun secili olmadigini dogrula")
    public void compulsoryKutusununSeciliOlmadiginiDogrula() {
        lessonManagementPage = new P08_LessonManagementPage();
        Assert.assertFalse(lessonManagementPage.compulsoryEs.isSelected());
    }
    
    @Then("Credit Score alaninin zorunlu alan olduguna dair required mesajini dogrular")
    public void creditScoreAlanininZorunluAlanOldugunaDairRequiredMesajiniDogrular() {
        lessonManagementPage = new P08_LessonManagementPage();
        Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.requiredHatasiMesajiCreditScoreEs, 3).isDisplayed());
    }

    @And("Credit Score alanina {string} yazar")
    public void creditScoreAlaninaYazar(String str) {
        lessonManagementPage = new P08_LessonManagementPage();
        int creditScore = faker.number().numberBetween(2, 8);
        if (str.equals("ders kredisini")) {

            lessonManagementPage.creditScoreEs.sendKeys("" + creditScore);
            lessonPojo.setCreditScore(String.valueOf(creditScore));
        } else {
            lessonManagementPage.creditScoreEs.sendKeys(""+str);
            lessonPojo.setCreditScore(str);
        }
    }

    @Then("Lesson Name goruldugu dogrulanir")
    public void lessonNameGorulduguDogrulanir() {
        lessonManagementPage = new P08_LessonManagementPage();
        Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.lessonNameBaslikEs, 3).isDisplayed());
    }

    @Then("{string} goruldugu dogrulanir")
    public void gorulduguDogrulanir(String str) {
        lessonManagementPage = new P08_LessonManagementPage();
        if (str.equalsIgnoreCase("Lesson Name")) {
            Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.lessonNameBaslikEs, 3).isDisplayed());
        } else if (str.equalsIgnoreCase("Compulsory")) {
            Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.compulsoryBaslikEs, 3).isDisplayed());

        } else if (str.equalsIgnoreCase("Credit Score")) {
            Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.creditScoreBaslikEs, 3).isDisplayed());
        } else {
            System.out.println("Hatalı Görünüm");
        }
    }

    @And("En son sayfaya gitme sekmesine tiklar")
    public void enSonSayfayaGitmeSekmesineTiklar() {
        lessonManagementPage = new P08_LessonManagementPage();
        ReusableMethods.clickElementByJS(lessonManagementPage.ensonSayfayaGitButonEs);
    }

    @And("En son olusturulan dersi siler")
    public void enSonOlusturulanDersiSiler() {
        lessonManagementPage = new P08_LessonManagementPage();
        ReusableMethods.waitFor(1);
        int trSize = lessonManagementPage.lessonSekmesiTRListEs.size()-1;
        ReusableMethods.clickElementByJS(lessonManagementPage.deleteLessonButtonEs.get(trSize));
    }

    @Then("Olusturulan dersin silindigi dogrulanir")
    public void olusturulanDersinSilindigiDogrulanir() {
        lessonManagementPage = new P08_LessonManagementPage();
        Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.dersSilindiMesajiEs, 3).isDisplayed());
    }

    @Then("Edit butonunun goruldugu dogrulanir")
    public void editButonununGorulduguDogrulanir() {
        lessonManagementPage = new P08_LessonManagementPage();
        Assert.assertTrue(lessonManagementPage.editLessonButtonEs.isDisplayed());

    }
    
   












  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    //Esra Birinci - 220.Satır
//ABAT - 221.Satır

    
    @When("Lesson Program sechilir")
    public void lessonProgramsechilir(){
        lessonManagementPage=new P08_LessonManagementPage();
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollIntoViewJS(lessonManagementPage.lessonProgramAb);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickElementByJS(lessonManagementPage.lessonProgramAb);
    }
//TC02
    @When("Education Term box term secilir")
    public void Education_Term_box_term_secilir(){
        lessonManagementPage = new P08_LessonManagementPage();
        ReusableMethods.waitFor(1);
        lessonManagementPage.termsechAb.sendKeys(ConfigReader.getProperty("termclick"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
        ReusableMethods.waitFor(1);
    }

    @When("Choose Lessons dropdownundan create edilen ders secilir")
    public void Choose_Lessons_dropdownundan_create_edilen_ders_secilir(){
        lessonManagementPage = new P08_LessonManagementPage();
        //lessonManagementPage.chooseLesson.click();
        ReusableMethods.waitFor(2);
        lessonManagementPage.lessonsechAb.sendKeys(ConfigReader.getProperty("lessonsech"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
        ReusableMethods.waitFor(1);
    }
    /* @When("Choose Lessons dropdownundan create edilen ders secilmelidir")
    public void Choose_Lessons_dropdownundan_create_edilen_ders_secilmelidir(){
        lessonManagementPage=new P08_LessonManagementPage();
        lessonManagementPage.lessonsech.sendKeys("Calculus");*/

    @When("Start Time menusu time degeri  girilir")
    public void Start_Time_menusu_time_degeri_girilir(){
        lessonManagementPage = new P08_LessonManagementPage();
        ReusableMethods.waitFor(1);
        lessonManagementPage.startTimeAb.sendKeys("08:00");
    }

    @When("Stop Time menusu time degeri girilir")
    public void Stop_Time_menusu_time_degeri_girilir(){
        lessonManagementPage = new P08_LessonManagementPage();
        lessonManagementPage.stopTimeAb.sendKeys("10:45");
    }

   @When("Choose Lessons dropdownundan create edilen ders secilmelidir")
   public void lessonsvg(){
        lessonManagementPage=new P08_LessonManagementPage();
        lessonManagementPage.lessonsechAb.sendKeys("Calculus");
   }

//TC03-04-US10
  @When("Choose Lessons dropdownundan create edilen 2tane ders secilir")
  public void Choose_Lessons_dropdownundan_create_edilen_2tane_ders_secilir(){
        lessonManagementPage=new P08_LessonManagementPage();
        ReusableMethods.waitFor(1);
      lessonManagementPage.lessonsechAb.sendKeys(ConfigReader.getProperty("lessonsech"), "lesson2");
      Actions actions = new Actions(Driver.getDriver());
      actions.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
      ReusableMethods.waitFor(1);
      lessonManagementPage.lessonsech2Ab.sendKeys(ConfigReader.getProperty("lessonsech"), "lesson2");
      Actions actionss = new Actions(Driver.getDriver());
      actionss.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
      ReusableMethods.waitFor(1);
    }
    
    @And("Choose Day menusunden day box girilir")
    public  void Choose_Day_menusunden_day_box_girilir(){
        lessonManagementPage =new P08_LessonManagementPage();
        ReusableMethods.waitFor(1);
        lessonManagementPage.dayclickAb.sendKeys(ConfigReader.getProperty("day"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        ReusableMethods.waitFor(1);
    }
     @When("Created Lesson Program gerceklestigini dogrular")
    public void Created_Lesson_Program_gerceklestigini_dogrular(){
         lessonManagementPage =new P08_LessonManagementPage();
         ReusableMethods.waitFor(1);
         Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.lessoncreated,2).isDisplayed());
     }














     //ABAT - 320.Satır
// Sevda ISIK -321



    @Then("{string} ders adini girer")
    public void ders_adini_girer(String str) {
        lessonManagementPage =new P08_LessonManagementPage();
        if (str.equals("Ders adi")){
            String name = "";
            lessonManagementPage.lessonNamaesvd.sendKeys(faker.name().firstName());

        }else{
            lessonManagementPage.lessonNamaesvd.sendKeys(str);

        }
    }
    @Then("Compulsory secenegini secer")
    public void compulsory_secenegini_secer() {
        lessonManagementPage =new P08_LessonManagementPage();
        lessonManagementPage.compulsorysvd.click();
        Boolean compulsory = false;

    }
    @Then("{string} kredi puanini girer")
    public void kredi_puanini_girer(String string) {
        lessonManagementPage =new P08_LessonManagementPage();
        lessonManagementPage.creditScoresvd.sendKeys(string);
    }
    @And("Submit buto na tiklar")
    public void submitButoNaTiklar() {
        lessonManagementPage =new P08_LessonManagementPage();
        lessonManagementPage.submit1svd.click();
    }
    @Then("Lesson Created {string} mesaji goruntulenir")
    public void lessonCreatedMesajiGoruntulenir(String string) {
        lessonManagementPage = new P08_LessonManagementPage();
        Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.kayitBasariliMesajiEs,3).isDisplayed());
    }



//TC002 STEPS
    public String day = "";
    public int startTime = 0;
    public int stopTime = 0;
    public String lessonProgram = day + " " + startTime + " " + stopTime;
    @And("Lessons Program butonuna tiklar")
    public void lessonsProgramButonunaTiklar() {
        lessonManagementPage = new P08_LessonManagementPage();
        lessonManagementPage.lessonPrgsvd.click();
    }
    @And("{string} headerinin gorunurlugu dogrular")
    public void headerininGorunurluguDogrular(String str) {
        lessonManagementPage = new P08_LessonManagementPage();

        if (str.equalsIgnoreCase("Add Lesson Program")){
            Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.addLessonProgramBasliksvd, 3).isDisplayed());
        } else if (str.equalsIgnoreCase("Add Lesson")) {
            Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.addLessonBasliksvd, 3).isDisplayed());
        } else if (str.equalsIgnoreCase("Lesson Program Assigment")) {
            Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.lessonProgramAssignmentBasliksvd, 3).isDisplayed());
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }
    }
    
    @And("Choose Lessons dropdownundan ders secilir")
    public void chooseLessonsDropdownundanDersSecilir() {
        lessonManagementPage=new P08_LessonManagementPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
        ReusableMethods.waitFor(1);

    }
    
    @Then("Choose Day menusunden day secilir")
    public void choose_day_menusunden_day_secilir() {
        lessonManagementPage=new P08_LessonManagementPage();
        String day ="";
        Select select = new Select(lessonManagementPage.chooseDayMenusvd);
        select.selectByIndex(faker.number().numberBetween(1, 5));

    }
    
    @Then("Education Term menusunden Term secilir")
    public void education_term_menusunden_term_secilir() {
        lessonManagementPage=new P08_LessonManagementPage();
        Integer educationTermId=5;
        Select select = new Select(lessonManagementPage.chooseEducationTermMenusvd);
        select.selectByIndex(faker.number().numberBetween(1, 4));

    }
    
    @And("Start Time menusunden {string} belirtilir")
    public void startTimeMenusundenBelirtilir(String str) {
        lessonManagementPage=new P08_LessonManagementPage();
        if (str.equalsIgnoreCase("time degeri")){
            lessonManagementPage.startTimeBoxsvd.sendKeys("" + faker.number().numberBetween(1000, 1800));
        } else {
            lessonManagementPage.startTimeBoxsvd.sendKeys(str);
        }
    }
    
    @And("Stop Time menusunden {string} belirtilir")
    public void stopTimeMenusundenBelirtilir(String str) {
        lessonManagementPage=new P08_LessonManagementPage();
        if (str.equalsIgnoreCase("time degeri")){
            lessonManagementPage.stopTimeBoxsvd.sendKeys("" + faker.number().numberBetween(1000, 1800));
        } else {
            lessonManagementPage.stopTimeBoxsvd.sendKeys(str);

        }
    }
    @Then("{string} pup up mesaji goruntulenir")
    public void pupUpMesajiGoruntulenir(String str) {
        lessonManagementPage=new P08_LessonManagementPage();
        if (str.equalsIgnoreCase("Created Lesson Program")){
            Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.createdLessonProgramMesajisvd, 3).isDisplayed());
        } else if (str.equalsIgnoreCase("Choose Lesson Hatasi")) {
            Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.chooseLessonHatasiMesajisvd, 3).isDisplayed());
        } else if (str.equalsIgnoreCase("Please select education term")) {
            Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.educationTermHatasiMesajisvd, 3).isDisplayed());
        } else if (str.equalsIgnoreCase("Required")) {
            Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.requiredHatasiMesajisvd, 3).isDisplayed());
        } else if (str.equalsIgnoreCase("Lesson Added to Teacher")) {
            Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.lessonAddedToTeacherMesajisvd, 3).isDisplayed());
        }else if (str.equalsIgnoreCase("Lesson Added to Teacher Hata")) {
            Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.lessonAddedToTeacherHataMesajisvd, 3).isDisplayed());
        }else if (str.equalsIgnoreCase("Ayni gun ve saat hata")) {
            Assert.assertTrue(ReusableMethods.waitForVisibility(lessonManagementPage.sameHourAndDayHataMesajisvd, 3).isDisplayed());
        }else {
            System.out.println("Hatalı veri girdiniz.");
        }
    }

    @Then("{string} pup up mesaji goruntulenmedigi dogrulanir")
    public void pupUpMesajiGoruntulenmedigiDogrulanir(String str) {
        lessonManagementPage=new P08_LessonManagementPage();
        if (str.equalsIgnoreCase("Created Lesson Program")){
            Assert.assertFalse(ReusableMethods.waitForVisibility(lessonManagementPage.createdLessonProgramMesajisvd, 3).isDisplayed());
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }
    }
    @And("Choose Teacher menusunden space karakter secilir")
    public void chooseTeacherMenusundenSpaceKarakterSecilir() {
        lessonManagementPage=new P08_LessonManagementPage();
        Select select = new Select(lessonManagementPage.chooseTeacherMenusvd);
        select.selectByVisibleText("");
        ReusableMethods.waitFor(3);
    }

    @And("Lesson Program Assignment tablosundan {string} ders secilir")
    public void lessonProgramAssignmentTablosundanDersSecilir(String str) {
        lessonManagementPage=new P08_LessonManagementPage();
        if (str.equalsIgnoreCase("bir")){
            ReusableMethods.clickElementByJS(lessonManagementPage.chooseLessonControlBoxsvd.get(lessonManagementPage.chooseLessonControlBoxsvd.size()-faker.number().numberBetween(1, 100)));
        } else if (str.equalsIgnoreCase("iki")) {
            lessonManagementPage.chooseLessonControlBoxsvd.get(lessonManagementPage.chooseLessonControlBoxsvd.size()-faker.number().numberBetween(1, 5)).click();
            lessonManagementPage.chooseLessonControlBoxsvd.get(lessonManagementPage.chooseLessonControlBoxsvd.size()-faker.number().numberBetween(1, 5)).click();
        } else if (str.equalsIgnoreCase("ayni gun ve saatteki iki")) {
            List<WebElement> satirlar = lessonManagementPage.lessonProgramAssignmentTablesvd.findElements(By.cssSelector("tbody tr"));
            for (WebElement w : satirlar) {
                List<WebElement> sutun = w.findElements(By.tagName("td"));
                WebElement day = sutun.get(2);
                WebElement startTime = sutun.get(3);
                String textDay = day.getText();
                String textStartTime = startTime.getText();
                if (textDay.equals("MONDAY")&&(textStartTime.equals("10:01"))) {
                    WebElement chooseLessonBox = sutun.get(0).findElement(By.tagName("input"));
                    ReusableMethods.clickElementByJS(chooseLessonBox);
                }
            }
        }else {
            System.out.println("Hatalı veri girdiniz.");
        }
    }

    @And("Choose Teacher bolumundeki Submit butonuna tiklanir")
    public void chhoseTeacherBolumundekiSubmitButonunaTiklanir() {
        lessonManagementPage=new P08_LessonManagementPage();
        lessonManagementPage.submitsvd.click();
    }

    @And("Choose Teacher menusunden bir teacher secer")
    public void chooseTeacherMenusundenBirTeacherSecer() {
        lessonManagementPage=new P08_LessonManagementPage();
        Select select = new Select(lessonManagementPage.chooseTeacherMenusvd);
        select.selectByValue(""+faker.number().numberBetween(2, 20));
        ReusableMethods.waitFor(5);
    }



}






