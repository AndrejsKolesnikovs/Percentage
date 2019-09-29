import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelfiArticleTest {

    private final By HOME_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-22')]");
    private final By HOME_PAGE_COMMENTS = By.xpath(".//a[@class = 'comment-count text-red-ribbon']");
    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[contains(@class,'text-size-md-30')]");
    private final By ARTICLE_PAGE_COMMENTS = By.xpath(".//a[contains(@class,'text-size-md-28')]");

    @Test
    public void titleAndCommentsTest() {
        //Set driver path
        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Open Delfi Home Page
        driver.get("http://rus.delfi.lv");

        //Find 1st article title
        WebElement homePageTitle = driver.findElement(HOME_PAGE_TITLE);

        //Save to string
        String titleToCompare = homePageTitle.getText();

        //Find comments count
        WebElement homePageComments = driver.findElement(HOME_PAGE_COMMENTS);

        //Save to Integer
        String commentsToParse = homePageComments.getText(); //(1)
        commentsToParse = commentsToParse.substring(1, commentsToParse.length() - 1);
        Integer commentsToCompare = Integer.valueOf(commentsToParse); //переделывает стринг в интеджер и подает в левую часть

        //Open Article page
        homePageTitle.click();

        //Find Title
        String apTitle = driver.findElement(ARTICLE_PAGE_TITLE).getText(); // .toLowerCase or .toUpperCase

        //Check Title
        Assertions.assertEquals(titleToCompare,apTitle,"Wrong title on article page!");

        //Find comments count
        

        //Check comment count
        //Open comments page
        //Find title
        //Check title
        //Get comment count
        //Check comment count
        //Close browser
    }
}
