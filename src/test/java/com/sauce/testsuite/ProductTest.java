package com.sauce.testsuite;

import com.sauce.pages.LoginPage;
import com.sauce.pages.ProductPage;
import com.sauce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {
    ProductPage productPage;    //  LoginTest loginTest = new LoginTest();
    LoginPage loginpage;
@BeforeMethod(alwaysRun = true)
public void inIt(){
    loginpage = new LoginPage();
    productPage= new ProductPage();
}
    @Test(groups = {"smoke","regression"})
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginpage.enterUsername("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnLoginButton();
        Assert.assertEquals(productPage.getProductText(),"Products");
        String productPerPage = "6";

        Assert.assertEquals(productPage.getProductsPerPage(),productPerPage);


    }

}
