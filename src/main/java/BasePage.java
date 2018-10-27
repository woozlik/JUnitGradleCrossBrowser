import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    WebDriver driver;

    BasePage(){

        driver = new Driver().getDriver();
        PageFactory.initElements(driver, this);
    }


    public String getTitle(){
        return driver.getTitle();
    }

    public void wait(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
