import static org.openqa.selenium.By.cssSelector;

public class WikiSoftWarePage extends BasePage {

    public WikiSoftWarePage(){

    }

    public String getFirstHeading() {
        return driver.findElement(cssSelector("h1[id='firstHeading']")).getText();
    }
}
