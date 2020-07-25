package com.cybertec.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PortalPage extends BasePage{
    @FindBy(id = "user-name")
    public WebElement userMenuButton;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[5]")
    public WebElement loginOutButton;

    public void callProfile() throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOf(userMenuButton)).click();
        loginOutButton.click();
        Thread.sleep(3000);
    }

}
