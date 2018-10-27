import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SuiteAmazonTest extends BaseTest {
    @Test
    public void amazonTitleTest() {
        AmazonMainPage amazonMainPage = new AmazonMainPage();
        amazonMainPage.openAmazone();
        amazonMainPage.navigateToGiftCardPage();

        assertTrue(amazonMainPage.getTitle().contains("Gift Card"));
    }

    @Test
    public void searchMethodInJavaDoc() {
        String expectedTitle = "AssertJUnit";

        JavaDocPage javaDocPage = new JavaDocPage();
        javaDocPage.open();

        assertEquals(expectedTitle, javaDocPage.getTitle());
    }
}