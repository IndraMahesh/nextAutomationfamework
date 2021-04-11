package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.HeaderPage;
import pageObjects.SearchResultsPage;

public class SearchSteps extends CommonFunctions {

    HeaderPage headerPage=new HeaderPage(driver);
    SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

    @Given("^I'm on home page \"([^\"]*)\"$")
    public void i_m_on_home_page(String url)  {
        driver.get(url);

    }

    @When("^I enter search term \"([^\"]*)\"$")
    public void i_enter_search_term(String searchTerm)  {

        headerPage.enterSearchTerm(searchTerm);
    }

    @When("^I click search icon$")
    public void i_click_search_icon()  {
      headerPage.clickSearchIcon();

    }

    @Then("^I should get relevant result with search heading as \"([^\"]*)\"$")
    public void i_should_get_relevant_result_with_search_heading_as(String searchResultHeading) {
        searchResultsPage.validateSearch(searchResultHeading);
    }

}
