import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import runner.BaseTest;

public class GoogleTest extends BaseTest {

    @Test
    public void testSelenium() throws InterruptedException {

        getDriver().get("https://www.google.com/");
        WebElement textbox = getDriver().findElement(By.name("q"));   //найти поле куда вписать текст
        textbox.sendKeys("selenium\n"); //отправлять какие-то данные в этот элемент
        Thread.sleep(2000);
//        WebElement button = driver.findElement(By.name("btnK")); // находим кнопку
//        button.click();
        WebElement text = getDriver().findElement(By.xpath("//h3[text()='Selenium']"));
        Assert.assertEquals(text.getText(), "Selenium"); // сравниваем через тестнж

    }
}
