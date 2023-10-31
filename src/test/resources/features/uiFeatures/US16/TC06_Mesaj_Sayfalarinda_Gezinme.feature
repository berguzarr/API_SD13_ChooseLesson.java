@US16
Feature: US16 Mesaj Sayfalarinda Gezinme

  Background: Login olunur.
    Given Kullanici login e tiklar
    When Username kutusuna "V.Dean.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar

  Scenario: TC06_Sonraki_Sayfadaki_Mesajlari_goruntuleme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    And Next page butonuna tiklar
    Then Sonraki Sayfaya gidildigini dogrular
    And Gidilen sayfadaki mesajlarin goruntulendigini dogrular

  Scenario: TC07_En_Son_Sayfadaki_Mesajlari_goruntuleme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    And Last page butonuna tiklar
    Then En Son sayfaya gidildigini dogrular
    Then Gidilen sayfadaki mesajlarin goruntulendigini dogrular

  Scenario: TC08_Sonraki_Sayfadaki_Mesajlari_goruntuleme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    And Last page butonuna tiklar
    And Onceki page butonuna tiklar
    Then Onceki sayfaya gidildigini dogrular
    Then Gidilen sayfadaki mesajlarin goruntulendigini dogrular

  Scenario: TC09_Önceki_Sayfadaki_Mesajlari_goruntuleme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    And Last page butonuna tiklar
    And First page butonuna tiklar
    Then First page de oldugunu dogrular
    Then Gidilen sayfadaki mesajlarin goruntulendigini dogrular

  @smoketest
  Scenario: TC10_1_Mesaj_Sayfalarinda_gezinme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then First page de oldugunu dogrular
    When Next page butonuna tiklar
    Then Sonraki Sayfaya gidildigini dogrular
    Then Gidilen sayfadaki mesajlarin goruntulendigini dogrular
    When Last page butonuna tiklar
    Then En Son sayfaya gidildigini dogrular
    Then Gidilen sayfadaki mesajlarin goruntulendigini dogrular
    When Onceki page butonuna tiklar
    Then Onceki sayfaya gidildigini dogrular
    Then Gidilen sayfadaki mesajlarin goruntulendigini dogrular
    When First page butonuna tiklar
    Then First page de oldugunu dogrular
    Then Gidilen sayfadaki mesajlarin goruntulendigini dogrular