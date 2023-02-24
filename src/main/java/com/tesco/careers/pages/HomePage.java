package com.tesco.careers.pages;

import com.tesco.careers.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //Declare locators for each element
    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept and close']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//li[@class='nav_item']")
    List<WebElement> topMenuTabs;

    //Accept and Close cookies
    public void acceptAndCloseCookies() throws InterruptedException {
        acceptCookies.click();
    }

    //Select tab from Top Menu Tabs
    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuTabs) {
            if (menu.getText().equalsIgnoreCase(tab)) {
                clickOnElement(menu);
                break;
            }
        }
    }
}