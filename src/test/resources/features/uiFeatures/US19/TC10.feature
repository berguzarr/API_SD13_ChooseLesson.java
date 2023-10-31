@HuseyinReport
@huseyin1910
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
    Then Ayni tarihte onceki toplantinin surdugu saat araliginda baska bir toplanti olusturulamayacagi yonunde hata mesaji aldigini dogrular