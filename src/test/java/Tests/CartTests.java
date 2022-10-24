package Tests;

import Pages.CartPage;
import Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest{
    @Test (priority = 0)
    public void checkQuantityOfProduct()
    {
        CartPage cartPage = new CartPage(driver);
        cartPage.hoverOverProduct();
        cartPage.clickAddToCartBtn();
        cartPage.clickCartButton();
        Assert.assertEquals(cartPage.checkProductName(),"Blue Top");
        Assert.assertEquals(cartPage.checkQuantityOfProduct(),"1");


    }
    @Test (priority = 1)
    public void testDeleteProduct()
    {
        CartPage cartPage = new CartPage(driver);
        cartPage.hoverOverProduct();
        cartPage.clickAddToCartBtn();
        cartPage.clickCartButton();
        cartPage.clickXBtn();
        Assert.assertNotEquals(cartPage.checkDeleteProduct(),"Blue Top");

    }
}
