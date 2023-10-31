@meryem
Feature: Vice Dean ogrenci olusturabilmeli
  Scenario:TC02_Danisman_Ogretmen_secilmeden_ogrenci_olusturulamaz
    Given Kullanici login e tiklar
    When Username kutusuna "meryem25" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    But Ogrenci icin Choose Advisor Teacher secemez
    When Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girdi
    And Email kutusuna "bir eposta adresi" girdi
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden Femail secenegini secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "bir kullanici adi" girer
    And Father Name kutusuna "bir baba adi" girer
    And Mother Name kutusuna "bir anne adi" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna click eder
    Then  "Please select advisor teacher" uyari mesajini gordugunu dogrular