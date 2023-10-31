@meryem2
Feature: Admin ogrenci olusturabilmelidir
  Scenario:TC09_Date_of_Birth_Bos_birakildiginda
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
    But Date of Birth kutusunu bos birakir
    Then  Date Of Birth bolumunun altinda "Required"  mesajini gorundugunu dogrular
