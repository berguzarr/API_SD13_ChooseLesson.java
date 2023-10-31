@meryem
Feature: Vice Dean ogrenci olusturabilmeli
  Scenario: TC14_"Father name"_alani_bos_birakildiginda
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
    And Email kutusuna "bir eposta adresi" girdi
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden Femail secenegini secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "bir kullanici adi" girer
    But Father Name kutusuna Bos birakir
    Then Father Name bolumu altinda "Required" mesajini gorundugunu dogrular