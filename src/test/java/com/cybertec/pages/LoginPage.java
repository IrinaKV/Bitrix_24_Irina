package com.cybertec.pages;

import com.cybertec.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(css = "input[name='USER_LOGIN']")
    public WebElement loginInput;

    @FindBy(css = "input[name='USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy(css = "input[type='submit']")
    public WebElement LogInButton;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
