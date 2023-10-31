@meryem2
Feature: Admin ogrenci olusturabilmelidir
  Scenario: TC08_Gender_Secilmediginde
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
    And Birth Place "bir yer ismi" girer
    And Email kutusuna "bir eposta adresi" girer
    And Phone kutusuna "telefon numarasi" girer
    But Gender bolumunden bir cinsiyet secmez
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "bir kullanici adi" girer
    And Father Name kutusuna "bir baba adi" girer
    And Mother Name kutusuna "bir anne adi" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna click eder
    Then Gender bolumundeki "Gender" kutusunun secili olmadigini dogrular