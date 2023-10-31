@Gurkay1349
Feature: Admin Ogretmen olusturabilmeli
  Scenario:TC49_User_Name_kutusu_bos_birakilamamalidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayadm" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Submit butonuna tiklar
    Then "User Name" bolumunun zorunlu alan oldugu mesajinin gorundugunu dogrular
