package loginPageTest;


import lv.inbox.Pages.BrowserFactory;
import lv.inbox.Pages.LoginPageFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InboxLoginTestPageFactory {


    @Test
    public void verifyValidLogin() {

      WebDriver driver = BrowserFactory.startBrowser("firefox", "http://www.inbox.lv/");

        LoginPageFactory login = PageFactory.initElements(driver, LoginPageFactory.class);

        login.loginToInbox("test7136", "cocacola3");

    }

}


