@Zeliha0304
Feature:Mesaj gönderilebilmeli
  Scenario: TC04_Kullanici_mail_kutusuna_invalid_mail_girdiginde_mesaj_gönderememeli
    Given Kullanici contact menusun e tiklar
    When Kullanici Your name kutusuna "bir name" girer
    And Kullanici Your Mail kutusuna "markeliyahu" girer
    And Kullanici Subject kutusuna "bir subject" girer
    And Kullanici Message kutusuna "bir mesaj" girer
    And Kullanici Send Message butonuna tiklar
    Then Kullanici Please enter valid email hata mesaji aldigini dogrular

    #PASS