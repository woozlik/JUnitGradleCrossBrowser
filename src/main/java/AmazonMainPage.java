import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonMainPage extends BasePage {
    private String baseUrl = "https://www.amazon.com/";

    @FindBy(xpath = "//div[@id ='nav-xshop']/a[contains(text(), 'Gift Cards')]")
    private WebElement giftCardLink;

    public AmazonMainPage(){

    }

    public void openAmazone(){
        driver.get(baseUrl);
    }

    public AmazoneGiftCardPage navigateToGiftCardPage() {
        giftCardLink.click();
        return new AmazoneGiftCardPage();
    }
}
