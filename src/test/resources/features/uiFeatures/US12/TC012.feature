@Sevda12
Feature: Lesson Program Assigment

  Scenario:TC012_Yeni_Lesson_Olusturur

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lessons sekmesine tiklar
    And  "Ders adi" ders adini girer
    And  Compulsory secenegini secer
    And  "5" kredi puanini girer
    And  Submit buto na tiklar
    Then  Lesson Created "pup up" mesaji goruntulenir
