@UI
Feature: Admin Dean Ekleyebilmeli
  Scenario: TC17_Gender_Options_bos_deger_kabul_etmemeli_uyari_yazisi_gorunmeli
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Dean Management butonuna tiklar
    And DeanName kutusuna "bir isim" girer
    And DeanSurName kutusuna "bir soyisim" girer
    And DeanBirthPlace kutusuna "bir yer ismi" girer
    And DeanDateOfBirth kutusuna tarih girer
    And DeanPhone kutusuna "bir telefon numarasi" girer
    And DeanSSN kutusuna SSNno girer
    And DeanUserName kutusuna "bir kullanici adi" girer
    And DeanPassword kutusuna sifre girer
    And DeanSubmit butonuna tiklar
    Then GenderOptions required uyarisi gorundugu dogrulanir