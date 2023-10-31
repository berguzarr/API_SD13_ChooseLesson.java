@HuseyinReport2
@huseyin2004
Feature: Teacher, toplantıları görebilmeli, güncelleyebilmeli ve silebilmelidir.
  Scenario: TC04_Teacher_toplantilari_guncelleyebilmeli
    Given Kullanici login e tiklar
    When User Name kutusuna "Huseyin01" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management butonuna tiklar
    And Meet List bolumundeki Edit butonuna tiklar
    And Choose Studentiki kutusuna "Huseyin Bulat" yazar
    And Start time bolumune ayni tarihteki toplantinin henuz bitmedigi bir saat girer
    And Submitiki butonuna tiklar
    Then Ayni tarihte onceki toplantinin surdugu saat araliginda baska bir toplanti guncellenemeyecegi yonunde hata mesaji aldigini dogrular