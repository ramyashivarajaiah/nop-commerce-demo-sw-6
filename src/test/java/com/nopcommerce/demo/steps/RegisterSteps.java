package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        //Click on Register Link
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should navigate to Register page successfully")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        //Verify "Register" text
        String expectedText = "Register";
        String actualText = new RegisterPage().getRegisterText();
        Assert.assertEquals(actualText, expectedText);
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        //Click on "REGISTER" button
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the error message {string} in first name field")
    public void iShouldSeeTheErrorMessageInFirstNameField(String arg0) {
        //Verify the error message "First name is required."
        String expectedText = "First name is required.";
        String actualText = new RegisterPage().getFirstNameErrorMessage();
        Assert.assertEquals(actualText, expectedText);
    }

    @And("I should see the error message {string} in last name field")
    public void iShouldSeeTheErrorMessageInLastNameField(String arg0) {
        //Verify the error message "Last name is required."
        String expectedText = "Last name is required.";
        String actualText = new RegisterPage().getLastNameErrorMessage();
        Assert.assertEquals(actualText, expectedText);
    }

    @And("I should see the error message {string} in email field")
    public void iShouldSeeTheErrorMessageInEmailField(String arg0) {
        //Verify the error message "Email is required."
        String expectedText = "Email is required.";
        String actualText = new RegisterPage().getEmailErrorMessage();
        Assert.assertEquals(actualText, expectedText);
    }

    @And("I should see the error message {string} in password field")
    public void iShouldSeeTheErrorMessageInPasswordField(String arg0) {
        //Verify the error message "Password is required."
        String expectedText = "Password is required.";
        String actualText = new RegisterPage().getConfirmPasswordError();
        Assert.assertEquals(actualText, expectedText);
    }

    @And("I should see the error message {string} in confirm password field")
    public void iShouldSeeTheErrorMessageInConfirmPasswordField(String arg0) {
        //Verify the error message "Password is required."
        String expectedText = "Password is required.";
        String actualText = new RegisterPage().getConfirmPasswordError();
        Assert.assertEquals(actualText, expectedText);
    }

    @And("I click on female gender")
    public void iClickOnFemaleGender() {
        //Select gender "Female"
        new RegisterPage().selectGenderTab();
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        //Enter firstname
        new RegisterPage().enterFirstName(firstName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lastName) {
        //Enter lastname
        new RegisterPage().enterLastName(lastName);
    }

    @And("I select day")
    public void iSelectDay() {
        //Select day
        new RegisterPage().selectDay();
    }

    @And("I select month")
    public void iSelectMonth() {
        //Select month
        new RegisterPage().selectMonth();
    }

    @And("I select Year")
    public void iSelectYear() {
        //Select year
        new RegisterPage().selectYear();
    }

    @And("I enter emailId {string}")
    public void iEnterEmailId(String email) {
        //Enter email
        new RegisterPage().enterEmail(email);
    }

    @And("I enter password {string} in password field")
    public void iEnterPasswordInPasswordField(String password) {
        //Enter password
        new RegisterPage().enterPassword(password);
    }

    @And("I confirm password {string}")
    public void iConfirmPassword(String confirmPassword) {
        //Enter Confirm Password
        new RegisterPage().confirmPassword(confirmPassword);
    }

    @Then("I can see message {string}")
    public void iCanSeeMessage(String arg0) {
        //Verify message "Your registration completed"
        String expectedText = "Your registration completed";
        String actualText = new RegisterPage().getRegistrationCompletedMessage();
        Assert.assertEquals(actualText, expectedText);
    }
}
