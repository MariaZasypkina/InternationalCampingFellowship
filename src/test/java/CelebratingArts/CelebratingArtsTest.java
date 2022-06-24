package CelebratingArts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CelebratingArtsTest {
    @Test
    public void testTeachersButton(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.celebratingart.com/");
        driver.findElement(By.xpath("//a[@id = 'teachers_154_147']")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText().toUpperCase(), "TEACHERS");

        driver.quit();

    }

    @Test
    public void testVideoPayerLikeClick() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.celebratingart.com/");
        driver.findElement(By.xpath("//a[@id='students_155_147']")).click();

        WebElement videoPlayer = driver.findElement(By.xpath("//div[@id='video-1']"));
        new Actions(driver).moveToElement(videoPlayer).perform();

        driver.findElement(By.xpath("//button[contains(@aria-label, 'Like')]")).click();

        driver.manage().wait(200);

        driver.quit();

    }



}
