#2. register.feature
#Insideregister.feature create following scenarios
#1. verifyUserShouldNavigateToRegisterPageSuccessfully
#Click on Register Link
#Verify "Register" text
#2.
#verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
#Click on Register Link
#Click on "REGISTER" button
#Verify the error message "First name is required."
#Verify the error message "Last name is required."
#Verify the error message "Email is required."
#Verify the error message "Password is required."
#Verify the error message "Password is required."
#2. verifyThatUserShouldCreateAccountSuccessfully
#Click on Register Link
#Select gender "Female"
#Enter firstname
#Enter lastname
#Select day
#Select month
#Select year
#Enter email
#Enter password
#Enter Confirm Password
#Click on "REGISTER" button
#Verify message "Your registration completed"
Feature: Register page
  As a user i want to register with nopcommerce website

  @author_Ramya @sanity @smoke @regression
  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    Then I should navigate to Register page successfully

  @author_Ramya @smoke  @regression
  Scenario: Verify that firstname lastname email password and confirm password fields are mandatory
    Given I am on homepage
    When I click on register link
    And I click on register button
    Then I should see the error message "First name is required." in first name field
    And I should see the error message "Last name is required." in last name field
    And I should see the error message "Email is required." in email field
    And I should see the error message "Password is required." in password field
    And I should see the error message "Password is required." in confirm password field

  @author_Ramya  @regression
  Scenario: User should create account successfully
    Given I am on homepage
    When I click on register link
    And I click on female gender
    And I enter first name "Manini"
    And I enter last name "Sheth"
    And I select day
    And I select month
    And I select Year
    And I enter emailId "Prime12345@gmail.com"
    And I enter password "Prime12345" in password field
    And I confirm password "Prime12345"
    And I click on register button
    Then I can see message "Your registration completed"