@Zeliha0303
Feature:Mesaj gönderilebilmeli
  Scenario: TC03_Kullanici_yourmail_kutusunu_boş_biraktiginda_mesaj gönderememeli
    Given Kullanici contact menusun e tiklar
    When Kullanici Your name kutusuna "bir name" girer
    And Kullanici Your Mail kutusuna "" girer
    And Kullanici Subject kutusuna "bir subject" girer
    And Kullanici Message kutusuna "bir mesaj" girer
    And Kullanici Send Message butonuna tiklar
    Then Kullanici hata mesajı aldigini dogrular

    #PASS
