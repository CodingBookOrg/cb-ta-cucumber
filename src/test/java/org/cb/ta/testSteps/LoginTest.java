package org.cb.ta.testSteps;


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

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String userName, String password) {
        System.out.println("Username:" + userName + " Password:" + password);
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

    @Then("warns")
    public void test2(){}

}
