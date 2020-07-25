package com.cybertec.pages;
import com.cybertec.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

//2 commit
public class BasePage {

    BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait= new WebDriverWait(Driver.getDriver(), 5);


    
}