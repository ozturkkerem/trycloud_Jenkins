package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US_03_user_access_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        loginPage.loginInput.sendKeys(ConfigurationReader.getProperty("userName1"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.logInButton.click();
    }

    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModules) {

        BrowserUtils.hover(dashboardPage.dashboardButton);
        BrowserUtils.waitForVisibility(dashboardPage.dashboardButton,10);

        List <String> actualModules= new ArrayList<>();


        for (WebElement element : dashboardPage.listsOfWebElement) {
            System.out.println(element.getAttribute("aria-label"));

            actualModules.add(element.getText());

        }

        Assert.assertEquals(expectedModules,actualModules);



    }



}
