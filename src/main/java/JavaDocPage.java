public class JavaDocPage extends BasePage {
    String baseUrl = "http://static.javadoc.io/org.testng/testng/6.11/org/testng/AssertJUnit.html";


    public JavaDocPage(){

    }

    public JavaDocPage open() {
        driver.get(baseUrl);
        return this;
    }
}
