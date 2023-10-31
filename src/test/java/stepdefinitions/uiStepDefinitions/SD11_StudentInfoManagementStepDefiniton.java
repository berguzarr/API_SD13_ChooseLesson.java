package stepdefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import pages.P11_StudentInfoManagementPage;
import utilities.ReusableMethods;

public class SD11_StudentInfoManagementStepDefiniton {









//Mustafa Bacanak - 20.Satır


P11_StudentInfoManagementPage studentInfoM = new P11_StudentInfoManagementPage();
    ReusableMethods reusableMethods;

    @Given("Teacher {string} ve {string} ile login olunur.")
    public void teacherCredentialsWithUsernameAndPassword(String string, String string2) {

      reusableMethods = new ReusableMethods();
      reusableMethods.login(string,string2);
    }

    @Given("Student Info Management sayfasinin acildigi dogrulanir.")
    public void student_info_management_page_is_opened() {

        ReusableMethods.verifyElementDisplayed(studentInfoM.txt_StudentInfoManagementHeader_M);
        ReusableMethods.checkTextEquals(studentInfoM.txt_StudentInfoManagementHeader_M,"Student Info Management");
    }

    @Then("Add Student Info Header'inin gorunurlugu dogrulanir.")
    public void add_student_info_header_is_visible() {
        
        ReusableMethods.verifyElementDisplayed(studentInfoM.txt_AddStudentInfoHeader_M);
        ReusableMethods.checkTextEquals(studentInfoM.txt_AddStudentInfoHeader_M,"Add Student Info");
    }

    @When("Lesson secimi {string} yapilir.")
    public void lesson_is_set_as(String string) {

        ReusableMethods.selectWithVisibleOnDD(studentInfoM.dd_ChooseLesson_M,string);
    }

    @Then("Lesson seciminin {string} oldugu dogrulanir.")
    public void lesson_is_verified_as(String string) {
        System.out.println("Gürkay Birinci buradan geçti... :)))");
        System.out.println(" Biz ne Gürkay Birinci'ler gördük hey gidi heeeyyy :D Ama Esra Birinci gelmese de olur :D ");
        ReusableMethods.checkTextContains(studentInfoM.dd_ChooseLesson_M,string);
    }

    @Then("Student secimi {string} yapilir.")
    public void student_is_set_as(String string) {

        ReusableMethods.selectWithVisibleOnDD(studentInfoM.dd_ChooseStuent_M,string);
    }

    @Then("Student seciminin {string} oldugu dogrulanir.")
    public void student_is_verified_as(String string) {

        ReusableMethods.checkTextContains(studentInfoM.dd_ChooseStuent_M,string);
    }

    @Then("Education Term secimi {string} yapilir.")
    public void education_term_is_set_as(String string) {

        ReusableMethods.selectWithVisibleOnDD(studentInfoM.dd_ChooseEducationTerm_M,string);
    }

    @Then("Education Term seciminin {string} oldugu dogrulanir.")
    public void education_term_is_verified_as(String string) {

        ReusableMethods.checkTextContains(studentInfoM.dd_ChooseEducationTerm_M,string);
    }

    @Then("Absentee bilgisi {string} olarak girilir.")
    public void absentee_information_is_entered_as(String string) {

        ReusableMethods.sendKeysText(studentInfoM.input_Absentee_M,string);
    }

    @Then("Midterm exam bilgisi {string} olarak girilir.")
    public void midterm_exam_information_is_entered_as(String string) {

        ReusableMethods.sendKeysText(studentInfoM.input_MidtermExam_M,string);
    }

    @Then("Final exam bilgisi {string} olarak girilir.")
    public void final_exam_information_is_entered_as(String string) {

        ReusableMethods.sendKeysText(studentInfoM.input_FinalExam_M,string);
    }

    @Then("info not bilgisi {string} olarak doldurulur.")
    public void info_not_information_is_filled_as(String string) {

        ReusableMethods.sendKeysText(studentInfoM.input_InfoNote,string);
    }

    @Then("Submit butonuna tiklanir.")
    public void submit_button_is_clicked() {
        
        ReusableMethods.clickElement(studentInfoM.btn_Submit_M);
        ReusableMethods.waitFor(1);
    }

    @Then("{string} popup'i dogrulanir.")
    public void popup_is_success_verified(String string) {

        ReusableMethods.checkTextEquals(studentInfoM.popup_Info_M,string);
    }

    @Then("{string} uyarisi goruntulendigi dogrulanir.")
    public void warning_is_displayed(String string) {

        ReusableMethods.checkTextEquals(studentInfoM.txt_Required_M,string);
    }

    @And("Delete butonuna tiklanir.")
    public void delete_button_is_clicked() {
        
        ReusableMethods.clickElementWithJs(studentInfoM.btn_DeleteFirstOption_M);
        ReusableMethods.waitFor(2);

    }

    @And("Bulundugun sayfa yenilenir.")
    public void refresh_this_page() {

        ReusableMethods.refreshThisPage();
    }

    @And("Ogrenci kaydi varsa silinir.")
    public void ogrenci_kaydi_varsa_silinir() {
        
        ReusableMethods.ifDisplayClickElement(studentInfoM.btn_DeleteFirstOption_M);
    }

    @And("Student Info List Header'inin gorunurlugu dogrulanir.")
    public void studentInfoListHeaderIninGorunurluguDogrulanir() {
        
        ReusableMethods.verifyElementDisplayed(studentInfoM.txt_StudentInfoManagementHeader_M);
        ReusableMethods.checkTextEquals(studentInfoM.txt_StudentInfoListHeader_M,"Student Info List");
    }

