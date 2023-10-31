@E2E @US15
  Feature:TC01 | Vice Dean ogrenci olusturabilmeli

    @UI
    Scenario:WEB_sitesinde_Vice_Dean_Basarili_bir_sekilde_ogrenci_olusturabilmeli
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
      And Birth Place "bir yer ismi" girer
      And Email kutusuna "bir eposta adresi" girer
      And Phone kutusuna "bir telefon numarasi" girer
      And Gender bolumunden "FEMALE" secenegini secer
      And Date Of Birth bolumune bir tarih girer
      And Ssn kutusuna bir numara girer
      And User Name kutusuna "bir kullanici adi" girer
      And Father Name kutusuna "bir baba adi" girer
      And Mother Name kutusuna "bir anne adi" girer
      And Password kutusuna bir sifre girer
      And Submit butonuna click eder
      Then  kullanici "Student saved Successfully" basari mesajini dogrular

     @API
    Scenario: API_testi_ile_web_sitesinde_yapilan_kaydin_basarili_oldugu_dogrulanir
      Given  Kayitli Ogrencinin Id bilgisi alinir_API
      And Kayitli Ogrenci userId ile cagirilir
      Then Ogrenci bilgileri dogrulanir

   @DB
    Scenario:  DATABASE_testi_ile_web_sitesinde_yapilan_kaydin_basarili_oldugu_dogrulanir
      Given Kayitli ogrencinin UserId bilgisi ile sorgu yapilir
      Then Ogrenci bilgilerinin database dogrulamasi yapilir

     @API
    Scenario: Kayit_edilen_Ogrenci_silinir
      Given Kayitli Ogrenci userId ile cagirilir
      And Kayitli ogrenci silinir
     Then ogrencinin silindigi dogrulanir
      # ne kadar ugrassamda ogrenci silinemedi gercekte, bu bir bugdur!!!!.
