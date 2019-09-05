import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArticleTest {
    private final String URL = "http://delfi.lv";

    @Test
    public void articleTitleCheck () {
        //Set driver path
        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");

        //Open Browser
        WebDriver driver = new ChromeDriver();

        //Full Screen
        driver.manage().window().maximize();

        //Open Home Page
        driver.get(URL);

        //Find first article title
        //Save to string
        //Click on article
        //Find Title
        //Save to string
        //Check article title
        //Find comment count
        //Click on comment count
        //Find title
        //Save to string
        //Check title
        //Close browser
    }
}
