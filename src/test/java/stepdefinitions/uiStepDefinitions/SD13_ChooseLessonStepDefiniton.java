package stepdefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.P13_ChooseLessonManagementPage;
import utilities.ReusableMethods;



public class SD13_ChooseLessonStepDefiniton {


    P13_ChooseLessonManagementPage chooseLessonManagementPage;






    //ABAT - 20.Satır

    @Then("Lesson Program List alaninda olushturulan Day, Start Time, Stop Time görülmeli")
    public void Lesson_Program_List_alaninda_olushturulan_Day_StartTime_StopTime_gorulmeli(){
        chooseLessonManagementPage=new P13_ChooseLessonManagementPage();
        Assert.assertTrue(chooseLessonManagementPage.list.isDisplayed());
    }
    @Then("List halinde görüntülenmeli")
    public void List_halinde_goruntulenmeli() {
        chooseLessonManagementPage=new P13_ChooseLessonManagementPage();
    }
    //Bug fakat sonraki stepte düzenlenmesi gerek delete and update button yok
    @Then("Edit butonuna tiklanmali")
    public void edit_butonuna_tiklanmali() {
        chooseLessonManagementPage.noEditBtn.click();
    }

    @Then("Olusturdugu dersin duzenlenebildigini dogrular")
    public void olusturdugu_dersin_duzenlenebildigini_dogrular() {
        Assert.assertTrue(chooseLessonManagementPage.noEditBtn.isDisplayed());
    }
    @Then("Delete butonuna tiklanmali")
    public void delete_butonuna_tiklanmali() {
        chooseLessonManagementPage.noDeleteBtn.click();
    }

















































    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //ABAT - 120.Satır
//Mehmet -121.Satır
    @Then("Teacher,Day,StartTime,StopTime basliginin gorundugunu dogrular")
    public void teacher_day_start_time_stop_time_basliginin_gorundugunu_dogrular() {
        chooseLessonManagementPage=new P13_ChooseLessonManagementPage();
        Assert.assertTrue(chooseLessonManagementPage.teacherBasligi.isDisplayed());
        Assert.assertTrue(chooseLessonManagementPage.dayBasligi.isDisplayed());
        Assert.assertTrue(chooseLessonManagementPage.startBasligi.isDisplayed());
        Assert.assertTrue(chooseLessonManagementPage.stopBasligi.isDisplayed());
    }

    @And("Student son siradaki dersi secer")
    public void studentIlkSiradakiDersiSecer() {
        chooseLessonManagementPage=new P13_ChooseLessonManagementPage();
        ReusableMethods.clickElementByJS(chooseLessonManagementPage.sonDersCheckBox);
    }

    @And("Student Choose Lesson submite tiklar")
    public void studentChooseLessonSubmiteTiklar() {
        chooseLessonManagementPage=new P13_ChooseLessonManagementPage();
        ReusableMethods.clickElementByJS(chooseLessonManagementPage.chooseLessonSubmit);
    }

    @Then("Student ders ekledigini dogrular")
    public void studentDersEklediginiDogrular() {
        chooseLessonManagementPage=new P13_ChooseLessonManagementPage();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(chooseLessonManagementPage.addedLessonUyariMesaji.isDisplayed());
    }

    @And("Student ayni gun ve saatte iki ders secer")
    public void studentAyniGunVeSaatteIkiDersSecer() {
        chooseLessonManagementPage=new P13_ChooseLessonManagementPage();
        ReusableMethods.clickElementByJS(chooseLessonManagementPage.ayniDers1);
        ReusableMethods.clickElementByJS(chooseLessonManagementPage.ayniDers2);
    }

    @And("Student ders eklendi yazisini gormedigini dogrular")
    public void studentDersEklendiYazisiniGormediginiDogrular() {
        chooseLessonManagementPage=new P13_ChooseLessonManagementPage();
        ReusableMethods.waitFor(2);
        Assert.assertFalse(chooseLessonManagementPage.addedLessonUyariMesaji.isDisplayed());
    }

    @And("Student Menu butonuna tiklar")
    public void studentMenuButonunaTiklar() {
        chooseLessonManagementPage=new P13_ChooseLessonManagementPage();
        chooseLessonManagementPage.studentMenuButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("Student Grades and Announcemente tiklar")
    public void studentGradesAndAnnouncementeTiklar() {
        chooseLessonManagementPage=new P13_ChooseLessonManagementPage();
        chooseLessonManagementPage.gradesAndAnnouncements.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Student not ve toplanti gordugunu dogrular")
    public void studentNotVeToplantiGordugunuDogrular() {
        chooseLessonManagementPage=new P13_ChooseLessonManagementPage();
        Assert.assertTrue(chooseLessonManagementPage.studentNote.isDisplayed());
        Assert.assertTrue(chooseLessonManagementPage.toplanti.isDisplayed());
    }
}

