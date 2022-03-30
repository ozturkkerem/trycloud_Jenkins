package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Username or email']")
    public WebElement loginInput;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy (xpath = "//input[@value='Log in' and @id='submit-form']")
    public WebElement logInButton;

}
