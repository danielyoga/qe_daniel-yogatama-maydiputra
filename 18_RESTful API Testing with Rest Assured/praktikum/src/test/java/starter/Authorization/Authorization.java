package starter.Authorization;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;

public class Authorization {

    @Step("Authorization Modals View")
    public void modalsView() {
        System.out.println("Step 1 : I'm on Authorization Modals View");
    }
    @Step("I enter username and password")
    public void enterCredentials() {
        System.out.println("Step 2 : Enter username and password");
    }
    @Step("Click Authorize Button")
    public void clickAuthorize() {
        System.out.println("Step 3 : Click Authorize Button");
    }
    @Step("Credentials Authorized with corresponding username and password")
    public void authorized() {
        System.out.println("Step 4 : Username and Password is authorized to access API");
    }
}
