package org.cb.ta;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertTrue;

public class LoginTest {
    @Given("User is on login screen")
    public void User_is_on_login_screen() {
        assertTrue(true);
    }

    @When("User enters valid username")
    public void user_enters_valid_username() {
       assertTrue(true);
    }

    @And("valid password")
    public void valid_password() {
        assertTrue(true);
    }

    @And("Clicks on log in button")
    public void clicks_on_log_in_button() {
        assertTrue(true);
    }

    @Then("She lands to dashboard page")
    public void she_lands_to_dashboard_page() {
        assertTrue(true);
    }

    @When("User enters invalid username")
    public void test1(){}

    @Then("warns")
    public void test2(){}

}
