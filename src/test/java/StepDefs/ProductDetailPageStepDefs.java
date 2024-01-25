package StepDefs;

import Pages.ProductDetailPage;
import Utils.DriverFactory;
import io.cucumber.java.en.When;

public class ProductDetailPageStepDefs {

    ProductDetailPage pdp = new ProductDetailPage(DriverFactory.getDriver());

    @When("add Product to shoppingCart on Product Detail Page")
    public void addProductToShoppingCartOnProductDetailPage() {

        pdp.addProductToShoppingCart();
    }

    @When("click ShoppingCart on Product Detail Page")
    public void clickShoppingCartOnProductDetailPage() {
        pdp.clickShoppingCartIcon();
    }
}
