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
    private final By COMMENT_PAGE_TITLE = By.xpath(".//h1[@class='article-title']/a");
    private final By ARTICLE = By.xpath(".//span[@class = 'text-size-22 d-block']");

    @Test
    public void titleAndCommentsTest() {
        //Set driver path
        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Open Delfi Home Page
        driver.get("http://rus.delfi.lv");

        //Find 1st article
        WebElement article = driver.findElements(ARTICLE).get(0);

        //Find 1st article title
        WebElement homePageTitle = article.findElement(HOME_PAGE_TITLE);

        //Save to string
        String titleToCompare = homePageTitle.getText();

        //Find comments count
        Integer commentsToCompare = 0;

        if (!article.findElements(HOME_PAGE_COMMENTS).isEmpty()) { // ! не пустой ли список

            WebElement homePageComments = article.findElement(HOME_PAGE_COMMENTS);

            //Save to Integer
            String commentsToParse = homePageComments.getText(); //(1)
            commentsToParse = commentsToParse.substring(1, commentsToParse.length() - 1);
            commentsToCompare = Integer.valueOf(commentsToParse); //переделывает стринг в интеджер и подает в левую часть
        }

        //Open Article page
        homePageTitle.click();

        //Find Title
        String apTitle = driver.findElement(ARTICLE_PAGE_TITLE).getText(); // .toLowerCase or .toUpperCase

        //Check Title
        Assertions.assertEquals(titleToCompare,apTitle,"Wrong title on article page!");

        //Find comments count
        Integer apComments = Integer.valueOf(driver.findElement(ARTICLE_PAGE_COMMENTS).getText().substring(1, driver.findElement(ARTICLE_PAGE_COMMENTS).getText().length() - 1 ));

        //Check comment count
        Assertions.assertEquals(commentsToCompare, apComments, "Comments count is not same as on Home Page!");

        //Open comments page
        driver.findElement(ARTICLE_PAGE_COMMENTS).click();

        //Find title
        String cpTitle = driver.findElement(COMMENT_PAGE_TITLE).getText();

        //Check title
        Assertions.assertEquals(titleToCompare, cpTitle, "cpTitle not compare!");

        //Get comment count


        //findElements().get(3)
        //title 1 (1) 0
        //title 2 (2) 1
        //title 3 (3) 2
        //title 4 (4) 3
        //title 5 (5) 4

        //Check comment count
        //Close browser
    }
}
// 1 доделать проверку комментариев на странице комментариев
// 2 во всех остальных комментариях предусмотреть что нет комментариев
// 3 сделать так чтоб тест работал