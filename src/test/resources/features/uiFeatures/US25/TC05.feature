@meryem2
Feature: Admin ogrenci olusturabilmelidir
  Scenario: TC05_"Birth_Place_alani_bos_birakildiginda
    Given Kullanici login e tiklar
    When Username kutusuna "meryem24" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    And Ogernci icin Choose Advisor Teacher secer
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    But Birth Place alanini bos birakir
    Then "Birth Place" bolumunun zorunlu alan oldugu mesajinin gorundugunu dogrular