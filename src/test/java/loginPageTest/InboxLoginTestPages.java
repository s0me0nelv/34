package loginPageTest;

import lv.inbox.Pages.InboxPage;
import lv.inbox.Pages.LoginPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class InboxLoginTestPages {


    @Test
    public void varifyValidLogin() {

        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.inbox.lv");

        LoginPage login = new LoginPage(driver);

        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();

        InboxPage check = new InboxPage(driver);
        check.checkUserMail();
        check.clickLogoutButton();

        login.quitBrowser();

    }

}


