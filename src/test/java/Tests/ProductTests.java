package Tests;

import Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTests extends BaseTest{
    @Test (priority = 0)
    public void testProductsContainKeyword()
        {
            ProductPage productPage = new ProductPage(driver);
            productPage.typeInSearchField("kids");
            productPage.clickSearchButton();
            productPage.checkRelatedKeyword().equalsIgnoreCase("kids");
            Assert.assertTrue(productPage.checkRelatedKeyword().contains("Kids"));
        }
        @Test (priority = 1)
    public void testVisibilityOfErrorMsg()
        {
            ProductPage productPage = new ProductPage(driver);
            productPage.typeInSearchField("glasses");
            productPage.clickSearchButton();
            Assert.assertNotEquals(productPage.checkInvisibilityOfErrorMessage(),"There is no results related to this search keyword");
        }

}
