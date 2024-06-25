package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = Logger.getLogger(BuildYourOwnComputerPage.class.getName());
    /*
    Build your own computer Text, Processor Drop Down, Ram
drop down, HDD radios, os radio, software check boxes, Add To Card button, "The product has
been added to your shopping cart" message locators and it's actions
     */

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramDropDown;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement addToShoppingCartMessage;



    public String getBuildYourOwnComputerText() {
        log.info("Getting Build your own computer text" + buildYourOwnComputerText.toString());
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectProcessor(String processor) {
        selectByVisibleTextFromDropDown(processorDropDown, processor);
        log.info("Select Processor" + processorDropDown.toString());

    }

    public void selectRam(String ram) {
        selectByVisibleTextFromDropDown(ramDropDown,ram);
        log.info("Select ram" + ramDropDown.toString());
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("Clicking on add to cart button : " + addToCart.toString());

    }

    public String getAddToShoppingCartMessage() {
        log.info("Get add to cart text" + addToShoppingCartMessage.toString());
        return getTextFromElement(addToShoppingCartMessage);

    }

    public void selectHDD(String hdd) {
        log.info("Select HDD");
        clickOnElement(By.xpath("//input[@name='product_attribute_3']/following-sibling::label[text()='" + hdd + "']"));
    }

    public void selectOs(String os) {
        log.info("Select OS");
        clickOnElement(By.xpath("//input[@name='product_attribute_4']/following-sibling::label[contains(text(),'" + os + "')]"));
    }

    public void selectSoftware(String software) {
        log.info("Select Software");
        clickOnElement(By.xpath("//input[@name='product_attribute_5']/following-sibling::label[contains(text(),'" + software + "')]"));
    }

}
