@OfferPage
  Feature: Offer Page
    Background:click Close Button on Gender Page
      Given click Close Button on Gender Page

      Scenario: Check Components on Offer Page
        Given user is on the Offer Page
        Then should see Image on Offer Page
        Then should see Close Button on Offer Page
        Then should see Text: "Yeni ürün ve kampanyaları önce sen öğrenmek ister misin?" on Offer Page
        Then should see Yes Button: "EVET, İSTERİM" on Offer Page