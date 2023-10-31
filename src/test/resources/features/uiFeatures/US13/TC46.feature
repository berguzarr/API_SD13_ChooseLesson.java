@Gurkay1346
Feature: Vice Dean Ogretmen olusturabilmeli
  Scenario:TC46_Ssn_kutusu_bos_birakilamamalidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Submit butonuna tiklar
    Then "Ssn" bolumunun zorunlu alan oldugu mesajinin gorundugunu dogrular
