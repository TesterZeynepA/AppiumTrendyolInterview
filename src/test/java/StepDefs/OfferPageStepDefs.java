package StepDefs;

import Pages.OfferPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OfferPageStepDefs {

    OfferPage op = new OfferPage(DriverFactory.getDriver());

    @Then("should see Offer Page")
    public void shouldSeeOfferPage() {
        op.checkOfferPage();
    }

    @Given("user is on the Offer Page")
    public void userIsOnTheOfferPage() {
        op.checkOfferPage();
    }

    @Then("should see Image on Offer Page")
    public void shouldSeeImageOnOfferPage() {
        op.checkImage();
    }

    @Then("should see Close Button on Offer Page")
    public void shouldSeeCloseButtonOnOfferPage() {
        op.checkCloseButton();
    }

    @Then("should see Text: {string} on Offer Page")
    public void shouldSeeTextOnOfferPage(String expectedText) {
        op.checkText(expectedText);
    }

    @Then("should see Yes Button: {string} on Offer Page")
    public void shouldSeeYesButtonOnOfferPage(String expectedText) {
        op.checkYesButton(expectedText);
    }

    @Then("click Close Button on Offer Page")
    public void clickCloseButtonOnOfferPage() {
        op.clickCloseButton();
    }
}
