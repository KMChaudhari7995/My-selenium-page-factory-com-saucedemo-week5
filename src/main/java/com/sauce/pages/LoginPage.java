package com.sauce.pages;

import com.aventstack.extentreports.Status;
import com.sauce.customlisteners.CustomListeners;
import com.sauce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(id = "user-name")
    WebElement usernameField;
    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productText;



   /* By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginLink = By.id("login-button");
    By productText = By.xpath("//span[@class='title']");*/

    public void enterUsername(String username){
        sendTextToElement(usernameField,username);
        CustomListeners.test.log(Status.PASS,"Username"+username);

    }

    public void enterPassword(String password)
    {
        sendTextToElement(passwordField,password);
        CustomListeners.test.log(Status.PASS,"Password"+password);

    }

    public void clickOnLoginButton(){

        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS,"Click on LoginButton"+loginLink);

    }

    public String getProductText(){
        CustomListeners.test.log(Status.PASS,"message"+productText);
        return  getTextFromElement(productText);


    }

}
