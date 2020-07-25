package com.cybertec.pages;

import com.cybertec.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(css = "input[name='USER_LOGIN']")
    private WebElement loginInput;

    @FindBy(css = "input[name='USER_PASSWORD']")
    private WebElement passwordInput;

    @FindBy(css = "input[type='submit']")
    private WebElement LogInButton;

    public void getLogin(String login,String password) throws InterruptedException {
   Thread.sleep(3000);
    loginInput.clear();
    wait.until(ExpectedConditions.visibilityOf(loginInput)).sendKeys(login);
    wait.until(ExpectedConditions.visibilityOf(passwordInput)).sendKeys(password);
    LogInButton.click();
    }

}