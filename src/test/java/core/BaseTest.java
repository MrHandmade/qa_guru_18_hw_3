package core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeAll
    public static void setUp(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.screenshots = false;
        Configuration.headless = false;
        Configuration.savePageSource = false;
        Configuration.holdBrowserOpen = false;

        Selenide.open("https://github.com/");



    }

}
