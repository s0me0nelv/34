package lv.inbox.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class will store all the locators for inbox.lv web page.
 */

public class LoginPageFactory {

    WebDriver driver;

    public LoginPageFactory(WebDriver ldriver){

        this.driver = ldriver;

    }


    @FindBy(xpath = "//input[@id='imapuser']")
    WebElement username;

    @FindBy(how = How.XPATH, using = "//input[@id='pass']")
    WebElement password;

    @FindBy(how = How.XPATH, using = "//button[@type='submit' and @id='btn_sign-in']")
    WebElement loginButton;


    public void loginToInbox(String uid, String pass) {


        username.sendKeys(uid);
        password.sendKeys(pass);
        loginButton.click();


    }


}
