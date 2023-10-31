@Gurkay1307
Feature: Admin Ogretmen olusturabilmeli
  Scenario:TC07_Choose_Lesson_menusundeki_dersler_essiz_olmalidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayadm" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Choose Lesson menusune tiklar
    Then Ayni isimde birden fazla ders olmadigini dogrular
