package StepDefs;

import Pages.ProductPage;
import Utils.DriverFactory;
import io.cucumber.java.en.When;

public class ProductPageStepDefs {

    ProductPage pp = new ProductPage(DriverFactory.getDriver());

    @When("click Product: {int} on Product Page")
    public void clickProductOnProductPage(int productNumber) {

        pp.clickProductOnProductPage(productNumber);
    }
}
