package lv.inbox.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This class will store all the locators for inbox.lv web page.
 */

public class LoginPage {

    WebDriver driver;

    By username = By.xpath("//input[@id='imapuser']");
    By password = By.xpath("//input[@id='pass']");
    By loginButton = By.xpath("//button[@type='submit' and @id='btn_sign-in']");
    //By advertisment = By.xpath()


    public LoginPage(WebDriver driver) {

        this.driver = driver;

    }

    //public void clickOnAdvertisment(){

       // driver.findElement(())

   // }

    public void typeUserName() {

        driver.findElement(username).sendKeys("test7136");

    }

    public void typePassword() {

        driver.findElement(password).sendKeys("cocacola3");

    }

    public void clickOnLoginButton(){

        driver.findElement(loginButton).click();

    }

    public void quitBrowser(){

        driver.quit();

    }

}
