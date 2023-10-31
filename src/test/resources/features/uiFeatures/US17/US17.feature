
@Mustafa
Feature: Student Info Management - Add Student Info

  Background: Login olunur.
    Given Teacher "teacherUsername" ve "teacherPassword" ile login olunur.


  Scenario: Default Senaryo - Kayit Silinmesi

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    And Ogrenci kaydi varsa silinir.


    @Edit
            #    Bug fixlendiğinde gelen popup verify edilecek. (Submit butonuna tıklandığında zorunlu alanlar boş bırakılamaz popup'ı gelmeli)
    Scenario: TC01 Zorunlu alanlarin bos birakilmasi

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "FALL_SEMESTER" yapilir.
    Then Education Term seciminin "FALL_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "" olarak girilir.
    And Midterm exam bilgisi "" olarak girilir.
    And Final exam bilgisi "" olarak girilir.
    And info not bilgisi "" olarak doldurulur.
    Then "Required" uyarisi goruntulendigi dogrulanir.

#    And Submit butonuna tiklanir.


  @Edit
      #    Bug fixlendiğinde popup mesajları düzenlenecek. (Absentee inputu negatif deger alamaz - Kayıt yapmamalı)
  Scenario: TC02 Hatali Absentee bilgisi (negatif)

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "FALL_SEMESTER" yapilir.
    Then Education Term seciminin "FALL_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "-18" olarak girilir.
    And Midterm exam bilgisi "15" olarak girilir.
    And Final exam bilgisi "25" olarak girilir.
    And info not bilgisi "Saftirik çocuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    Then "Student Info saved Successfully" popup'i dogrulanir.
    And Bulundugun sayfa yenilenir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  @Edit
      #    Bug fixlendiğinde popup mesajları düzenlenecek. (Absentee inputu invalid deger alamaz - Kayıt yapmamalı)
  Scenario: TC03 Hatali Absentee bilgisi (invalid deger)

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "FALL_SEMESTER" yapilir.
    Then Education Term seciminin "FALL_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "118" olarak girilir.
    And Midterm exam bilgisi "15" olarak girilir.
    And Final exam bilgisi "25" olarak girilir.
    And info not bilgisi "Saftirik çocuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    Then "Student Info saved Successfully" popup'i dogrulanir.
    And Bulundugun sayfa yenilenir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  Scenario: TC04 Absentee bilgisi (valid deger)

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "FALL_SEMESTER" yapilir.
    Then Education Term seciminin "FALL_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "18" olarak girilir.
    And Midterm exam bilgisi "15" olarak girilir.
    And Final exam bilgisi "25" olarak girilir.
    And info not bilgisi "akıllı çocuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    Then "Student Info saved Successfully" popup'i dogrulanir.
    And Bulundugun sayfa yenilenir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  Scenario: TC05 Hatalı Midterm Exam bilgisi (negatif)

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "FALL_SEMESTER" yapilir.
    Then Education Term seciminin "FALL_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "18" olarak girilir.
    And Midterm exam bilgisi "-15" olarak girilir.
    And Final exam bilgisi "25" olarak girilir.
    And info not bilgisi "Saftirik çocuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    Then "'0.0' değerinden büyük yada eşit olmalı" popup'i dogrulanir.
  

  Scenario: TC06 Hatalı Midterm Exam bilgisi (invalid deger)

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "FALL_SEMESTER" yapilir.
    Then Education Term seciminin "FALL_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "18" olarak girilir.
    And Midterm exam bilgisi "155" olarak girilir.
    And Final exam bilgisi "25" olarak girilir.
    And info not bilgisi "Saftirik çocuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    Then "'100.0' değerinden küçük yada eşit olmalı" popup'i dogrulanir.


  Scenario: TC07 Midterm Exam bilgisi (valid deger)

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "FALL_SEMESTER" yapilir.
    Then Education Term seciminin "FALL_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "18" olarak girilir.
    And Midterm exam bilgisi "15" olarak girilir.
    And Final exam bilgisi "25" olarak girilir.
    And info not bilgisi "akıllı çocuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    Then "Student Info saved Successfully" popup'i dogrulanir.
    And Bulundugun sayfa yenilenir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  Scenario: TC08 Hatalı Final Exam bilgisi (negatif)

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "FALL_SEMESTER" yapilir.
    Then Education Term seciminin "FALL_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "18" olarak girilir.
    And Midterm exam bilgisi "15" olarak girilir.
    And Final exam bilgisi "-25" olarak girilir.
    And info not bilgisi "Saftirik çocuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    Then "'0.0' değerinden büyük yada eşit olmalı" popup'i dogrulanir.


  Scenario: TC09 Hatalı Final Exam bilgisi (invalid deger)

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "FALL_SEMESTER" yapilir.
    Then Education Term seciminin "FALL_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "18" olarak girilir.
    And Midterm exam bilgisi "15" olarak girilir.
    And Final exam bilgisi "125" olarak girilir.
    And info not bilgisi "Saftirik çocuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    Then "'100.0' değerinden küçük yada eşit olmalı" popup'i dogrulanir.


  Scenario: TC10 Final Exam bilgisi (valid deger)

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "FALL_SEMESTER" yapilir.
    Then Education Term seciminin "FALL_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "18" olarak girilir.
    And Midterm exam bilgisi "15" olarak girilir.
    And Final exam bilgisi "25" olarak girilir.
    And info not bilgisi "akıllı çocuk" olarak doldurulur.
    And Submit butonuna tiklanir.
    Then "Student Info saved Successfully" popup'i dogrulanir.
    And Bulundugun sayfa yenilenir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  Scenario: TC11 Info Note bilgisi (alfanümerik deger)

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "FALL_SEMESTER" yapilir.
    Then Education Term seciminin "FALL_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "18" olarak girilir.
    And Midterm exam bilgisi "15" olarak girilir.
    And Final exam bilgisi "25" olarak girilir.
    And info not bilgisi "100 tekrar yap" olarak doldurulur.
    And Submit butonuna tiklanir.
    Then "Student Info saved Successfully" popup'i dogrulanir.
    And Bulundugun sayfa yenilenir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.


  @Edit
      #    Bug fixlendiğinde popup mesajları düzenlenecek. (info Note alfanümerik olmayan deger alamaz - Kayıt yapmamalı)
  Scenario: TC12 Hatalı Info Note bilgisi (alfanümerik olmayan deger)

    Then Student Info Management sayfasinin acildigi dogrulanir.
    Then Add Student Info Header'inin gorunurlugu dogrulanir.
    When Lesson secimi "C#" yapilir.
    Then Lesson seciminin "C#" oldugu dogrulanir.
    And Student secimi "Ali CAN" yapilir.
    Then Student seciminin "Ali CAN" oldugu dogrulanir.
    And Education Term secimi "FALL_SEMESTER" yapilir.
    Then Education Term seciminin "FALL_SEMESTER" oldugu dogrulanir.
    And Absentee bilgisi "18" olarak girilir.
    And Midterm exam bilgisi "15" olarak girilir.
    And Final exam bilgisi "25" olarak girilir.
    And info not bilgisi "/*/* akıllı çocuk */*/" olarak doldurulur.
    And Submit butonuna tiklanir.
    Then "Student Info saved Successfully" popup'i dogrulanir.
    And Bulundugun sayfa yenilenir.
    And Delete butonuna tiklanir.
    Then "Student Info deleted Successfully" popup'i dogrulanir.



