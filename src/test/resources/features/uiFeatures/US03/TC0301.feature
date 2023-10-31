@Zeliha0301
Feature:Mesaj gönderilebilmeli
  Scenario: TC01_Kullanici_message_gonderebilmeli
    Given Kullanici contact menusun e tiklar
    When Kullanici Your name kutusuna "bir name" girer
    And Kullanici Your Mail kutusuna "bir mail" girer
    And Kullanici Subject kutusuna "bir subject" girer
    And Kullanici Message kutusuna "bir mesaj" girer
    And Kullanici Send Message butonuna tiklar
    Then Contact Message Created Successfully mesajinin gorunur oldugu dogrulanir
    #PASS
