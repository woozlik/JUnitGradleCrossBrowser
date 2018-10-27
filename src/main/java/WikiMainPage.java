import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.cssSelector;

public class WikiMainPage extends BasePage {

    @FindBy(css = ("input[type='search']"))
    private WebElement search;

    @FindBy(css = ("input[id='searchButton']"))
    private WebElement searchButton;

    public WikiMainPage(){

    }

    public WikiMainPage openPage() {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        return this;
    }

    public void searchFor(String text){
        search.sendKeys("Software");
    }

    public void clickOnSearchButton() {
        searchButton.click();
        wait(3000);
    }


}
