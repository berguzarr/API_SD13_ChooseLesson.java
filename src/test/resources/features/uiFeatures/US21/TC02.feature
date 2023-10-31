@Kozak2102
Feature: Ogrenci Choose Lesson listesinde
  Scenario: TC02_Student_ders_secebilmeli
    Given Kullanici login e tiklar
    When Username kutusuna "Arda" girer
    And Password kutusuna "Kral1907" girer
    And Login butonuna tiklar
    And Student son siradaki dersi secer
    And Student Choose Lesson submite tiklar
    Then Student ders ekledigini dogrular
