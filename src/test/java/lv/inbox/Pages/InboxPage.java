package lv.inbox.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class InboxPage {

    WebDriver driver;

    By userProfile = By.xpath("//span[@title='test7136@inbox.lv']");
    By logoutButton = By.xpath("//a[@title='Выйти']");

    public InboxPage(WebDriver driver) {

        this.driver = driver;

    }

    public void checkUserMail(){

        WebElement profileUser = driver.findElement(userProfile);
        String mailUser = profileUser.getText();
        Assert.assertEquals("test7136@inbox.lv", mailUser);

    }

    public void clickLogoutButton(){

        driver.findElement(logoutButton).click();

    }

}
