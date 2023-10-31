@Gurkay1322
Feature: Admin Ogretmen olusturabilmeli
  Scenario:TC22_Birth_Place_kutusu_bos_birakilamamalidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayadm" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Submit butonuna tiklar
    Then "Birth Place" bolumunun zorunlu alan oldugu mesajinin gorundugunu dogrular
