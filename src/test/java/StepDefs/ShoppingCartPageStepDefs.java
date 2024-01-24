package StepDefs;

import Pages.ShoppingCartPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartPageStepDefs {

    ShoppingCartPage scp = new ShoppingCartPage(DriverFactory.getDriver());

    @Then("should see the Product on ShoppingCart Page")
    public void shouldSeeTheProductOnShoppingCartPage() {
        scp.checkProductOnShoppingCartPage();
    }

    @When("increase the product by one on shoppingCart Page")
    public void increaseTheProductByOneOnShoppingCartPage() {
        scp.increaseProductByOne();
    }

    @When("remove the product from ShoppingCart on ShoppingCart Page")
    public void removeTheProductFromShoppingCartOnShoppingCartPage() {
        scp.removeTheProductFromShoppingCart();
    }

    @Then("should see Empty Message: {string} on ShoppingCart Page")
    public void shouldSeeEmptyMessageOnShoppingCartPage(String expectedText) {
        scp.checkEmptyMessage(expectedText);
    }
}
