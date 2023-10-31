@Zeliha0114
Feature:Aday ögrenciler sisteme kayıt olabilmelidir
  Scenario: TC14_Kullanici_register_olurken_SSN_kutusu_invalid_deger_kabul_etmemeli
    Given Kullanici register a tiklar
    When Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden bir cinsiyet secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusunu bos birakir
    And User Name kutusuna "bir kullanici adi" girer
    And Password kutusuna "bir sifre" girer
    And Kullanici register butonuna tiklar
    Then Ssn bolumunun zorunlu alan oldugu mesajinin gordugunu dogrular

    #PASS