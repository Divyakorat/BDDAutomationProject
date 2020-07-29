package org.example;

import org.openqa.selenium.By;

public class HomePage extends Util{
    private By _NopCommerce=By.xpath("//img[@alt=\"nopCommerce demo store\"]");
    //path to click on registration button
    private By _registerButton = By.xpath("//a[@href=\"/register?returnUrl=%2F\"]");
    //creating method to verify user is on homepage
    public void verifyUserIsOnHomePage()
    {
        clickOnElement(_NopCommerce);
    }
    //creating method to click on register button
    public void clickOnRegisterButton()
    {   //click on registrer button
        clickOnElement(_registerButton);

    }
}
