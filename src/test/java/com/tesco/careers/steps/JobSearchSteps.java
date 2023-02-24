package com.tesco.careers.steps;

import com.tesco.careers.pages.HomePage;
import com.tesco.careers.pages.SearchAndApplyPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobSearchSteps {

    HomePage homePage = new HomePage();
    SearchAndApplyPage searchAndApplyPage = new SearchAndApplyPage();

    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }

    @When("^User clicks on Accept Cookies$")
    public void userClicksOnAcceptCookies() throws InterruptedException {
        homePage.acceptAndCloseCookies(); //Click on accept and close cookies
    }

    @And("^User clicks on Search And Apply from top menu Tabs$")
    public void userClicksOnSearchAndApplyFromTopMenuTabs() {
        homePage.clickOnMenuTab("Search and Apply"); //Click on tab menu
    }


    @And("^User selects Job Area from dropdown menu \"([^\"]*)\"$")
    public void userSelectsJobAreaFromDropdownMenu(String jobArea)  {
       searchAndApplyPage.selectJobAreaDropDown(jobArea); //Select from dropdown
    }

    @And("^User selects Function from dropdown menu \"([^\"]*)\"$")
    public void userSelectsFunctionFromDropdownMenu(String function) {
        searchAndApplyPage.selectFunctionDropDown(function); //Select from dropdown
    }

    @And("^User selects Role from dropdown menu \"([^\"]*)\"$")
    public void userSelectsRoleFromDropdownMenu(String role)  {
        searchAndApplyPage.selectRoleDropDown(role); //Select from dropdown
    }

    @And("^User enters Town or Postcode \"([^\"]*)\"$")
    public void userEntersTownOrPostcode(String location)  {
        searchAndApplyPage.enterTownOrPostcode(location); //Enter location
    }

    @And("^And User selects Radius from dropdown menu \"([^\"]*)\"$")
    public void andUserSelectsRadiusFromDropdownMenu(String radius)  {
        searchAndApplyPage.selectRadiusDropDown(radius); //Select from dropdown
    }

    @And("^User enters Keywords \"([^\"]*)\"$")
    public void userEntersKeywords(String keywords) {
        searchAndApplyPage.enterKeywords(keywords); //Enter keywords
    }

    @And("^User clicks on Search button$")
    public void userClicksOnSearchButton() {
        searchAndApplyPage.clickOnSearchButton(); //Click on Search button
    }

    @Then("^User should verify the Header Text \"([^\"]*)\"$")
    public void userShouldVerifyTheHeaderText(String arg0) {

    }
}
