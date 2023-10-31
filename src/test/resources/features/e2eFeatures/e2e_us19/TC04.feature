Feature: Teacher meet olusturabilmeli
  Scenario: TC09_Ayni_gun_ve_saatte_farkli_toplantilar_olusturamamaliyim
    Given Kullanici login e tiklar
    When User Name kutusuna "Huseyin01" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management butonuna tiklar
    And Choose Student kutusuna tiklar
    And Acilan listede ilk secenege tiklar
    And Date Of Meet bolumune tarih girer
    And Start Time bolumune saat girer
    And Stop Time bolumune saat girer
    And Description bolumune deger girer
    And Submit butonuna tiklar

  Scenario: TC09_Ayni_gun_ve_saatte_farkli_toplantilar_olusturamamaliyim_Api
    Given User sets the url Hus
    When User sets the expected data Hus
    And User sends post request and gets the response Hus
    Then User does assertioniki Hus