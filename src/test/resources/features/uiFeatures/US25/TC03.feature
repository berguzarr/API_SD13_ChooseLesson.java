@meryem2
Feature: Admin ogrenci olusturabilmelidir

  Scenario:TC03_"Name"_alani_bos_birakildiginda
    Given Kullanici login e tiklar
    When Username kutusuna "meryem24" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    And Ogernci icin Choose Advisor Teacher secer
    And Choose Advisor Teacher menusunden bir ogretmen secer
    Then ismin alanini bos birakir
    Then "Name" bolumunun zorunlu alan oldugu mesajinin gorundugunu dogrular