package guru.qa;

import guru.qa.page.GithubPage;
import org.junit.jupiter.api.Test;

public class TestWiki extends GithubPage {

    GithubPage gp = new GithubPage();

    @Test
    public void testPage() {
        gp.openPage();
        gp.clickWikiTab();
        gp.uncoverHiddenItems();
        gp.clickOnSoftAssertions();
        gp.checkingPage();
    }
}
