import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestWindowsPage {

    WebDriver driver;

    @BeforeClass
    public  void beforeTest(){
        driver = new ChromeDriver();
        driver.get("https://practice-automation.com/window-operations/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }
    @Test
    public  void WindowPage() throws InterruptedException {
    WindowsPage newTab = new WindowsPage(driver);
    newTab.NewTab();
    newTab.ReplaceWindow();
    //newTab.NewWindow();
    }
    @AfterClass
    public  void afterTest(){
        driver.quit();
    }
}
