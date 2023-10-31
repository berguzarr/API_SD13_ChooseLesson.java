@HuseyinReport
@huseyin1905
Feature: Teacher meet olusturabilmeli
  Scenario: TC05_Start_Time_ve_Stop_Time_baslangic_ve_bitis_saatleri_girilmeli
    Given Kullanici login e tiklar
    When User Name kutusuna "Huseyin01" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management butonuna tiklar
    And Start Time bolumune saat girer
    And Start Time bolumune saat girilebildigini dogrular
    And Stop Time bolumune saat girer
    And Stop Time bolumune saat girilebildigini dogrular
