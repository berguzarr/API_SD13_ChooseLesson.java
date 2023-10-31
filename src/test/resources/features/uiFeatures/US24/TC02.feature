@Gurkay2
Feature: Admin Ogretmen olusturabilmeli
  Scenario:TC02_Choose_Lesson_menusundan_birden_fazla_ders_secilebilmelidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayadm" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Choose Lesson menusune tiklar
    And Choose Lesson menusunden bir ders secer
    And Choose Lesson menusune tiklar
    And Choose Lesson menusunden bir ders secer
    Then Secilen derslerin menude gorundugunu dogrular
