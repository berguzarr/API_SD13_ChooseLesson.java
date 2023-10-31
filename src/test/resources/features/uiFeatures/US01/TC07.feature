@Zeliha0107
Feature:Aday ögrenciler sisteme kayıt olabilmelidir
  Scenario: TC06_Kullanici_register_olurken_birth_place_kutusu_invalid_deger_kabul_etmemeli
    Given Kullanici register a tiklar
    When Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soy isim" girer
    And Birth Place "  " girer
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden bir cinsiyet secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna bir "kullanici adi" girer
    And Password kutusuna "bir sifre" girer
    And Kullanici register butonuna tiklar
    Then Kullanici register olamamali

    #FAILL