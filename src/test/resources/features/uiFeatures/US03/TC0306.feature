@Zeliha0306
Feature:Mesaj gönderilebilmeli
  Scenario: TC06_Kullanici_subject_kutusunu_bos_birakildiginda_mesaj_gönderememeli
    Given Kullanici contact menusun e tiklar
    When Kullanici Your name kutusuna "bir name" girer
    And Kullanici Your Mail kutusuna "bir mail" girer
    And Kullanici Subject kutusuna "" girer
    And Kullanici Message kutusuna "bir mesaj" girer
    And Kullanici Send Message butonuna tiklar
    Then Kullanici mesaj gonderememeli
    #Subject kısmı boş olmasına rağmen mesaj gönderebiliyor (FAILL)
