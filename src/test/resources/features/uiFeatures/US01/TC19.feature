@Zeliha0119
Feature:Aday ögrenciler sisteme kayıt olabilmelidir
  Scenario: TC19_Kullanici_Register_olurken_Password_kutusu_invalid_deger_kabul_etmemeli
    Given Kullanici register a tiklar
    When Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden bir cinsiyet secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna bir "kullanici adi" girer
    And Password kutusuna yedi karakterli bir sifre girer
    Then Password Minimum 8 character uyarisi gorunur oldugu dogrulanir

    #PASS


