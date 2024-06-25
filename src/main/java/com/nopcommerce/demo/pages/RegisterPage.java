package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    private static final Logger log = Logger.getLogger(RegisterPage.class.getName());
    /*
    - Register Text, male female radio, Firstname, lastname, Date of Birth drop
down, email, Password, Confirm Password, Register Button, "First name is required.","Last name
is required.", "Email is required.","Password is required.", "Password is required." error message,
"Your registration completed" message, "CONTINUE" button
Locators and it's actions*/

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameError;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailError;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordError;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;
    @CacheLookup
    @FindBy(id = "gender")
    WebElement genderTab;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement day;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement month;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement year;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registrationComplete;

    public String getRegisterText() {
        log.info("Getting text from : " + registerText.toString());
        return getTextFromElement(registerText);

    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Clicking on register button : " + registerButton.toString());

    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());

    }

    public String getFirstNameErrorMessage() {
        log.info("Getting text from : " + firstNameError.toString());
        return getTextFromElement(firstNameError);
    }

    public String getLastNameErrorMessage() {
        log.info("Getting text from : " + lastNameError.toString());
        return getTextFromElement(lastNameError);

    }

    public String getEmailErrorMessage() {
        log.info("Getting text from : " + emailError.toString());
        return getTextFromElement(emailError);

    }

    public String getPasswordErrorMessage() {
        log.info("Getting text from : " + passwordError.toString());
        return getTextFromElement(passwordError);

    }

    public String getConfirmPasswordError() {
        log.info("Getting text from : " + confirmPasswordError.toString());
        return getTextFromElement(confirmPasswordError);

    }

    public void selectGenderTab() {
        clickOnElement(genderTab);
        log.info("Clicking on gender tab : " + genderTab.toString());

    }

    public void enterFirstName(String fName) {
        log.info("Enter FirstName : " + firstNameField.toString());
        sendTextToElement(firstNameField, fName);

    }

    public void enterLastName(String lastName) {
        log.info("Enter LastName : " + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
    }

    public void selectDay() {
        log.info("Select date" + day.toString());
        selectByIndexFromDropDown(day, 2);
    }

    public void selectMonth() {
        log.info("Select month" + month.toString());
        selectByIndexFromDropDown(month, 4);
    }

    public void selectYear() {
        log.info("Select year" + year.toString());
        selectByIndexFromDropDown(year, 1);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter EmailField : " + emailField.toString());

    }

    public void enterPassword(String pass) {
        sendTextToElement(passwordField, pass);
        log.info("Enter PassWordField : " + passwordField.toString());
    }

    public void confirmPassword(String confirm) {
        sendTextToElement(confirmPasswordField, confirm);
        log.info("Enter ConfirmPassWordField : " + confirmPasswordField.toString());
    }

    public String getRegistrationCompletedMessage() {
        log.info("Get registration Message : " + registrationComplete.toString());
        return getTextFromElement(registrationComplete);

    }
}