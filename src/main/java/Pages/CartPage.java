package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    private By cartBtn = By.xpath("//p//a[@href=\"/view_cart\"]");
    private By product = By.xpath("(//div[contains(@class,\"productinfo\")])[1]");
    private By addToCartBtn = By.xpath("//div[@class=\"overlay-content\"]//a[@class=\"btn btn-default add-to-cart\"]");
    private By productName = By.xpath("//a[text()=\"Blue Top\"]");
    private By quantity = By.className("disabled");
    private By xBtn = By.cssSelector("a[data-product-id=\"1\"]");

    public CartPage(WebDriver driver)
    {
        super(driver);
    }
    public void clickCartButton()
    {
        clickElement(cartBtn);
    }
    public void hoverOverProduct() {
        hoverOverElement(product);
    }
    public void clickAddToCartBtn()
    {
        clickElement(addToCartBtn);
    }
    public String checkProductName()
    {
        return getTextOfElement(productName);
    }
    public String checkQuantityOfProduct()
    {
        return getTextOfElement(quantity);
    }
    public void clickXBtn()
    {
        clickElement(xBtn);
    }
    public boolean checkDeleteProduct()
    {
        return isElementDisplay(productName);
    }
}
