@meryem2
Feature:Admin ogrenci olusturabilmelidir
  Scenario: TC17_Password_en_az_8_karakterden_olusmalidir
    Given Kullanici login e tiklar
    When Username kutusuna "meryem24" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    But Password kutusuna yedi karakterli bir sifre girer
    Then Password bolumu altinda "Minimum 8 character" mesajini gorundugunu dogrular
