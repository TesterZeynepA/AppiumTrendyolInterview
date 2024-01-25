@Interview
Feature: E2E Testing
  Background:click Close Button on Gender Page and Offer Page
    Given click Close Button on Gender Page
    Then click Close Button on Offer Page
"""
Trendyolda Anasayfada iken "saat" araması yap
Çıkan ürünlerden 7. ürünün sayfasını aç
Ürünü sepete ekle
Ürünün sepete geldiğini doğrula
Ürün sepetteyken miktarını 1 artır
Ürünü tamamen sepetten sil
Sepette ürün kalmadığını doğrula
"""
  Scenario: E2E Test
    Given user is on the Home Page
    When search for: "saat" on Home Page
    When click Product: 7 on Product Page
    When add Product to shoppingCart on Product Detail Page
    When  click ShoppingCart on Product Detail Page
    Then should see the Product on ShoppingCart Page
    When increase the product by one on shoppingCart Page
    When remove the product from ShoppingCart on ShoppingCart Page
    Then should see Empty Message: "Sepetinizde ürün bulunmamaktadır" on ShoppingCart Page

    """
1. click CloseButton Gender
2.click CloseButton Offer
3. HomePagedeki popup kapat
4. click searchBox
5. search saat
6. sonuclar popup kapat
7. 7. ürüne kadar scrollDown yap ve clickle
8. click sepete ekle
9. NavigationBar da sepet ikonuna tıklayarak sepete git
10.ürünün geldiğini doğrula
11. Plus butonuna tıklayarak ürünün adedini 1 artır
12. çöp ikonuna tıkla
13. ikinci çıkan çöp elemente tıkla
14. "Sepetinizde ürün bulunmamaktadır" mesajının görüldüğünü doğrula
"""