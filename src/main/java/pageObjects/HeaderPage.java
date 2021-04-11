package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
    public static WebDriver driver;
    public static String menu;
    public HeaderPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    @FindBy(id="sli_search_1")
    public WebElement searchTxtFld;

    @FindBy(xpath="//*[@id=\"newsearch\"]/input[4]")
    public WebElement searchIcon;

    public void enterSearchTerm(String searchTerm)
    {
        searchTxtFld.sendKeys(searchTerm);
    }

    public void clickSearchIcon()
    {
        searchIcon.click();
    }

    public void clickOnMenu(String userMenu)
    {
        ////div/ul/li/a[@data-toggle='tab' and normalize-space(text())='Women']
        driver.findElement(By.xpath("//div/ul/li/a[@data-toggle='tab' and normalize-space(text())='"+userMenu+"']")).click();
        menu=userMenu;
    }

    public void clickOnSubmenu(String userSubmenu)
    {
        driver.findElement(By.xpath("")).click();
    }

    public void clickonOption(String optionValue)
    {
        driver.findElement(By.xpath("")).click();
    }
}
