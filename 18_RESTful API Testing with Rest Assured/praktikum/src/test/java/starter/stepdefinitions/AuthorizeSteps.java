package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authorization.Authorization;

public class AuthorizeSteps {
    @Steps
    Authorization authorization;

    @Given("Authorization Modals View")
    public void modalsView() {
        authorization.modalsView();
    }
    @When("I enter username and password")
    public void enterCredentials() {
        authorization.enterCredentials();
    }
    @And("Click Authorize Button")
    public void clickAuthorize() {
        authorization.clickAuthorize();
    }
    @Then("Credentials Authorized with corresponding username and password")
    public void authorized() {
        authorization.authorized();
    }
}