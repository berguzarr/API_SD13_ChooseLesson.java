Feature: Teacher meet olusturabilmeli
  Scenario: TC10_Ayni_tarihte_onceki_toplantinin_olusturuldugu_saat_dilimi_icerisinde_henuz_eski_toplanti_bitmeden_farkli_bir_toplanti_olusturulamamalidir
    Given Kullanici login e tiklar
    When User Name kutusuna "Huseyin01" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management butonuna tiklar
    And Choose Student kutusuna tiklar
    And Acilan listede ilk secenege tiklar
    And Date Of Meet bolumune tarih girer
    And Start Time bolumune yeni saat girer
    And Stop Time bolumune  yeni saat girer
    And Description bolumune deger girer
    And Submit butonuna tiklar

  Scenario: TC10_Ayni_tarihte_onceki_toplantinin_olusturuldugu_saat_dilimi_icerisinde_henuz_eski_toplanti_bitmeden_farkli_bir_toplanti_olusturulamamalidir_Api
    Given User sets the url Hus
    When User sets the expected data Hus
    And User sends post request and gets the response Hus
    Then User does assertioniki Hus