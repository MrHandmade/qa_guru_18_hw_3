package pages;


import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$x;

public class ResultOfSearchPage {
    private static final SelenideElement selenideResult = $x("//a[@href='/selenide/selenide']");

    public static void clickSelenideResult(){
        selenideResult.click();

    }
}
