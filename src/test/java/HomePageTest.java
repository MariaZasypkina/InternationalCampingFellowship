import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.ProjectUtils;

public class HomePageTest extends ProjectUtils {

    @Test
    public void testAboutICFButton(){

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://icfconnect.net");
    driver.findElement(By.cssSelector("#menu-item-103 > a")).click();

    Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText().toUpperCase(), "ABOUT ICF");

    driver.quit();

}
}

