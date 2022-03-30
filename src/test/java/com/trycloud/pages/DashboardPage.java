package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;
import java.util.List;

public class DashboardPage extends BasePage {

        public DashboardPage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        //All modules in mainPage
        @FindBy (xpath = "//ul[@id='appmenu']//li[@data-id]/a")
        public List <WebElement> listsOfWebElement;

}
