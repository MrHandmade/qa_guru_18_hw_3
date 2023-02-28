package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SelenidePage {
    private static final SelenideElement wikiPage = $x("//a[@id='wiki-tab']");
    public static void clickWiki(){
        wikiPage.click();

    }
}
