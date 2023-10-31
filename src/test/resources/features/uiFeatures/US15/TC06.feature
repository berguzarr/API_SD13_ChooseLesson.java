@meryem
Feature: Vice Dean ogrenci olusturabilmeli
  Scenario: TC06_"email_alani_Bos_birakildiginda
    Given Kullanici login e tiklar
    When Username kutusuna "meryem25" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    And Ogernci icin Choose Advisor Teacher secer
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girdi
    But e-mail alanini bos birakir
    Then "Email" bolumunun zorunlu alan oldugu mesajinin gorundugunu dogrular