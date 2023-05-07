package com.sauce.testsuite;

import com.sauce.pages.LoginPage;
import com.sauce.pages.ProductPage;
import com.sauce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginpage;
    ProductPage productPage;

@BeforeMethod(alwaysRun = true)
public void inTt(){
     loginpage = new LoginPage();

    productPage = new ProductPage();
}

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldSuccessfullyWithValidCredentials(){
        loginpage.enterUsername("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnLoginButton();
        Assert.assertEquals(productPage.getProductText(),"Products");

    }
}
