import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
    public static void main(String[] args) {
        ChromeDriver driver;
        String baseURL = "https://demo.guru99.com/selenium/newtours/";
        String actualResult = "";
        String expectedResult= "Welcome: Mercury Tours";
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get(baseURL);
        actualResult = driver.getTitle();

        System.out.println(actualResult.equals(expectedResult)?"PASSED: " + actualResult : "FALLED: " + actualResult);

        driver.quit();
    }
}
