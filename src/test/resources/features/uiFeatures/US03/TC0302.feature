@Zeliha0302
Feature:Mesaj gönderilebilmeli
  Scenario: TC02_Kullanici_yourname_kutusunu_boş_biraktiginda_mesaj gönderememeli
    Given Kullanici contact menusun e tiklar
    When Kullanici Your name kutusuna "" girer
    And Kullanici Your Mail kutusuna "bir mail" girer
    And Kullanici Subject kutusuna "bir subject" girer
    And Kullanici Message kutusuna "bir mesaj" girer
    And Kullanici Send Message butonuna tiklar
    Then Kullanici mesaj gonderememeli

    #FAIL(Kullanıcı yourname boş olmasına rağmen başarılı mesajını alıyor)