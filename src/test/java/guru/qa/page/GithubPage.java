package guru.qa.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubPage {
    private static String url = "https://github.com/selenide/selenide";
    private final SelenideElement
            clickWiki = $("#wiki-tab"),
            buttonSoftAssertions = $("[data-filterable-for=wiki-pages-filter]").$(byText("SoftAssertions")),
            textJUnit5 = $(withText("com.codeborne.selenide.junit5.SoftAssertsExtension"));

    public GithubPage openPage() {
        open(url);
        return this;
    }

    public GithubPage clickWikiTab() {
        clickWiki.click();
        return this;
    }

    public GithubPage uncoverHiddenItems() {
        $("[data-filterable-for=wiki-pages-filter]").$("[type=button]").click();
        return this;
    }

    public GithubPage clickOnSoftAssertions() {
        buttonSoftAssertions.click();
        return this;
    }

    public GithubPage checkingPage() {
        textJUnit5.shouldHave(Condition.exist);
        return this;
    }
}
