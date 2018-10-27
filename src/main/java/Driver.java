import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void initialize(String browser){
        {

            if (browser.equalsIgnoreCase("Chrome"))
            {
                driver = getChromeDriver();
                return;

            }

            if (browser.equalsIgnoreCase("Safari"))
            {

                driver = getSafariDriver();
                return;

            }

            if (browser.equalsIgnoreCase("Firefox"))
            {

                driver = getFirefoxDriver();
                return;

            }

            throw new NoSuchElementException("Invalid browser name");

        }
    }

    private static WebDriver getChromeDriver() {
        ChromeDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private static WebDriver getSafariDriver() {
        return new SafariDriver();
    }

    private static WebDriver getFirefoxDriver() {
        return null;
    }


}
