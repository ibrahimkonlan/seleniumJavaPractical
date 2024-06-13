import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDownloadFilePage {
    WebDriver driver;

    @BeforeClass
    public  void beforeTest(){
        driver = new ChromeDriver();
        driver.get("https://practice-automation.com/file-download/");
        driver.manage().window().maximize();
    }
    @Test
    public void TestDownload(){
        DownloadFilePage dlp = new DownloadFilePage(driver);
        dlp.getDownload_File();

    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
