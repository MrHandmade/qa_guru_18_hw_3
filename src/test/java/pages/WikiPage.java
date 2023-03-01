package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class WikiPage {
    private static final ElementsCollection checkSoftAssertions = $$x("//a[@href='/selenide/selenide/wiki/SoftAssertions']");
    private static final SelenideElement clickSoftAssertions = $x("//a[text()='Soft assertions']");
    private static final SelenideElement clickShowMorePages = $x("//button[@class='f6 Link--muted js-wiki-more-pages-link btn-link mx-auto']");

    public static void checkNGoSoftAssertion(){
        clickShowMorePages.click();
        checkSoftAssertions.first().shouldHave(Condition.text("SoftAssertions"));
        checkSoftAssertions.last().shouldHave(Condition.text("Soft assertions"));
        clickSoftAssertions.click();

    }


}
