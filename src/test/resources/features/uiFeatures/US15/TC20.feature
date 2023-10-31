@meryem
Feature: Vice Dean ogrenci olusturabilmeli
  Scenario: TC20a_Phone_alanina_en_az_10_sayi_girmeli_Ayrica_3uncu_ve_6inci_sayilari arasinda_Bosluk_yada_Tire'-'_olmali
    Given Kullanici login e tiklar
    When Username kutusuna "meryem25" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    And Ogernci icin Choose Advisor Teacher secer
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girdi
    And Email kutusuna "bir eposta adresi" girdi
    But Phone kutusuna "1235678" girer
    Then Phone bolumu altinda "Minimum 12 character (XXX-XXX-XXXX)" messajini gorur

  @meryem
  Scenario: TC20b_Phone_alanina_12_Karakter_girildiginde_harf_Simge_yada_fazladan_belirtilmemis_Yerlere_bosluk_girilemez
    Given Kullanici login e tiklar
    When Username kutusuna "meryem25" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    And Ogernci icin Choose Advisor Teacher secer
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girdi
    And Email kutusuna "bir eposta adresi" girdi
    But Phone kutusuna "12a bc@ 1 2*" girer
    And Gender bolumunden Femail secenegini secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "bir kullanici adi" girer
    And Father Name kutusuna "bir baba adi" girer
    And Mother Name kutusuna "bir anne adi" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna click eder
    Then Kullanici"Please enter valid phone number" masajini gorur


  @meryem
  Scenario: TC20c_kullanici_titre('-')_yerine_bosluk_kayabiliyor

    Given Kullanici login e tiklar
    When Username kutusuna "meryem25" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    And Ogernci icin Choose Advisor Teacher secer
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girdi
    And Email kutusuna "bir eposta adresi" girdi
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden Femail secenegini secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "bir kullanici adi" girer
    And Father Name kutusuna "bir baba adi" girer
    And Mother Name kutusuna "bir anne adi" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna click eder
    Then  kullanici "Student saved Successfully" basari mesajini dogrular

#Bu test case'te tire isareti koymadan bosluk iceren numara koymustum fakat ayni numarayi iki kez run
  # edince busefer number olready exists dye hata mesaji veriyor
