
@Mustafa
Feature: Student Info Management - Student Info List

  Background: Login olunur.
    Given Teacher "teacherUsername" ve "teacherPassword" ile login olunur.


  Scenario: Default Senaryo - Kayit Silinmesi

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    And Ogrenci kaydi varsa silinir.


    Scenario: TC01 Student Info List kayit islemi kontrolleri

      And Student Info Management sayfasinin acildigi dogrulanir.
      And Student Info List Header'inin gorunurlugu dogrulanir.
      When Lesson secimi "C#" yapilir.
      Then Lesson seciminin "C#" oldugu dogrulanir.
      And Student secimi "Ali CAN" yapilir.
      Then Student seciminin "Ali CAN" oldugu dogrulanir.
      And Education Term secimi "SPRING_SEMESTER" yapilir.
      Then Education Term seciminin "SPRING_SEMESTER" oldugu dogrulanir.
      And Absentee bilgisi "15" olarak girilir.
      And Midterm exam bilgisi "95" olarak girilir.
      And Final exam bilgisi "85" olarak girilir.
      And info not bilgisi "aferinn zeki çocuuk" olarak doldurulur.
      And Submit butonuna tiklanir.
      And "Student Info saved Successfully" popup'i dogrulanir.
      Then Name Surname basligi gorunurlugu ve input degerinin "Ali CAN" oldugu kontrol edilir.
      Then Lesson Name basligi gorunurlugu ve input degerinin "C#" oldugu kontrol edilir.
      Then Absentee basligi gorunurlugu ve input degerinin "15" oldugu kontrol edilir.
      Then Midterm Exam basligi gorunurlugu ve input degerinin "95" oldugu kontrol edilir.
      Then Final Exam basligi gorunurlugu ve input degerinin "85" oldugu kontrol edilir.
      Then Note basligi gorunurlugu kontrol edilir.
      Then info Note basligi gorunurlugu ve input degerinin "aferinn zeki çocuuk" oldugu kontrol edilir.
      Then Average basligi gorunurlugu kontrol edilir.
      And Delete butonuna tiklanir.
      Then "Student Info deleted Successfully" popup'i dogrulanir.


  Scenario: TC02 Edit Student info Midterm Exam update (valid deger)

    And Student Info Management sayfasinin acildigi dogrulanir.
    And Student Info List Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "SPRING_SEMESTER" yapilir.
    Then Education Term seciminin "SPRING_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "10" olarak girilir.
    And Midterm exam bilgisi "65" olarak girilir.
    And Final exam bilgisi "75" olarak girilir.
    And info not bilgisi "aferinn zeki çocuuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    And "Student Info saved Successfully" popup'i dogrulanir.
    And Student info List alaninda edit butonuna tiklanir.
    And Edit Student Info Header'inin gorunurlugu dogrulanir.
    When Edit Student info Lesson "C#" secimi yapilir.
    When Edit Student info Education Term "SPRING_SEMESTER" secimi yapilir.
    And Edit Student info Midterm Exam inputu "90" olarak guncellenir.
    When Edit Student info submit butonuna tiklanir.
    Then "Student Info updated Successfully" popup'i dogrulanir.
    And Edit Student info sayfasi kapatilir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  Scenario: TC03 Edit Student info Final Exam update (valid deger)

    And Student Info Management sayfasinin acildigi dogrulanir.
    And Student Info List Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "SPRING_SEMESTER" yapilir.
    Then Education Term seciminin "SPRING_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "10" olarak girilir.
    And Midterm exam bilgisi "65" olarak girilir.
    And Final exam bilgisi "75" olarak girilir.
    And info not bilgisi "aferinn zeki çocuuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    And "Student Info saved Successfully" popup'i dogrulanir.
    And Student info List alaninda edit butonuna tiklanir.
    And Edit Student Info Header'inin gorunurlugu dogrulanir.
    When Edit Student info Lesson "C#" secimi yapilir.
    When Edit Student info Education Term "SPRING_SEMESTER" secimi yapilir.
    And Edit Student info Final Exam inputu "90" olarak guncellenir.
    When Edit Student info submit butonuna tiklanir.
    Then "Student Info updated Successfully" popup'i dogrulanir.
    And Edit Student info sayfasi kapatilir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  Scenario: TC04 Edit Student info Midterm Exam update (negatif deger)

    And Student Info Management sayfasinin acildigi dogrulanir.
    And Student Info List Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "SPRING_SEMESTER" yapilir.
    Then Education Term seciminin "SPRING_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "10" olarak girilir.
    And Midterm exam bilgisi "65" olarak girilir.
    And Final exam bilgisi "75" olarak girilir.
    And info not bilgisi "aferinn zeki çocuuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    And "Student Info saved Successfully" popup'i dogrulanir.
    And Student info List alaninda edit butonuna tiklanir.
    And Edit Student Info Header'inin gorunurlugu dogrulanir.
    When Edit Student info Lesson "C#" secimi yapilir.
    When Edit Student info Education Term "SPRING_SEMESTER" secimi yapilir.
    And Edit Student info Midterm Exam inputu "-90" olarak guncellenir.
    When Edit Student info submit butonuna tiklanir.
    Then "'0.0' değerinden büyük yada eşit olmalı" popup'i dogrulanir.
    And Edit Student info sayfasi kapatilir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  Scenario: TC05 Edit Student info Midterm Exam update (invalid deger)

    And Student Info Management sayfasinin acildigi dogrulanir.
    And Student Info List Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "SPRING_SEMESTER" yapilir.
    Then Education Term seciminin "SPRING_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "10" olarak girilir.
    And Midterm exam bilgisi "65" olarak girilir.
    And Final exam bilgisi "75" olarak girilir.
    And info not bilgisi "aferinn zeki çocuuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    And "Student Info saved Successfully" popup'i dogrulanir.
    And Student info List alaninda edit butonuna tiklanir.
    And Edit Student Info Header'inin gorunurlugu dogrulanir.
    When Edit Student info Lesson "C#" secimi yapilir.
    When Edit Student info Education Term "SPRING_SEMESTER" secimi yapilir.
    And Edit Student info Midterm Exam inputu "155" olarak guncellenir.
    When Edit Student info submit butonuna tiklanir.
    Then "'100.0' değerinden küçük yada eşit olmalı" popup'i dogrulanir.
    And Edit Student info sayfasi kapatilir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  Scenario: TC06 Edit Student info Final Exam update (negatif deger)

    And Student Info Management sayfasinin acildigi dogrulanir.
    And Student Info List Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "SPRING_SEMESTER" yapilir.
    Then Education Term seciminin "SPRING_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "10" olarak girilir.
    And Midterm exam bilgisi "65" olarak girilir.
    And Final exam bilgisi "75" olarak girilir.
    And info not bilgisi "aferinn zeki çocuuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    And "Student Info saved Successfully" popup'i dogrulanir.
    And Student info List alaninda edit butonuna tiklanir.
    And Edit Student Info Header'inin gorunurlugu dogrulanir.
    When Edit Student info Lesson "C#" secimi yapilir.
    When Edit Student info Education Term "SPRING_SEMESTER" secimi yapilir.
    And Edit Student info Final Exam inputu "-55" olarak guncellenir.
    When Edit Student info submit butonuna tiklanir.
    Then "'0.0' değerinden büyük yada eşit olmalı" popup'i dogrulanir.
    And Edit Student info sayfasi kapatilir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  Scenario: TC07 Edit Student info Final Exam update (invalid deger)

    And Student Info Management sayfasinin acildigi dogrulanir.
    And Student Info List Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "SPRING_SEMESTER" yapilir.
    Then Education Term seciminin "SPRING_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "10" olarak girilir.
    And Midterm exam bilgisi "65" olarak girilir.
    And Final exam bilgisi "75" olarak girilir.
    And info not bilgisi "aferinn zeki çocuuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    And "Student Info saved Successfully" popup'i dogrulanir.
    And Student info List alaninda edit butonuna tiklanir.
    And Edit Student Info Header'inin gorunurlugu dogrulanir.
    When Edit Student info Lesson "C#" secimi yapilir.
    When Edit Student info Education Term "SPRING_SEMESTER" secimi yapilir.
    And Edit Student info Final Exam inputu "155" olarak guncellenir.
    When Edit Student info submit butonuna tiklanir.
    Then "'100.0' değerinden küçük yada eşit olmalı" popup'i dogrulanir.
    And Edit Student info sayfasi kapatilir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  Scenario: TC08 Edit Student info Info Note update (valid deger)

    And Student Info Management sayfasinin acildigi dogrulanir.
    And Student Info List Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "SPRING_SEMESTER" yapilir.
    Then Education Term seciminin "SPRING_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "10" olarak girilir.
    And Midterm exam bilgisi "65" olarak girilir.
    And Final exam bilgisi "75" olarak girilir.
    And info not bilgisi "aferinn zeki çocuuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    And "Student Info saved Successfully" popup'i dogrulanir.
    And Student info List alaninda edit butonuna tiklanir.
    And Edit Student Info Header'inin gorunurlugu dogrulanir.
    When Edit Student info Lesson "C#" secimi yapilir.
    When Edit Student info Education Term "SPRING_SEMESTER" secimi yapilir.
    And Edit Student info Midterm Exam inputu "100" olarak guncellenir.
    And Edit Student info Final Exam inputu "100" olarak guncellenir.
    And Edit Student info Info Note inputu "WoaaaWW" olarak guncellenir.
    When Edit Student info submit butonuna tiklanir.
    Then "Student Info updated Successfully" popup'i dogrulanir.
    And Edit Student info sayfasi kapatilir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  Scenario: TC09 Edit Student info Info Note update (bos birakilir)

    And Student Info Management sayfasinin acildigi dogrulanir.
    And Student Info List Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "SPRING_SEMESTER" yapilir.
    Then Education Term seciminin "SPRING_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "10" olarak girilir.
    And Midterm exam bilgisi "65" olarak girilir.
    And Final exam bilgisi "75" olarak girilir.
    And info not bilgisi "aferinn zeki çocuuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    And "Student Info saved Successfully" popup'i dogrulanir.
    And Student info List alaninda edit butonuna tiklanir.
    And Edit Student Info Header'inin gorunurlugu dogrulanir.
    When Edit Student info Lesson "C#" secimi yapilir.
    When Edit Student info Education Term "SPRING_SEMESTER" secimi yapilir.
    And Edit Student info Midterm Exam inputu "100" olarak guncellenir.
    And Edit Student info Final Exam inputu "100" olarak guncellenir.
    And Edit Student info Info Note inputu "" olarak guncellenir.
    When Edit Student info submit butonuna tiklanir.
    Then "Extra Info should be at least 4 characters " popup'i dogrulanir.
    And Edit Student info sayfasi kapatilir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  Scenario: TC10 Student info List delete butonu kontrolu

    And Student Info Management sayfasinin acildigi dogrulanir.
    And Student Info List Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "SPRING_SEMESTER" yapilir.
    Then Education Term seciminin "SPRING_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "10" olarak girilir.
    And Midterm exam bilgisi "65" olarak girilir.
    And Final exam bilgisi "75" olarak girilir.
    And info not bilgisi "aferinn zeki çocuuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    And "Student Info saved Successfully" popup'i dogrulanir.
    And Bulundugun sayfa yenilenir.
    Then Delete butonunun aktif oldugu dogrulanir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.





