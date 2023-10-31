@Zeliha0308
Feature:Mesaj gönderilebilmeli
  Scenario: TC08_Kullanici_ayni_mail_adresi_ile_aynı_gün_ikinci_mesaji_gönderememeli
    Given Kullanici contact menusun e tiklar
    When Kullanici Your name kutusuna "Mark" girer
    And Kullanici Your Mail kutusuna "bir mail" girer
    And Kullanici Subject kutusuna "bir subject" girer
    And Kullanici Message kutusuna "bir mesaj" girer
    And Kullanici Send Message butonuna tiklar
    Then Contact Message Created Successfully mesajinin gorunur oldugu dogrulanir
    When Kullanici Your name kutusuna "Mark" girer
    And Kullanici Your Mail kutusuna ikinci kez ayni maili girer
    And Kullanici Subject kutusuna "bir subject" girer
    And Kullanici Message kutusuna "bir mesaj" girer
    And Kullanici Send Message butonuna tiklar
    #PASS
