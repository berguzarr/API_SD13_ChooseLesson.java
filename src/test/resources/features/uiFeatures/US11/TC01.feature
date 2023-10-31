@Abat1101
Feature: US11 Vice Dean ders programını görebilmeli ve güncellemeler yapabilmelidir.
  Scenario: Lesson Program List alaninda olushturulan Day  görülmeli
    Given Kullanici login e tiklar
    When Username kutusuna "a.einstein" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Lesson Program sechilir
    And Lesson Program List alaninda olushturulan Day, Start Time, Stop Time görülmeli
    Then List halinde görüntülenmeli



