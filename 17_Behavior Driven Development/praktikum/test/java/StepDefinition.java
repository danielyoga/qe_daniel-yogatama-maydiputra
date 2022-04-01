import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
    @Given("Linkedin Login Page")
    public void loginPage() {
        System.out.println("Step 1 : I'm on Linkedin Login Page");
    }

    @When("I enter email and password")
    public void input() {
        System.out.println("Step 2 : Enter email and password");
    }

    @Then("Page redirected to Homepage")
    public void redirecting() {
        System.out.println("Step 3 : I'm on Linkedin Home Page\"");
    }

    @And("I'm succesfully logged in")
    public void succesLogin() {
        System.out.println("Step 4 : I'm logged in to my Linkedin account");
    }

    @Given("I'm on Linkedin Home Page")
    public void OnHomePage() {
        System.out.println("Step 1 : I'm on Linkedin Home Page");
    }

    @When("I enter {string} on search textbox")
    public void SearchJobs(String jobTitle) {
        System.out.println("Step 2 : Search Jobs with title " + jobTitle);
    }

    @Then("Page show search result of {string} with job title")
    public void searchJob(String JobTitle) {
        System.out.println("Step 3: " + JobTitle + " Jobs is displayed");
    }

    @When("I press notification page icon")
    public void clickNotification() {
        System.out.println("Step 2 : Click Notification Page Icon");
    }
    @Then("Page redirected to Notification Page")
    public void notificationPage() {
        System.out.println("Step 3 : Page Redirected to Notificaton Page");
    }

} // step def