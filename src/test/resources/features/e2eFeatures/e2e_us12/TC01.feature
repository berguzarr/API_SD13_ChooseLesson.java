@E2E  @US12

Feature: TC01 | Vice Dean Lesson Program Olusturabilmeli

  @UI

  Scenario: WEB_sitesinde_Vice_Dean_Lesson_Program_olusturur

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lesson Program sechilir
    And "Add Lesson Program" headerinin gorunurlugu dogrular
    And Choose Lesson menusune tiklar
    And Choose Lessons dropdownundan ders secilir
    And Choose Day menusunden day secilir
    And Education Term menusunden Term secilir
    And Start Time menusunden "time degeri" belirtilir
    And Stop Time menusunden "time degeri" belirtilir
    And Submit butonuna tiklanir
    Then "Created Lesson Program" pup up mesaji goruntulenir

  @API
  Scenario:API_testi_ile_web_sitesinde_Vice_Dean_Lesson_Program_olustgu_dogrulanir
    Given Gerekli bilgileri olusturur
    Then Olusturulan bilgileri kontrol eder

  @DB
  Scenario: DATABASE_testi_ile_web_sitesinde_Vice_Dean_Lesson_Program_olustugu_dogrulanir
    Given Kayitli ders programi id sorgulamasi yapilir
    Then Database dogrulamasi yapilir

