import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class FirstTest {

    @Test
    public void testFirst() {

        //System.setProperty("webdriver.chrome.driver","/path/to/chromedriver"); для 3 версии нужно прописывать драйвер

        WebDriver driver = new ChromeDriver();      //создаем драйвер
        driver.get("https://www.selenium.dev/selenium/web/web-form.html"); // переход на тестовую страницу селениума

        String title = driver.getTitle();
        assertEquals("Web form", title);  // название закладки



        WebElement textBox = driver.findElement(By.name("my-text"));  // берем элемент с именем май текст
        WebElement submitButton = driver.findElement(By.cssSelector("button"));  // берем элемент баттон

        textBox.sendKeys("Selenium");  // в майтест записываем селениум
        submitButton.click();  // нажимаем на кнопку сабмит

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        assertEquals("Received!", value); // сообщение должно появиться

        driver.quit();
    }
}