    @And("Name Surname basligi gorunurlugu ve input degerinin {string} oldugu kontrol edilir.")
    public void nameSurnamebasligiGorunurluguKontrolEdilir(String string) {

        ReusableMethods.verifyElementDisplayed(studentInfoM.header_NameSurname_M);
        ReusableMethods.checkTextEquals(studentInfoM.txt_NameSurname_M,string);
    }

    @And("Lesson Name basligi gorunurlugu ve input degerinin {string} oldugu kontrol edilir.")
    public void lessonNamebasligiGorunurluguKontrolEdilir(String string) {

        ReusableMethods.verifyElementDisplayed(studentInfoM.header_LessonName_M);
        ReusableMethods.checkTextEquals(studentInfoM.txt_LessonName_M,string);
    }

    @And("Absentee basligi gorunurlugu ve input degerinin {string} oldugu kontrol edilir.")
    public void absenteebasligiGorunurluguKontrolEdilir(String string) {
        
        ReusableMethods.verifyElementDisplayed(studentInfoM.header_Absentee_M);
        ReusableMethods.checkTextEquals(studentInfoM.txt_Absentee_M,string);
    }

    @And("Midterm Exam basligi gorunurlugu ve input degerinin {string} oldugu kontrol edilir.")
    public void midtermExambasligiGorunurluguKontrolEdilir(String string) {
        
        ReusableMethods.verifyElementDisplayed(studentInfoM.header_MidtermExam_M);
        ReusableMethods.checkTextEquals(studentInfoM.txt_MidtermExam_M,string);
    }

    @And("Final Exam basligi gorunurlugu ve input degerinin {string} oldugu kontrol edilir.")
    public void finalExambasligiGorunurluguKontrolEdilir(String string) {

        ReusableMethods.verifyElementDisplayed(studentInfoM.header_FinalExam_M);
        ReusableMethods.checkTextEquals(studentInfoM.txt_FinalExam_M,string);
    }

    @And("Note basligi gorunurlugu kontrol edilir.")
    public void notebasligiGorunurluguKontrolEdilir() {
        
        ReusableMethods.verifyElementDisplayed(studentInfoM.header_Note_M);
    }

    @And("info Note basligi gorunurlugu ve input degerinin {string} oldugu kontrol edilir.")
    public void infoNotebasligiGorunurluguKontrolEdilir(String string) {

        ReusableMethods.verifyElementDisplayed(studentInfoM.header_InfoNote_M);
        ReusableMethods.checkTextEquals(studentInfoM.txt_InfoNote_M,string);
    }

    @And("Average basligi gorunurlugu kontrol edilir.")
    public void avaragebasligiGorunurluguKontrolEdilir() {
        
        ReusableMethods.verifyElementDisplayed(studentInfoM.header_Average_M);
    }

    @And("Student info List alaninda edit butonuna tiklanir.")
    public void studentInfoListAlanindaEditButonunaTiklanir() {

        ReusableMethods.waitFor(1);
        ReusableMethods.clickElementWithJs(studentInfoM.btn_EditFirstOption_M);
    }

    @And("Edit Student Info Header'inin gorunurlugu dogrulanir.")
    public void editStudentInfoHeaderIninGorunurluguDogrulanir() {

        ReusableMethods.verifyElementDisplayed(studentInfoM.txt_EditStudentInfoHeader_M);
        ReusableMethods.checkTextEquals(studentInfoM.txt_EditStudentInfoHeader_M,"Edit Student Info");
    }

    @When("Edit Student info Lesson {string} secimi yapilir.")
    public void editStudentInfoLessonSecimiYapilir(String string) {
        
        ReusableMethods.selectWithVisibleOnDD(studentInfoM.input_EditStudentInfoLesson_M,string);
    }

    @When("Edit Student info Education Term {string} secimi yapilir.")
    public void editStudentInfoEducationTermSecimiYapilir(String string) {

        ReusableMethods.selectWithVisibleOnDD(studentInfoM.input_EditStudentInfoEducationTerm_M,string);
    }

    @And("Edit Student info Midterm Exam inputu {string} olarak guncellenir.")
    public void editStudentInfoMidtermExamInputuOlarakGuncellenir(String string) {
        
        ReusableMethods.sendKeysText(studentInfoM.input_EditStudentInfoMidtermExam_M,string);
    }

    @And("Edit Student info Final Exam inputu {string} olarak guncellenir.")
    public void editStudentInfoFinalExamInputuOlarakGuncellenir(String string) {

        ReusableMethods.sendKeysText(studentInfoM.input_EditStudentInfoFinalExam_M,string);
    }


    @And("Edit Student info Info Note inputu {string} olarak guncellenir.")
    public void editStudentInfoInfoNoteInputuOlarakGuncellenir(String string) {

        ReusableMethods.sendKeysText(studentInfoM.input_EditStudentInfoInfoNote_M,string);
    }

    @When("Edit Student info submit butonuna tiklanir.")
    public void editStudentInfoSubmitButonunaTiklanir() {

        ReusableMethods.clickElementWithJs(studentInfoM.btn_EditStudentInfoSubmit_M);
    }

    @And("Edit Student info sayfasi kapatilir.")
    public void editStudentInfoPopupIKapatilir() {

        ReusableMethods.clickElementWithJs(studentInfoM.btn_EditStudentInfoClose_M);
    }

    @Then("Delete butonunun aktif oldugu dogrulanir.")
    public void deleteButonununAktifOlduguDogrulanir() {
        
        ReusableMethods.verifyElementDisplayed(studentInfoM.btn_DeleteFirstOption_M);
    }

    @And("{string} sn kadar beklenir.")
    public void snKadarBeklenir(String time) {
        int newTime = Integer.parseInt(time);
        ReusableMethods.waitFor(newTime);
    }

}
