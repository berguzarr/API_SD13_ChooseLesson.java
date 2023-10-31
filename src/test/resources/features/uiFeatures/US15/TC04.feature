@meryem
Feature:  Vice Dean ogrenci olusturabilmeli
  Scenario: TC04_"Surname"_alanini_bos_biraktiginda
    Given Kullanici login e tiklar
    When Username kutusuna "meryem25" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    And Ogernci icin Choose Advisor Teacher secer
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "bir isim" girer
    But Surname alanini bos birakir
    Then "Surname" bolumunun zorunlu alan oldugu mesajinin gorundugunu dogrular