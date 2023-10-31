@Gurkay1
Feature: Admin Ogretmen olusturabilmeli
  Scenario:TC01_Choose_Lesson_menusundan_bir_ders_secilebilmelidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayadm" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Choose Lesson menusune tiklar
    And Choose Lesson menusunden bir ders secer
    Then Secilen dersin menude gorundugunu dogrular
