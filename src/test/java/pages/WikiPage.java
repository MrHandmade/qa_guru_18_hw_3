package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WikiPage {
    private static final SelenideElement checkSoftAssertions = $x("//div[@id='wiki-body']");
    private static final SelenideElement clickSoftAssertions = $x("//a[text()='Soft assertions']");

    public static void checkNGoSoftAssertion(){
        checkSoftAssertions.shouldHave(Condition.text("Soft assertions")).click();
        clickSoftAssertions.shouldHave(Condition.text("Soft assertions")).click();

    }


}
