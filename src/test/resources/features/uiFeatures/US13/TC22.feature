@Gurkay1322
Feature: Vice Dean Ogretmen olusturabilmeli
  Scenario:TC22_Birth_Place_kutusu_bos_birakilamamalidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Submit butonuna tiklar
    Then "Birth Place" bolumunun zorunlu alan oldugu mesajinin gorundugunu dogrular
