package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @When("I click on computer tab")
    public void iClickOnComputerTab() {
        //Click on Computer tab
        new HomePage().clickOnMenuTab("Computers");
    }

    @Then("I should navigate to computer page successfully")
    public void iShouldNavigateToComputerPageSuccessfully() {
        //Verify "Computer" text
        Assert.assertEquals(new ComputerPage().getComputerText(), "Computers");
    }

    @And("I click on deskTop tab")
    public void iClickOnDeskTopTab() {
        //Click on Desktops link
        new ComputerPage().clickOnDesktop();
    }

    @Then("I should navigate to desktop page successfully")
    public void iShouldNavigateToDesktopPageSuccessfully() {
        //Verify "Desktops" text
        Assert.assertEquals(new DesktopsPage().getDesktopsText(), "Desktops");

    }

    @And("I click on build your own computer product")
    public void iClickOnBuildYourOwnComputerProduct() {
        //Click on product name "Build your own computer"
        new DesktopsPage().clickOnBuildYourOwnComputer();
    }

    @And("I select {string} processor")
    public void iSelectProcessor(String processor) {
        //Select processor
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I select {string} ram")
    public void iSelectRam(String ram) {
        //Select RAM
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I select {string} hdd")
    public void iSelectHdd(String hdd) {
        //Select HDD
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I select {string} os")
    public void iSelectOs(String os) {
        //Select OS
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("I select {string} software")
    public void iSelectSoftware(String software) {
        //Select software
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I click on add to cart buttone")
    public void iClickOnAddToCartButtone() {
        //Click on add to cart button
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("I see message The product has been added to your shopping cart")
    public void iSeeMessageTheProductHasBeenAddedToYourShoppingCart() {
        //Verify message "The product has been added to your shopping cart"
        Assert.assertEquals(new BuildYourOwnComputerPage().getAddToShoppingCartMessage(), "The product has been added to your shopping cart");
    }

}
