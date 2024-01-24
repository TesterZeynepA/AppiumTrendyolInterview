@Interview
Feature: E2E Testing
  Background:click Close Button on Gender Page and Offer Page
    Given click Close Button on Gender Page
    Then click Close Button on Offer Page

  Scenario: E2E Test
    Given user is on the Home Page
    When search for: "saat" on Home Page
    When click Product: 7 on Product Page
    When add Product to shoppingCart on Product Detail Page
    Then should see the Product on ShoppingCart Page
    When increase the product by one on shoppingCart Page
    When remove the product from ShoppingCart on ShoppingCart Page
    Then should see Empty Message: "Sepetinizde ürün bulunmamaktadır" on ShoppingCart Page