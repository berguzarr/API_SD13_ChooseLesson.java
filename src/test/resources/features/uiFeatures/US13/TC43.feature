@Gurkay1343
Feature: Vice Dean Ogretmen olusturabilmeli
  Scenario:TC43_Date_Of_Birth_bolumu_bos_birakilamamalidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Submit butonuna tiklar
    Then "Date Of Birth" bolumunun zorunlu alan oldugu mesajinin gorundugunu dogrular
