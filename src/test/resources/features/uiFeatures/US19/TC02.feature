@HuseyinReport
@huseyin1902
Feature: Teacher meet olusturabilmeli
  Scenario: TC02_Choose_Students_bolumunde_ayni_ogrenci_2_defa_secilememeli
    Given Kullanici login e tiklar
    When User Name kutusuna "Huseyin01" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management butonuna tiklar
    And Choose Student kutusuna tiklar
    And Acilan listede ilk secenege tiklar
    And Choose Student kutusuna tiklar
    And Acilan listede ilk secenege tiklar
    Then Ayni ogrencinin iki defa secilemedigini dogrular