package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    public SearchResultsPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[@id=\"ResultHeader\"]/div[1]/h1/div")
    public WebElement searchResultHeading;

    public void validateSearch(String searchHeadingExpected)
    {
        Assert.assertEquals(searchHeadingExpected,searchResultHeading.getText());
    }

}
