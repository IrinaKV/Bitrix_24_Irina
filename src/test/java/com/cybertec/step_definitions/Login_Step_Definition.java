package com.cybertec.step_definitions;

import com.cybertec.pages.LoginPage;
import com.cybertec.utilities.ConfigurationReader;
import com.cybertec.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Step_Definition {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User log in with  {string} and {string}")
    public void user_log_in_with_and(String login, String password) {
        wait.until(ExpectedConditions.visibilityOf(loginPage.loginInput)).sendKeys(login);
        wait.until(ExpectedConditions.visibilityOf(loginPage.passwordInput)).sendKeys(password);
        loginPage.LogInButton.click();
    }
    @Then("User should see the title")
    public void user_should_see_the_title() {
        String expectedTitle ="Portal";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
