import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestIframePage {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice-automation.com/iframes/");


    }

    @Test
    public void FramePage() throws InterruptedException {
         IframePage myFrame = new IframePage(driver);
         myFrame.SelectIFramePage1();
         myFrame.handlingIFramePage();
         myFrame.subscribeIFramePage();
    }
}
