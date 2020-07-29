package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Util
{
    LoadProp loadProp = new LoadProp();

    //path for first name field
    private By _firstName=  By.xpath("//input[@id=\"FirstName\"]");
    //path for last name field
    private By _lastName= By.xpath("//input[@id=\"LastName\"]");
    //path for date of birth field
    private By _dateOfBirthday = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    //path for date of month field
    private By _dateOfMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    //path for date of year field
    private By _dateOfYear=By.xpath("//select[@name=\"DateOfBirthYear\"]");
    //path for email field
    private By _emailField=By.id("Email");
    //path for company field
    private By _company = By.xpath("//input[@id=\"Company\"]");
    //path for password field
    private By _password= By.xpath("//input[@id=\"Password\"]");
    //path for confirm password field
    private By _confirmPassword=By.xpath("//input[@id=\"ConfirmPassword\"]");
    //path for submit button
    private By _submit= By.xpath("//input[1][@type=\"submit\"]");
    //storing email
    String email="divyapatel"+timestamp()+"@gmail.com";
    private String firstName = loadProp.getProperty("FirstName");
    //created method
    public void userEnterRegistrationDetails()
    {//entering first name
        typeText(_firstName,firstName);
        //enterinf last name
        typeText(_lastName,loadProp.getProperty("LastName"));
        //selecting date of birth
        selectFromDropDownByTextvalue(_dateOfBirthday,"16");
        //selecting date of month
        selectFromDropDownByVisibleText(_dateOfMonth,"May");
        //selecting date of the year
        selectFromDropDownByVisibleText(_dateOfYear,"1983");
        //entering email address
        typeText(_emailField,email);
        //entering company name
        typeText(_company,loadProp.getProperty("CompanyName"));
        //entering  password
        typeText(_password,loadProp.getProperty("Password"));
        //entering confirm password
        typeText(_confirmPassword,loadProp.getProperty("ConfirmPassword"));
    }
    //created method
    public void userClickOnRegisterSubmitButton()
    {   //using explicity wait
        waituntilElementIsclickable(_submit ,5);
        //click on submit button
        clickOnElement(_submit);
    }
}

