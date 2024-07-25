package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepdefs {

    @Given("I launch the {string} application")
    public void iLaunchTheApplication(String arg0) {
        System.out.println("Amazon application launched");
    }

    @When("I log into the application with valid credentials")
    public void iLogIntoTheApplicationWithValidCredentials() {
        System.out.println("I logged into the application");
    }

    @Then("I see the home page")
    public void iSeeTheHomePage() {
        System.out.println("I can see the home page");
    }
}
