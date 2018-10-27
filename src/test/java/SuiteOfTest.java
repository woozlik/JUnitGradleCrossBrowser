import org.junit.Test;

import static org.junit.Assert.*;

public class SuiteOfTest extends BaseTest {
    @Test
    public void css_locators() {
        WikiMainPage wikiMainPage = new WikiMainPage().openPage();
        wikiMainPage.searchFor("SoftWare");
        wikiMainPage.clickOnSearchButton();

        assertEquals("Software", new WikiSoftWarePage().getFirstHeading());
    }
}
