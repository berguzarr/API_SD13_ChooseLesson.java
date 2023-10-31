@Gurkay1336
Feature: Admin Ogretmen olusturabilmeli
  Scenario:TC36_Phone_kutusuna_gecersiz_bir_telefon_numarasi_girildiginde_kayit_yapilabilmelidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayadm" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Choose Lesson menusune tiklar
    And Choose Lesson menusunden bir ders secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    And Email kutusuna "bir eposta adresi" girer
    And Phone kutusuna "10110101010" girer
    And Gender bolumunden "Male" secenegini secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "bir kullanici adi" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna tiklar
    Then Kayit isleminin gerceklesmedigini dogrular
