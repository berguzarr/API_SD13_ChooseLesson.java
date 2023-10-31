@Abat1008
Feature: Vice Dean ders programi olusturabilmelidir.
  Scenario:TC08  Start Time box'a invalid deger girildiginde program olusmamali
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
    Then Created Lesson Program gerceklestigini dogrular

    #00:00-10:00 bu satte ders olmaz ama program olushuyor