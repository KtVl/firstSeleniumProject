import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void testSelenium() throws InterruptedException {
        WebDriver driver = new ChromeDriver(); // открываем браузер
        driver.get("https://www.google.com/");
        WebElement textbox = driver.findElement(By.name("q"));   //найти поле куда вписать текст
        textbox.sendKeys("selenium\n"); //отправлять какие-то данные в этот элемент
        Thread.sleep(2000);
//        WebElement button = driver.findElement(By.name("btnK")); // находим кнопку
//        button.click();
        WebElement text = driver.findElement(By.xpath("//h3[text()='Selenium']"));
        Assert.assertEquals(text.getText(), "Selenium"); // сравниваем через тестнж
        driver.quit(); // закрываем браузер
    }
}
