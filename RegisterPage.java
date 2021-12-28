package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utilities.Constants;
import com.demo.nopcommerce.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    Utils utils;

    By radioButtonFemale = By.id("gender-female");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By day = By.name("DateOfBirthDay");
    By month = By.name("DateOfBirthMonth");
    By year = By.name("DateOfBirthYear");
    By emailId = By.id("Email");
    By companyName = By.id("Company");
    By newsLetter = By.id("Newsletter");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By computers = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");
    By notebook = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/div/a/img");
    By macBook = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/h2/a");
    By AddToCart = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[9]/div[2]/button");
    By ShoppingCart = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]");
    By Term = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[3]/input");
    By Checkout =By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[4]/button");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        utils = new Utils(driver);

    }
    public String getRegistrationPageTitle() {
        return utils.waitForTitlePresent(Constants.REGISTER_PAGE_TITLE, 10);
    }

    public void registerUser(String fn,String ln, String Date, String Month, String Year,String email, String CompanyName
    ,String pwd, String ConfirmPwd) throws InterruptedException {

        utils.doClick(radioButtonFemale);
        utils.doSendKeys(firstName,fn);
        utils.doSendKeys(lastName,ln);
        utils.selectValueFromDropDown(day,Date);
        Thread.sleep(3000);
        utils.selectValueFromDropDown(month,Month);
        utils.selectValueFromDropDown(year,Year);
        Thread.sleep(3000);
        utils.doSendKeys(emailId,email);
        utils.doSendKeys(companyName,CompanyName);
        utils.doClick(newsLetter);
        utils.doSendKeys(password,pwd);
        utils.doSendKeys(confirmPassword,ConfirmPwd);
        Thread.sleep(3000);
        utils.doClick(registerButton);
        Thread.sleep(3000);
        utils.doClick(computers);
        utils.doClick(notebook);
        Thread.sleep(3000);
        utils.doClick(macBook);
        Thread.sleep(3000);
        utils.doClick(AddToCart);
        utils.doClick(ShoppingCart);
        utils.doClick(Term);
        utils.doClick(Checkout);

    }
}


