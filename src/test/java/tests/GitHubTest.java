package tests;

import core.BaseTest;
import org.junit.jupiter.api.Test;

import static pages.GithubMainPage.searchSelenide;
import static pages.ResultOfSearchPage.clickSelenideResult;
import static pages.SelenidePage.clickWiki;
import static pages.SoftAssertionsPage.checkExampleOfJunit5;
import static pages.WikiPage.checkNGoSoftAssertion;


public class GitHubTest extends BaseTest {
    @Test
    public void homeWork3(){
        searchSelenide();
        clickSelenideResult();
        clickWiki();
        checkNGoSoftAssertion();
        checkExampleOfJunit5();

    }
}
