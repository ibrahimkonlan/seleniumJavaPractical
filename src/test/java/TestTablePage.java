import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTablePage {

    WebDriver driver;

    @BeforeTest
    public void BeforeTest(){
        driver = new ChromeDriver();
        driver.get("https://practice-automation.com/tables/");
        driver.manage().window().maximize();

    }
   @Test
    public void TablePage() throws InterruptedException {
    TablePage oranges = new TablePage(driver);
    oranges.TableName();



   }
}
