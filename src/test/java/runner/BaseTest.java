package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    private WebDriver driver;



    @BeforeMethod
    protected void beforeMethod(){
        driver = new ChromeDriver(); // открываем браузер
    }

    @AfterMethod
    protected void afterMethod() {
        driver.quit(); // закрываем браузер
    }
    protected WebDriver getDriver() {
        return driver;
    }
}
