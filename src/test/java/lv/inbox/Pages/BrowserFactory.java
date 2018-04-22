package lv.inbox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserName, String url){

        if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
            driver = new FirefoxDriver();


        }

        else if(browserName.equals("chrome")){

            driver = new ChromeDriver();

        }

        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }

}
