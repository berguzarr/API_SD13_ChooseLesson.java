@meryem2
Feature:Admin ogrenci olusturabilmelidir
  Scenario: TC16_Password_alani_bos_birakildiginda
    Given Kullanici login e tiklar
    When Username kutusuna "meryem24" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    But kullanici Password alanini bos birakir
    Then Password bolumunun zorunlu bir alan oldugu mesajini dogrular