package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        //Click on login link
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        //verify that "Welcome, Please Sign In!" message display
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        //Enter EmailId
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        //Enter Password
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        //Click on Login Button
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see error message {string}")
    public void iShouldSeeErrorMessage(String errorMessage) {
        //Verify that the Error message
        Assert.assertEquals(new LoginPage().getErrorMessage(), errorMessage);
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
        //Verify that LogOut link is display
        String expectedText = "Log out";
        String actualText = new LoginPage().getLogoutLinkText();
        Assert.assertEquals(actualText, expectedText);
    }

    @And("I click on logout button")
    public void iClickOnLogoutButton() {
        //Click on LogOut Link
        new HomePage().clickOnLogOutLink();
    }

    @Then("I should logout successfully")
    public void iShouldLogoutSuccessfully() {
        //Verify that LogIn Link Display
        String expectedText = "Log in";
        String actualText = new HomePage().getLogInLinkText();
        Assert.assertEquals(actualText, expectedText);
    }
}
