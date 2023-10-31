@UI
Feature: Admin Dean Ekleyebilmeli
  Scenario: TC13_BirthPlaceBox_invalid_degerler_kabul_etmemeli_space_karakteri_girildiginde_uyari_yazisi_gorunmeli)
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Dean Management butonuna tiklar
    And DeanName kutusuna "bir isim" girer
    And DeanSurName kutusuna "bir soyisim" girer
    And DeanBirthPlace kutusuna " " girer
    And DeanGender "Female" secenegini girer
    And DeanDateOfBirth kutusuna tarih girer
    And DeanPhone kutusuna "bir telefon numarasi" girer
    And DeanSSN kutusuna SSNno girer
    And DeanUserName kutusuna "bir kullanici adi" girer
    And DeanPassword kutusuna sifre girer
    And DeanSubmit butonuna tiklar
    Then DeanBirthPlace enaz iki karakter icermeli uyarisi gorunmeli ve dean kaydi yapilmamalidir