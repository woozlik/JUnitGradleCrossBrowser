import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
abstract public class BaseTest {
    Driver dr = new Driver();

    @Parameter
    public String browserName;

    @Parameters
    public static Iterable<? extends Object> data() {
        return Arrays.asList("Chrome", "Safari");
    }

    @Before
    public void before() {
        dr.initialize(browserName);
        dr.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        if (dr.getDriver() != null) {
            dr.getDriver().quit();
        }
    }
}