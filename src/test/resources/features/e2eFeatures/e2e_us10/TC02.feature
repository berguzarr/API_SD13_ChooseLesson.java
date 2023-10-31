@e2etest

Feature:Vice Dean ders programi olusturabilmelidir.

  Scenario Outline: TC03 Choose Lesson menüsünden birden fazla sectiğinde kayit yapilmali
    Given Kullanici login e tiklar
    When Username kutusuna <string> girer
    And Password kutusuna <string1> girer
    And Login butonuna tiklar
    And Lesson Program sechilir
    And Choose Lessons dropdownundan create edilen 2tane ders secilir
    And Choose Day menusunden day box girilir
    And Education Term box term secilir
    And Start Time menusu time degeri  girilir
    And Stop Time menusu time degeri girilir
    Then Submit buttonuna tiklar
    Then Created Lesson Program gerceklestigini dogrular
    Examples:
      | string       | string1    |
      | "einstein.aa" | "canada1234" |

    Scenario:TC03 Choose Lesson menüsünden birden fazla sectiğinde kayit yapilmali_API_Ab
      Given Vice Dean kayitli lesson program ders cagirir_API_Ab
      Then Kaydedilen lessonProgram dersleri dogrulanir_Ab
      Then Kayitli Lesson Program silinir_Ab



