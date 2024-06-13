import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestIframePage {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://practice-automation.com/iframes/");
        driver.manage().window().maximize();

    }

    @Test
    public void FramePage() {
         IframePage frame = new IframePage(driver);
         frame.handlingIFramePage();
    }
}
