package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    private static final Logger log = Logger.getLogger(DesktopsPage.class.getName());
    /*
        Desktops text, Sortby, Display, selectProductList Locators and it's actions
         */
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopText;
    @CacheLookup
    @FindBy(linkText = "Build your own computer")
    WebElement buildYourOwnComputer;

    public String getDesktopsText() {
        log.info("Get desktop text" + desktopText.toString());
        return getTextFromElement(desktopText);
    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);
        log.info("Clicking on build your own computer link : " + buildYourOwnComputer.toString());

    }
}
