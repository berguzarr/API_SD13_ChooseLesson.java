@Zeliha0116
Feature:Aday ögrenciler sisteme kayıt olabilmelidir
  Scenario: TC16_Kullanici_register_olurken_Username_kutusu_invalid_değer_kabul_etmemeli
    Given Kullanici register a tiklar
    When Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden bir cinsiyet secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "" girer
    And Password kutusuna "bir sifre" girer
    And Kullanici register butonuna tiklar
    Then Username bolumunun zurunla alan oldugu dogrulanir

    #PASS



