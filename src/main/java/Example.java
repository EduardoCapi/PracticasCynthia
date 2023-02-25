import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example {
    ChromeDriver driver;
    String baseURL = "https://demo.guru99.com/selenium/newtours/";
    String actualResult = "";
    String expectedResult= "Welcome: Mercury Tours";

    @BeforeClass
    public void declaracionVariables(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void prueba1() {
        driver.get(baseURL);
        actualResult = driver.getTitle();
    }

    @AfterClass
    public void configuraciónFinal(){
        System.out.println(actualResult.equals(expectedResult)?"PASSED: " + actualResult : "FALLED: " + actualResult);
        driver.quit();
    }
}
