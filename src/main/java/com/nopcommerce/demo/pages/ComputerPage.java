package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    private static final Logger log = Logger.getLogger(ComputerPage.class.getName());
    /*
        Computers text, DesktopsLink, NotebooksLink, SoftwareLink Locators and
    create appropriate methods for it
         */


    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computersText;
    @CacheLookup
    @FindBy(xpath = "//a[text()=' Desktops ']")
    WebElement desktopLink;

    public String getComputerText() {
        log.info("Get computers text" + computersText.toString());
        return getTextFromElement(computersText);
    }

    public void clickOnDesktop() {
        log.info("Click on desktop" + desktopLink.toString());
        clickOnElement(desktopLink);
    }
}
