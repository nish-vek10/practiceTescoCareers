package com.tesco.careers.pages;

import com.tesco.careers.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAndApplyPage extends Utility {

    private static final Logger log = LogManager.getLogger(SearchAndApplyPage.class.getName());

    public SearchAndApplyPage() {
        PageFactory.initElements(driver, this);
    }

    //Declare locators for each element
    @CacheLookup
    @FindBy(xpath = "//select[@id='JobArea']")
    WebElement selectJobArea;

    @CacheLookup
    @FindBy(xpath = "//select[@id='SelectedFunction']")
    WebElement selectFunction;

    @CacheLookup
    @FindBy(xpath = "//select[@id='Role']")
    WebElement selectRole;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Location']")
    WebElement inputLocation;

    @CacheLookup
    @FindBy(xpath = "//select[@id='Radius']")
    WebElement selectRadius;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Keyword']")
    WebElement inputKeywords;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;

    //Select Job Area from Dropdown Menu
    public void selectJobAreaDropDown(String jobArea) {
        selectByVisibleTextFromDropDown(selectJobArea, jobArea); //call method from Utility class
    }

    //Select Function from Dropdown Menu
    public void selectFunctionDropDown(String function) {
        selectByVisibleTextFromDropDown(selectFunction, function); //call method from Utility class
    }

    //Select Role from Dropdown Menu
    public void selectRoleDropDown(String role) {
        selectByVisibleTextFromDropDown(selectRole, role); //call method from Utility class
    }

    //Enter Town name or Postcode
    public void enterTownOrPostcode(String location) {
        sendTextToElement(inputLocation, location); //call method from Utility class
    }

    //Select Radius from Dropdown Menu
    public void selectRadiusDropDown(String radius) {
        selectByVisibleTextFromDropDown(selectRadius, radius); //call method from Utility class
    }

    //Enter Keywords
    public void enterKeywords(String keywords) {
        sendTextToElement(inputKeywords, keywords); //call method from Utility class
    }

    //Click on Search Button
    public void clickOnSearchButton() {
        clickOnElement(searchButton); //call method from Utility class
    }
}