package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{
    private By searchField = By.id("search_product");
    private By searchBtn = By.id("submit_search");
    private By searedProduct = By.className("productinfo");
    private By errorMsg = By.cssSelector("div[style=\"height: auto !important;\"]");

    public ProductPage(WebDriver driver)
    {
        super(driver);
    }
    public void typeInSearchField(String productKeyword)
    {
        typeInInputField(searchField,productKeyword);
    }
    public void clickSearchButton()
    {
        clickElement(searchBtn);
    }
    public String checkRelatedKeyword()
    {
        return getTextOfElement(searedProduct);
    }
    public boolean checkInvisibilityOfErrorMessage()
    {
        return isElementDisplay(errorMsg);
    }
}
