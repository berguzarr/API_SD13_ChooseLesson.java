@Gurkay1308
Feature: Admin Ogretmen olusturabilmeli
  Scenario:TC08_Name_kutusu_bos_birakilamamalidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayadm" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Submit butonuna tiklar
    Then "Name" bolumunun zorunlu alan oldugu mesajinin gorundugunu dogrular
