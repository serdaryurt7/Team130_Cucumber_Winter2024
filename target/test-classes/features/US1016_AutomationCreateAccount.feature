Feature: US1016 Kullanici yeni kayit olusturur

  @wip
  Scenario: TC24 kullanici kayit olusturabilmeli

    Given kullanici "automationUrl" anasayfaya gider
    And user sign up linkine tiklar
    And user Create and account bölümüne email adresi girer
    And signUp butonuna basar
    And user kisiel bilgilerini ve iletisim bilgilerini girer
    And user Create Account butonuna basar
    Then hesap olustugunu test edin
    And sayfayi kapatir
    