@meryem2
Feature: Admin ogrenci olusturabilmelidir
  Scenario:TC11_SNN_Rakam_alani_bos_birakildiginda
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
    And Gender bolumunden "Male" secenegini secer
    And Date Of Birth bolumune bir tarih girer
    But SSN kutusunu bos birakir
    Then SSN bolumunun altinda "Required" mesajini gorundugunu dogrular
