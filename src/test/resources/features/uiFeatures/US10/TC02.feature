@Abat1002
Feature:Vice Dean ders programi olusturabilmelidir.
  Scenario:TC02 Choose Lesson menüsünden bir ders seçildiğinde kayit yapilamamali
    Given Kullanici login e tiklar
    When Username kutusuna "einstein.aa" girer
    And Password kutusuna "canada1234" girer
    And Login butonuna tiklar
    And Lesson Program sechilir
    And Choose Lessons dropdownundan create edilen ders secilir
    And Submit buttonuna tiklar
    Then Kayit isleminin gerceklesmedigini dogrular


