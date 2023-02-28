package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import core.BaseTest;

import static com.codeborne.selenide.Selenide.$x;

public class GithubMainPage extends BaseTest {
    private static final SelenideElement searchField = $x("//input[@placeholder='Search GitHub']");
    private static final SelenideElement choiceSelenide = $x("//a[@href='https://github.com/search?q=Selenide']");

    public static void searchSelenide(){

        searchField.sendKeys("Selenide");
        choiceSelenide.click();
    }
}
