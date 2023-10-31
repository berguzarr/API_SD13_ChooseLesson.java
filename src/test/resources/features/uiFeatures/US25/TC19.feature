@meryem2
Feature:Admin ogrenci olusturabilmelidir
  Scenario:TC19_"e-mail_alanina_gecersiz_data_girildiginde_Uyari_Messaji_gorunur
    Given Kullanici login e tiklar
    When Username kutusuna "meryem24" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    And Ogernci icin Choose Advisor Teacher secer
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    But Email kutusuna "sera123.com" girer
    When Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden Femail secenegini secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "bir kullanici adi" girer
    And Father Name kutusuna "bir baba adi" girer
    And Mother Name kutusuna "bir anne adi" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna click eder
    Then Kullanici"Please enter valid email" masajini gordugunu dogrular
