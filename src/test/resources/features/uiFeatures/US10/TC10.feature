@Abat1010
Feature: Vice Dean ders programi olusturabilmelidir.
  Scenario:TC10 Start time gechersiz deger verildiginde ve stop time gecherli degr verildiginde program olushmamali
    Given Kullanici login e tiklar
    When Username kutusuna "einstein.a" girer
    And Password kutusuna "canada123" girer
    And Login butonuna tiklar
    And Lesson Program sechilir
    And Choose Lessons dropdownundan create edilen ders secilir
    And Choose Day menusunden day box girilir
    And Education Term box term secilir
    And Start Time menusu time degeri  girilir
    And Stop Time menusu time degeri girilir
    And Submit butonuna tiklanir
    Then "Choose Lesson Hatasi" pup up mesaji goruntulenir

    #23:00-00:00




