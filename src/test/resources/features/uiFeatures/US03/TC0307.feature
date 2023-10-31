@Zeliha0307
Feature:Mesaj gönderilebilmeli
  Scenario: TC07_Kullanici_message_kutusunu_bos_biraktiginda_mesaj_gonderememeli
    Given Kullanici contact menusun e tiklar
    When Kullanici Your name kutusuna "bir name" girer
    And Kullanici Your Mail kutusuna "bir mail" girer
    And Kullanici Subject kutusuna "bir subject" girer
    And Kullanici Message kutusuna "" girer
    And Kullanici Send Message butonuna tiklar
    Then Kullanici mesaj gonderememeli
    #FAILL
