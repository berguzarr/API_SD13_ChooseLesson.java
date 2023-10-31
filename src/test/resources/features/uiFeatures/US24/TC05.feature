@Gurkay1305
Feature: Admin Ogretmen olusturabilmeli
  Scenario:TC05_Choose_Lesson_menusu_bos_birakilamamalidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayadm" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Submit butonuna tiklar
    Then "Choose Lesson" bolumunun zorunlu alan oldugu mesajinin gorundugunu dogrular
