@Zeliha0110
Feature:Aday ögrenciler sisteme kayıt olabilmelidir
  Scenario: TC10_Kullanıcı_register_olurken_gender_kutusunu_bos_birakir
    Given Kullanici register a tiklar
    When Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    And Phone kutusuna invalid deger girer
    And Gender bolumunden "" secenegini secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "bir kullanici adi" girer
    And Password kutusuna "bir sifre" girer
    And Kullanici register butonuna tiklar
    Then Kullanici basarili register olamamali

    #PASS

