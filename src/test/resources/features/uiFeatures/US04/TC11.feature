@UI
Feature: Admin Dean Ekleyebilmeli
  Scenario: TC11_SurNameBox_invalid_degerler_kabul_etmemeli_alfabetik_tek_karakter_girisinde_uyari_yazisi_gorunmeli
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Dean Management butonuna tiklar
    And DeanName kutusuna "bir isim" girer
    And DeanSurName kutusuna "h" girer
    And DeanBirthPlace kutusuna "bir yer ismi" girer
    And DeanGender "Female" secenegini girer
    And DeanDateOfBirth kutusuna tarih girer
    And DeanPhone kutusuna "bir telefon numarasi" girer
    And DeanSSN kutusuna SSNno girer
    And DeanUserName kutusuna "bir kullanici adi" girer
    And DeanPassword kutusuna sifre girer
    And DeanSubmit butonuna tiklar
    Then DeanSurname kutusu enaziki karakter uyarisi gorunmeli ve dean kaydi yapilmadigi gorunmeli