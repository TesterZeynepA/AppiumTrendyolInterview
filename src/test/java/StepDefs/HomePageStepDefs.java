package StepDefs;

import Pages.HomePage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStepDefs {

    HomePage hp = new HomePage(DriverFactory.getDriver());

    @Given("user is on the Home Page")
    public void userIsOnTheHomePage() {
        hp.checkHomePage();
    }


    @When("search for: {string} on Home Page")
    public void searchForOnHomePage(String productName) {
       hp.searchForOnHomePage(productName);
    }
}
