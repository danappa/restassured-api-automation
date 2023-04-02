package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginrestSteps {

@Given("application is on login page")
public void application_is_on_login_page() {
	WebDriver driver=new ChromeDriver();
    // Write code here that turns the phrase above into concrete actions
}

@When("application enter the credential")
public void application_enter_the_credential() {
    // Write code here that turns the phrase above into concrete actions
}

@Then("Login sucessfull")
public void login_sucessfull() {
    // Write code here that turns the phrase above into concrete actions
}

}
