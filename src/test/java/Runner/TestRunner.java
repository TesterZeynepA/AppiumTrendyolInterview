package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepDefs", "Utils"},
        tags = "@E2E",
        dryRun = false,
        plugin = {
                "pretty",
                "summary",
                "html:target/reports/cucumber-report.html"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
/*
*Trendyolda Anasayfada iken "saat" araması yap
Çıkan ürünlerden 7. ürünün sayfasını aç
Ürünü sepete ekle
Ürünün sepete geldiğini doğrula
Ürün sepetteyken miktarını 1 artır
Ürünü tamamen sepetten sil
Sepette ürün kalmadığını doğrula
*  */

/*
1.click closeButton Gender
2.click closeButton Offer
3.HomePagedeki popup kapat
4.click searchBox
5.search saat
6.sonuçlar popupı kapat
7. 7. ürüne kadar scrollDown yap ve clickle
8.click Sepete Ekle
9.NavigationBarda sepet ikonuna tıklayarak sepete git
10.Ürünün geldiğini doğrula
11. Plus butonuna tıklayarak ürünün adedini 1 artır
12.Çöp ikonuna tıkla
13.İkinci çıkan çöp elemente tıkla
14."Sepetininizde ürün bulunmamaktadır" mesajının görüldüğünü doğrula.
 */