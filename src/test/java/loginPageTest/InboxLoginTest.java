package loginPageTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class InboxLoginTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.inbox.lv");
    }

    @Test
    public void userLogin() {

        WebElement loginField = driver.findElement(By.xpath("//input[@id='imapuser']"));
        loginField.sendKeys("test7136");
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='pass']"));
        passwordField.sendKeys("cocacola3");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit' and @id='btn_sign-in']"));
        loginButton.click();
        WebElement profileUser = driver.findElement(By.xpath("//span[@title='meateka@inbox.lv']"));
        String mailUser = profileUser.getText();
        Assert.assertEquals("meateka@inbox.lv", mailUser);


    }

    @AfterClass
    public static void theEnd() {

        WebElement logoutButton = driver.findElement(By.xpath("//a[@title='Выйти']"));
        logoutButton.click();
        driver.quit();


    }

}
