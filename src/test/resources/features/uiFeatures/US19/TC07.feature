@HuseyinReport
@huseyin1907
Feature: Teacher meet olusturabilmeli
  Scenario: TC07_Description_bolumune_deger_girilebilmelidir
    Given Kullanici login e tiklar
    When User Name kutusuna "Huseyin01" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management butonuna tiklar
    And Description bolumune deger girer
    Then Description bolumune deger girilebildigini dogrular
