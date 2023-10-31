@Abat1005
Feature: Vice Dean ders programi olusturabilmelidir.
  Scenario:TC05 Choose Day box secilmediginde  program olusmamali
    Given Kullanici login e tiklar
    When Username kutusuna "einstein.a" girer
    And Password kutusuna "canada123" girer
    And Login butonuna tiklar
    And Lesson Program sechilir
    And Choose Lessons dropdownundan create edilen ders secilir
    And Start Time menusu time degeri  girilir
    And Stop Time menusu time degeri girilir
    And Submit butonuna tiklanir
    Then "Choose Lesson Hatasi" pup up mesaji goruntulenir