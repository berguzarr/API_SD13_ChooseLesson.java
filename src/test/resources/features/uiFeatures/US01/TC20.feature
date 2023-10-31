@Zeliha0120
Feature:Aday ögrenciler sisteme kayıt olabilmelidir
  Scenario: TC20_Kullanici_daha_önce_Register_oldugu_bilgilerle_tekrar_giriş_yapamamalı
    Given Kullanici register a tiklar
    When Name kutusuna "Faruk" girer
    And Surname kutusuna "Gül" girer
    And Birth Place "Bursa" girer
    And Phone kutusuna "543-233-4556" girer
    And Gender bolumunden "Male" secenegini secer
    And Date Of Birth bolumune kayitli tarih girer
    And Ssn kutusuna kayitli numara girer
    And User Name kutusuna "FarukGl" girer
    And Password kutusuna "12345678" girer
    And Kullanici register butonuna tiklar
    Then Kayitli kullanici mesajinin gorunur oldugu dogrulanir
    And Kayitli kullaniciyi siler
    And User Name kutusuna "bir kullanici adi" girer
    And Kullanici register butonuna tiklar
    Then Kayitli Ssn mesajinin gorunur oldugu dogrulanir
    And Kayitli Ssn numarasini siler
    And Ssn kutusuna bir numara girer
    And Kullanici register butonuna tiklar
   Then Kayitli telefon numrasi mesajinin gorunur oldugu dogrulanir

    #PASS






