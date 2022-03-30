package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@aria-label='Dashboard' and @class='active']")
    public WebElement dashboardButton;

    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement filesButton;

    @FindBy(xpath = "//a[@aria-label='Photos']")
    public WebElement photosButton;

    @FindBy(xpath = "//a[@aria-label='Activity']")
    public WebElement activityButton;

    @FindBy(xpath = "//a[@aria-label='Talk']")
    public WebElement talkButton;

    @FindBy(xpath = "//a[@aria-label='Contacts']")
    public WebElement contactsButton;

    @FindBy(xpath = "//a[@aria-label='Circles']")
    public WebElement circlesButton;


    @FindBy(xpath = "//a[@aria-label='Calendar']")
    public WebElement calendarButton;

    @FindBy(xpath = "//a[@aria-label='Deck']")
    public WebElement deck;
}
